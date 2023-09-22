package demo;

import mtnm.tmforum.org.emsSession.EmsSession_I;
import mtnm.tmforum.org.globaldefs.ProcessingFailureException;
import nttdata.processors.nce.FlowWriter;
import org.omg.CORBA.IntHolder;
import org.omg.CosEventChannelAdmin.AlreadyConnected;
import org.omg.CosEventChannelAdmin.TypeError;
import org.omg.CosEventComm.Disconnected;
import org.omg.CosNotification.EventType;
import org.omg.CosNotification.StructuredEvent;
import org.omg.CosNotifyChannelAdmin.AdminLimitExceeded;
import org.omg.CosNotifyChannelAdmin.ClientType;
import org.omg.CosNotifyChannelAdmin.ConsumerAdmin;
import org.omg.CosNotifyChannelAdmin.EventChannel;
import org.omg.CosNotifyChannelAdmin.EventChannelHolder;
import org.omg.CosNotifyChannelAdmin.InterFilterGroupOperator;
import org.omg.CosNotifyChannelAdmin.ProxySupplier;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplier;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper;
import org.omg.CosNotifyComm.InvalidEventType;
import org.omg.CosNotifyComm.StructuredPushConsumer;
import org.omg.CosNotifyComm.StructuredPushConsumerPOA;
import org.omg.CosNotifyFilter.ConstraintExp;
import org.omg.CosNotifyFilter.Filter;
import org.omg.CosNotifyFilter.InvalidConstraint;
import org.omg.CosNotifyFilter.InvalidGrammar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import org.jacorb.orb.ORB;

/**
 *
 * get events from event channel
 *
 */
