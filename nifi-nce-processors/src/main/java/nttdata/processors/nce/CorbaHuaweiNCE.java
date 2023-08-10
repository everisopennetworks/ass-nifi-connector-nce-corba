/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nttdata.processors.nce;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import demo.AlarmReciever;
import demo.Client;
import demo.TANmsSession_IImpl;
import mtnm.tmforum.org.common.Common_IHolder;
import mtnm.tmforum.org.emsMgr.EMSMgr_I;
import mtnm.tmforum.org.emsMgr.EMSMgr_IHelper;
import mtnm.tmforum.org.emsSession.EmsSession_I;
import mtnm.tmforum.org.emsSession.EmsSession_IHolder;
import mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THolder;
import mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_I;
import mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_IHelper;
import mtnm.tmforum.org.nmsSession.NmsSession_I;
import mtnm.tmforum.org.nmsSession.NmsSession_IPOA;
import mtnm.tmforum.org.notifications.EventIterator_IHolder;
import mtnm.tmforum.org.notifications.EventList_THolder;
import mtnm.tmforum.org.notifications.PerceivedSeverity_T;
import org.apache.nifi.annotation.lifecycle.OnStopped;
import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.components.Validator;
import org.apache.nifi.annotation.behavior.ReadsAttribute;
import org.apache.nifi.annotation.behavior.ReadsAttributes;
import org.apache.nifi.annotation.behavior.WritesAttribute;
import org.apache.nifi.annotation.behavior.WritesAttributes;
import org.apache.nifi.annotation.lifecycle.OnScheduled;
import org.apache.nifi.annotation.lifecycle.OnUnscheduled;
import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.SeeAlso;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.processor.exception.ProcessException;
import org.apache.nifi.processor.AbstractSessionFactoryProcessor;
import org.apache.nifi.processor.ProcessContext;
import org.apache.nifi.processor.ProcessSessionFactory;
import org.apache.nifi.processor.ProcessorInitializationContext;
import org.apache.nifi.processor.Relationship;
import org.apache.nifi.processor.util.StandardValidators;

import org.jacorb.orb.util.CorbaLoc;
import org.omg.CosNaming.NameComponent;
import org.omg.DynamicAny.DynAnyFactory;
import org.omg.DynamicAny.DynAnyFactoryHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Tags({"CORBA", "OMG", "Huawei", "Object Management", "Broker"})
@CapabilityDescription("OMG CORBA processor for Huawei devices.")
@SeeAlso({})
@ReadsAttributes({@ReadsAttribute(attribute="", description="")})
@WritesAttributes({@WritesAttribute(attribute="", description="")})

public class CorbaHuaweiNCE extends AbstractSessionFactoryProcessor {

    private final Logger logger = LoggerFactory.getLogger(CorbaHuaweiNCE.class);
	
    public static final Validator CUST_PORT_VALIDATOR = StandardValidators.createLongValidator(0, 32635, true);

    public static final PropertyDescriptor NSIP = new PropertyDescriptor
            .Builder().name("NSIP")
            .displayName("NSIP")
            .description("Naming service IP")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor NSPort = new PropertyDescriptor
            .Builder().name("NSPort")
            .displayName("NSPort")
            .description("Naming service port. The port has to be an integer number between 0 and 32635")
            .required(true)
            .addValidator(CUST_PORT_VALIDATOR)
            .build();

    public static final PropertyDescriptor userName = new PropertyDescriptor
            .Builder().name("userName")
            .displayName("Username")
            .description("UserName for the Corba interface")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor passWord = new PropertyDescriptor
            .Builder().name("passWord")
            .displayName("Password")
            .description("Password for the Corba interface")
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .required(false)
            .sensitive(true)
            .build();

    public static final PropertyDescriptor SSL_CERT = new PropertyDescriptor
            .Builder().name("SSL_CERT")
            .displayName("SSL Certstore")
            .description("Path to the certstore in case of SSL connection")
            .required(false)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor IOR = new PropertyDescriptor
            .Builder().name("IOR")
            .displayName("IOR")
            .description("Corba server IOR")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();
    public static final PropertyDescriptor emsInstance = new PropertyDescriptor
            .Builder().name("emsInstance")
            .displayName("Ems Instance")
            .description("Corba EMS Instance name")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor emsPort = new PropertyDescriptor
            .Builder().name("emsPort")
            .displayName("Local Port")
            .description("Corba Local Port")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();
    public static final Relationship SUCCESS = new Relationship.Builder()
            .name("SUCCESS")
            .description("Final relationship")
            .build();

