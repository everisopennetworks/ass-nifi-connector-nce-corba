package demo;
/**
 * NCE CORBA interface client program demo
 */
//Common java data type import
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
//import org.jacorb.orb.ORB;
import nttdata.processors.nce.CorbaHuaweiNCE;
import nttdata.processors.nce.FlowWriter;
import org.jacorb.orb.util.CorbaLoc;
import org.omg.CORBA.*;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CosNaming.BindingListHolder;
import org.omg.CosNaming.NameComponent;
import org.omg.DynamicAny.DynAnyFactory;
import org.omg.DynamicAny.DynAnyFactoryHelper;

import java.applet.Applet;
import java.io.File;
import java.security.KeyStore;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client  {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private Client() {
    }
    private static Client instance = new Client();
    public static Client getInstance() {
        return instance;
    }
    //ORB object
    private static org.jacorb.orb.ORB orb = null;
    //POA object reference
    private static org.omg.PortableServer.POA rootPOA = null;
    //emsSeesion object
    private static EmsSession_I emsSession = null;
    //dynamic any factory,  for translating any type to dynamic any type
    private static DynAnyFactory dynAnyFactory = null;
    private static FlowWriter fWw = new FlowWriter();
    public static void log(String str) {
        System.out.println(str);
    }
    //
    public static void main(String[] args) {
        if(args.length<6){
            logger.warn("usage: java demo.Client 10.71.227.152 12001 admin test1234 IOR:XXX Huawei/NCE");
            return;
        }
        logger.info("X-------------------------------------------------------X");
        logger.info("Naming service IP: " + args[0]);
        logger.info("Naming service port: " + args[1]);
        logger.info("EMS user name : " + args[2]);
        logger.info("Password for user " + args[2] + " : " + args[3]);
        logger.info("X-------------------------------------------------------X");
        try {
            Client.getInstance().connect(args[0], args[1], args[2], args[3], args[4], args[5], args[6],args[7],fWw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * NSIP: naming service IP
     * NSPort: naming service port
     * userName: an EMS user name
     * passWord: the password for a specified EMS user
     * port: port test
     */
    public  int
    connect(String NSIP, String NSPort,String userName, String passWord, String ruta, String IOR, String EMSInstance,String port, FlowWriter fW)  throws Exception {
        int exec = 0;
        try {
//initialize ORB parameters
//            String IOR="IOR:010000002b00000049444c3a6f6d672e6f72672f436f734e616d696e672f4e616d696e67436f6e746578744578743a312e30000001000000000000009c000000010102000e00000031302e33342e3133352e32343600e12e3a00000014010f004e55500000001c0000000001000000526f6f74504f41004e616d65536572766963650000000000010000004e616d6553657276696365000003000000000000000800000001000000004f4154010000001800000001000000010001000100000001000105090101000000000014000000080000000100a6008600f155";
            String argv[] = new String[2];
            argv[0] = "-ORBInitDef";
            //argv[1] = "NameService=corbaloc:ssliop:1.2@" + NSIP + ":" + NSPort+ "/%14%01%0F%00NUP%00%00%00%1C%00%00%00%00%01%00%00%00RootPOA%00NameService%00%00%00%00%00%01%00%00%00NameService";
            argv[1] = "NameService="+IOR;

//The step 1: initialize ORB

            org.omg.CORBA.Object rootobj = null;
            Properties props = new Properties();

            props.setProperty("jacorb.security.support_ssl", "on");
            props.setProperty("jacorb.ssl.socket_factory","org.jacorb.security.ssl.sun_jsse.SSLSocketFactory");
            props.setProperty("jacorb.ssl.server_socket_factory","org.jacorb.security.ssl.sun_jsse.SSLServerSocketFactory");
            //props.setProperty("jacorb.security.keystore_type", "JKS");
            props.setProperty("jacorb.security.jsse.server.key_manager_algorithm","SunX509");
            props.setProperty("jacorb.security.jsse.server.trust_manager_algorithm","SunX509");
            props.setProperty("jacorb.security.jsse.client.key_manager_algorithm","SunX509");
            props.setProperty("jacorb.security.jsse.client.trust_manager_algorithm","SunX509");
            //props.setProperty("jacorb.security.ssl.client.supported_options","40");
            //props.setProperty("jacorb.security.ssl.client.required_options","40");
            //props.put("jacorb.security.ssl.server.supported_options","C6");
            //props.put("jacorb.security.ssl.server.required_options","86");
            props.setProperty("jacorb.security.ssl.client.supported_options","60");
            props.setProperty("jacorb.security.ssl.client.required_options","60");
            props.setProperty("jacorb.security.ssl.server.supported_options","60");
            props.setProperty("jacorb.security.ssl.server.required_options","60");

            props.setProperty("jacorb.security.keystore",ruta);
            props.setProperty("jacorb.security.keystore_user", "1");
            props.setProperty("jacorb.security.keystore_password","changeit");
            props.setProperty("jacorb.security.truststore",ruta);
            //props.setProperty("jacorb.security.truststore_user","trustcer");
            props.setProperty("jacorb.security.truststore_user","bundle");
            props.setProperty("jacorb.security.truststore_password","changeit");
            props.setProperty("jacorb.security.jsse.trustees_from_ks", "on");
            //props.setProperty("org.omg.CORBA.ORBServerPort", port);
            //props.setProperty("org.omg.CORBA.ORBListenEndpoints", "iiop://localhost:"+port);
            props.setProperty("OASSLPort", port);

            props.setProperty("org.omg.CORBA.ORBInitialHost", NSIP);
            props.setProperty("org.omg.CORBA.ORBInitialPort", NSPort);
            //props.setProperty("ORBInitRef.NameService","corbaloc:ssliop:1.2@" + NSIP + ":" + NSPort+ "/NameService");
            props.setProperty("ORBInitRef.NameService",IOR);
            //props.setProperty("ORBInitRef.NameService","corbaloc:ssliop:1.2@" + NSIP + ":" + NSPort+ "/%14%01%0F%00NUP%00%00%00%1C%00%00%00%00%01%00%00%00RootPOA%00NameService%00%00%00%00%00%01%00%00%00NameService");


            this.orb = (org.jacorb.orb.ORB) org.jacorb.orb.ORB.init(argv, props);

            //orb = ORB.init(new String[0], props);



            String corbaLoc =  CorbaLoc.generateCorbalocForMultiIIOPProfiles(orb,IOR);

            logger.info("The step 1: initialize ORB successfully!");
//The step 2: get RootPOA
            rootPOA = org.omg.PortableServer.POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            logger.info("The step 2: get RootPOA successfully!");
//the step 3: construct dynamic any factory
            dynAnyFactory = DynAnyFactoryHelper.narrow(orb
                    .resolve_initial_references("DynAnyFactory"));
            logger.info("the step 3: construct dynamic any factory."
                    + (dynAnyFactory!= null ? "successfully!" : "failed!"));
//The step 4: get naming service root object reference
            org.omg.CosNaming.NamingContextExt nc = org.omg.CosNaming.NamingContextExtHelper
                    .narrow(orb.resolve_initial_references("NameService"));
            logger.info("The step 4: get naming service root object refrence successfully!");
//The step 5: get EmsSessionFactory_I object reference from naming service
//construct EmsSessionFactory_I NameComponent,please get it's parameters from HuaWei
            org.omg.CosNaming.NameComponent[] name;
            name = new NameComponent[5];
            name[0] = new NameComponent("TMF_MTNM", "Class");
            name[1] = new NameComponent("HUAWEI", "Vendor");
            name[2] = new NameComponent(EMSInstance, "EmsInstance");
            name[3] = new NameComponent("2.0", "Version");
            name[4] = new NameComponent(EMSInstance, "EmsSessionFactory_I");
            EmsSessionFactory_I EmsSessionFactory = null;

            try {
                EmsSessionFactory = EmsSessionFactory_IHelper.narrow(nc.resolve(name));
                logger.info("The step 5: get EmsSessionFactory_I object refrence from naming service successfully!");
            } catch (Exception ex) {
                logger.error("The step 5: get EmsSessionFactory_I object refrence from naming service failed! \n please confirm NCE CORBA is running and EMS name!");
                ex.printStackTrace();
                throw ex;
            }
//get emsSession
            NmsSession_IPOA pNmsSessionServant = new TANmsSession_IImpl();
            NmsSession_I NmsSession =  pNmsSessionServant._this(orb);
//The step 6: invoke getEmsSession interface to login NCE CORBA
            EmsSession_IHolder emsSessionInterfaceHolder = new EmsSession_IHolder();
            try {
                EmsSessionFactory.getEmsSession(userName, passWord, NmsSession,emsSessionInterfaceHolder);
                emsSession = emsSessionInterfaceHolder.value;
                logger.info("The step 6: invoke getEmsSession interface to login NCE CORBA successfully!");
            } catch (Exception ex) {
                logger.error("The step 6: invoke getEmsSession interface to login NCE CORBA failed!");
                logger.error(ex.getLocalizedMessage());
                ex.printStackTrace();
                throw ex;
            }
//get and list all supported Managers
            logger.info("The step 7: list all supported Managers:");
            managerNames_THolder managerNames_Holder = new managerNames_THolder();
            emsSession.getSupportedManagers(managerNames_Holder);
            for (int i = 0; i < managerNames_Holder.value.length; i++) {
                logger.info("EmsManagerName[" + i + "] " + managerNames_Holder.value[i]);
            }
// query alarm
            Common_IHolder mgrInterface = new Common_IHolder();
            emsSession.getManager("EMS", mgrInterface);
            EMSMgr_I emsmgr = EMSMgr_IHelper.narrow(mgrInterface.value);
            String[] excludeProbCauseList = new String[0];
            PerceivedSeverity_T[] excludeSeverityList = new PerceivedSeverity_T[0];
            EventList_THolder eventList = new EventList_THolder();
            EventIterator_IHolder eventIt = new EventIterator_IHolder();
            emsmgr.getAllEMSAndMEActiveAlarms(excludeProbCauseList, excludeSeverityList, 1000, eventList, eventIt);
            logger.info("The step 8: query alarm successfully!");
            logger.info("The step 9: try to connect structuredPushConsumer to the event channel.");
//get alarms from EventChannel
            new AlarmReciever(orb,emsSession,fW).activate();
            orb.run();
            logger.info("AlarmReceiever active.");
            exec = 1;
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        }
        return exec;
    }
    public static void listen(){
//get alarms from EventChannel
        new AlarmReciever(orb,emsSession,fWw).activate();
        orb.run();
        logger.info("AlarmReceiever listening.");
    }
    /**
     *   Getter function, return dynAnyFactory
     */
    public static DynAnyFactory getDynAnyFactory() {
        return dynAnyFactory;
    }
    /**
     *   Setter function, set dynAnyFactory
     */
    public static void setDynAnyFactory(DynAnyFactory dynAnyFactory) {
        Client.dynAnyFactory = dynAnyFactory;
    }
    /**
     *   Getter function, return emsSession
     */
    public static EmsSession_I getEmsSession() {
        return emsSession;
    }
    /**
     *   Setter function, set emsSession
     */
    public static void setEmsSession(EmsSession_I emsSession) {
        Client.emsSession = emsSession;
    }
    /**
     *   Getter function, return orb
     */
    public static org.omg.CORBA.ORB getOrb() {
        return orb;
    }
    /**
     * Setter function, set orb
     */
    public static void setOrb(org.jacorb.orb.ORB orb) {
        Client.orb = orb;
    }
    /**
     *   Getter function, return rootPOA
     */
    public static org.omg.PortableServer.POA getRootPOA() {
        return rootPOA;
    }
    /**
     * Setter function, set rootPOA
     */
    public static void setRootPOA(org.omg.PortableServer.POA rootPOA) {
        Client.rootPOA = rootPOA;
    }
    /**
     *   Setter function, set instance
     */
    public static void setInstance(Client instance) {
        Client.instance = instance;
    }

    public static void shutdown() {
        try {
            rootPOA.the_POAManager().deactivate(true,true);
            orb.shutdown(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