public class AlarmReciever {
    private static final Logger logger = LoggerFactory.getLogger(AlarmReciever.class);
    private StructuredPushConsumer structuredPushConsumer;
    private EventChannel eventChannel;
    private ConsumerAdmin consumerAdmin;
    private StructuredProxyPushSupplier proxyPushSupplier;
    private EmsSession_I emsSession_I;
    private FlowWriter fW;
    // ORB object
    private org.omg.CORBA.ORB orb = null;
    public AlarmReciever(org.jacorb.orb.ORB orb, EmsSession_I emsSession, FlowWriter fW) {
        this.orb = orb;
        this.emsSession_I = emsSession;
        this.fW = fW;
    }
    public void activate() {
        EventChannelHolder eventChannelHolder = new EventChannelHolder();
        try {
            emsSession_I.getEventChannel(eventChannelHolder);
        } catch (ProcessingFailureException e) {
            e.printStackTrace();
            return;
        }
        eventChannel = eventChannelHolder.value;
// get consumer consumerAdmin
        try {
            IntHolder adminID = new IntHolder();
            consumerAdmin = eventChannel.new_for_consumers(
                    InterFilterGroupOperator.AND_OP, adminID);
        } catch (Exception e) {
            consumerAdmin = null;
            e.printStackTrace();
            return;
        }
        EventType eventTypeAdd[] = new EventType[2];
        eventTypeAdd[0] = new EventType();
        eventTypeAdd[1] = new EventType();
// subscript only NT_ALARM and NT_HEARTBEAT type events
        eventTypeAdd[0].domain_name = "tmf_mtnm";
        eventTypeAdd[0].type_name = "NT_ALARM";
        eventTypeAdd[1].domain_name = "tmf_mtnm";
        eventTypeAdd[1].type_name = "NT_HEARTBEAT";
        EventType eventTypeRemove[] = new EventType[0];
        try {
            logger.info("subscript alarm");
            consumerAdmin.subscription_change(eventTypeAdd, eventTypeRemove);
        } catch (InvalidEventType e) {
            e.printStackTrace();
            logger.error("Failed to set subscription_change.");
            return;
        }
        consumerAdmin.remove_all_filters();
        try {
            EventType alarmEventTypes[] = new EventType[1];
            alarmEventTypes[0] = new EventType();
            alarmEventTypes[0].domain_name = "tmf_mtnm";
            alarmEventTypes[0].type_name = "NT_ALARM";
            ConstraintExp[] alarmExps = new ConstraintExp[2];
// filter the alarm which perceivedSeverity is PS_CRITICAL or
// PS_CLEARED.
            alarmExps[0] = new ConstraintExp(alarmEventTypes,
                    //"($perceivedSeverity == 2) or ($perceivedSeverity == 5)"
                    "1 == 1");
// filter the alarm which serviceAffecting is not
// SA_NON_SERVICE_AFFECTING.
            alarmExps[1] = new ConstraintExp(alarmEventTypes,
                    //"$X733_EventType == 'equipmentAlarm'"
                    "1 == 1");
            Filter alarmFilter = eventChannel.default_filter_factory()
                    .create_filter("TCL");
            alarmFilter.add_constraints(alarmExps);
            consumerAdmin.add_filter(alarmFilter);
            EventType htEventTypes[] = new EventType[1];
            htEventTypes[0] = new EventType();
            htEventTypes[0].domain_name = "tmf_mtnm";
            htEventTypes[0].type_name = "NT_HEARTBEAT";
            ConstraintExp[] htExps = new ConstraintExp[1];
// filter all heart beat
            htExps[0] = new ConstraintExp(htEventTypes, "1 == 1");
            Filter heartbeatFilter = eventChannel.default_filter_factory()
                    .create_filter("TCL");
            heartbeatFilter.add_constraints(htExps);
            consumerAdmin.add_filter(heartbeatFilter);
        } catch (InvalidGrammar e1) {
            e1.printStackTrace();
        } catch (InvalidConstraint e) {
            e.printStackTrace();
        }
// create and implicitly activate the client
        structuredPushConsumer = (StructuredPushConsumer) new Consumer()._this(orb);
// get the structured proxy push supplier
        ClientType clientType = ClientType.STRUCTURED_EVENT;
        org.omg.CORBA.IntHolder proxyId = new org.omg.CORBA.IntHolder(0);
        ProxySupplier proxySupplier = null;
        try {
            proxySupplier = consumerAdmin.obtain_notification_push_supplier(
                    clientType, proxyId);
        } catch (AdminLimitExceeded e) {
            e.printStackTrace();
            logger.error(" Failed to obtain notification_push_supplier.");
            return;
        }
        proxyPushSupplier = StructuredProxyPushSupplierHelper
                .narrow(proxySupplier);
// connect structuredPushConsumer to the event channel
        try {
            proxyPushSupplier
                    .connect_structured_push_consumer(structuredPushConsumer);
            logger.info("Succeed to connect structuredPushConsumer to the event channel.");
        } catch (AlreadyConnected e) {
            e.printStackTrace();
            logger.error("Failed to connect to structuredPushConsumer to the event channel.");
        } catch (TypeError e) {
            e.printStackTrace();
            logger.error("Failed to connect to structuredPushConsumer to the event channel.");
        }
    }
    public  void log(String log) {
        System.out.println(log);
    }
    class Consumer extends StructuredPushConsumerPOA {
        public void disconnect_structured_push_consumer() {
            logger.info("Consumer disconnect_structured_push_consumer.");
        }
        public void push_structured_event(StructuredEvent event)
                throws Disconnected {
// print received event
            String[] event_string = new String[event.filterable_data.length + 1];
            log("<+++>");
            log("event_type=" + event.header.fixed_header.event_type.type_name);
            for (int i = 0; i < event.filterable_data.length; i++) {
                if (null == event.filterable_data[i]) {
                    continue;
                }
                log(event.filterable_data[i].name + "="
                        + Util.parseAny(event.filterable_data[i].value));
                //logger.info("Lili->"+event.filterable_data[i].value.type().kind().value());
                String event_value=Util.parseAny(event.filterable_data[i].value);
                if (!event_value.startsWith("{")){
                    event_string[i] = "\"" + event.filterable_data[i].name + "\": \"" +event_value + "\"";
                }
                else
                    event_string[i] = "\"" + event.filterable_data[i].name + "\":" + event_value ;

            }
            log("<--->");

            event_string[event.filterable_data.length] = "\"event_type\": \"" + event.header.fixed_header.event_type.type_name + "\"";
            String event_json =Arrays.toString(event_string).replace("[", "{").replace("]", "}").replace("\n", "");
            fW.writeFlowFile(event_json);
        }
        public void offer_change(EventType[] eventTypeArray,
                                 EventType[] eventTypeArray1) throws InvalidEventType {
            for(int i=0;i<eventTypeArray.length;i++){
                logger.info(eventTypeArray[i].type_name);
            }
        }
    }
}