    private List<PropertyDescriptor> descriptors;

    private Set<Relationship> relationships;

    private AtomicBoolean initialized = new AtomicBoolean(false);

    @Override
    protected void init(final ProcessorInitializationContext context) {
        final List<PropertyDescriptor> descriptors = new ArrayList<PropertyDescriptor>();
        descriptors.add(NSIP);
        descriptors.add(NSPort);
        descriptors.add(userName);
        descriptors.add(passWord);
        descriptors.add(SSL_CERT);
        descriptors.add(IOR);
        descriptors.add(emsInstance);
        descriptors.add(emsPort);
        this.descriptors = Collections.unmodifiableList(descriptors);

        final Set<Relationship> relationships = new HashSet<Relationship>();
        relationships.add(SUCCESS);
        this.relationships = Collections.unmodifiableSet(relationships);
    }

    @Override
    public Set<Relationship> getRelationships() {
        return this.relationships;
    }

    @Override
    public final List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return descriptors;
    }

    @OnScheduled
    public void onScheduled(final ProcessContext context) {
        logger.info("CorbaHuaweiNCE OnScheduled");
    }

    @OnUnscheduled
    public void onUnscheduled(final ProcessContext context) {



            logger.info("CorbaENM onUnscheduled");
            Client.getInstance().shutdown();
            initialized.set(false);
            logger.info("CorbaENM connection closed");
            logger.info("CORBAProcessorHUAWEI onUnscheduled");
    }

    @OnStopped
    public void alternateshutdown(final ProcessContext context) {


        onUnscheduled(context);
    }

    @Override
    public void onTrigger(final ProcessContext context, final ProcessSessionFactory sessionFactory) throws ProcessException {
        if (!initialized.get()) {
            logger.info("CorbaHuaweiNCE OnTrigger");
            FlowWriter.initWriter(context, sessionFactory, SUCCESS);

            String[] innerArgs = new String[7];
            innerArgs[0] = context.getProperty(NSIP).getValue();
            String nsip = context.getProperty(NSIP).getValue();
            innerArgs[1] = context.getProperty(NSPort).getValue();
            String nsport = context.getProperty(NSPort).getValue();
//            int nsport = Integer.parseInt(context.getProperty(NSPort).getValue());
            innerArgs[2] = context.getProperty(userName).getValue();
            String username = context.getProperty(userName).getValue();
            innerArgs[3] = context.getProperty(passWord).getValue();
            String password = context.getProperty(passWord).getValue();
            innerArgs[4] = context.getProperty(SSL_CERT).getValue();
            String certstore = context.getProperty(SSL_CERT).getValue();
            innerArgs[5] = context.getProperty(IOR).getValue();
            String ior = context.getProperty(IOR).getValue();
            innerArgs[6] = context.getProperty(emsInstance).getValue();
            String emsinstance = context.getProperty(emsInstance).getValue();
            String ior_remote = context.getProperty(IOR).getValue();
            String enmport=context.getProperty(emsPort).getValue();
            if (innerArgs.length < 7) {
                logger.warn("usage: java demo.Client 10.71.227.152 12001 admin test1234 IOR:XXX Huawei/NCE");
                return;
            }
            else {
            logger.info("-------------------------------------------------------");
            logger.info("Naming service IP: " + innerArgs[0]);
            logger.info("Naming service port: " + innerArgs[1]);
            logger.info("EMS user name : " + innerArgs[2]);
            logger.info("EMS port : " +enmport);
            logger.info("-------------------------------------------------------");

            int exec = Client.getInstance().connect(nsip, nsport, username, password, certstore, ior, emsinstance,enmport);
            if (exec == 1) {
                logger.info("********************************************************************************************************");
                logger.info("Finished NMS init");
                logger.info("********************************************************************************************************");
                initialized.set(true);
            }
            else {
                initialized.set(false);
                logger.info("Corba connection failed");
            }
            }
            logger.info("CorbaHuaweiNCE OnTrigger End");
            logger.info("Connection active: " + initialized);
        }
    }
}
