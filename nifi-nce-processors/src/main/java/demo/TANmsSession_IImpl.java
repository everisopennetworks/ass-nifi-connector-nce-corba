package demo;
import mtnm.tmforum.org.nmsSession.NmsSession_IPOA;
import mtnm.tmforum.org.session.Session_I;
/**
 * NmsSession_IPOA for EMS(NCE) invoking.
 * @author
 *
 */
public class TANmsSession_IImpl extends NmsSession_IPOA {
    public void eventLossCleared(String endTime) {
        log("TANmsSession_IImpl.eventLossCleared(String endTime) is invoked by EMS(NCE).");
        log("endTime:"+endTime);
    }
    public void eventLossOccurred(String startTime, String notificationId) {
        log("TANmsSession_IImpl.eventLossOccurred(String startTime, String notificationId) is invoked by EMS.");
        log("startTime:"+startTime+", notificationId:"+notificationId);
    }
    public Session_I associatedSession() {
        log("TANmsSession_IImpl.associatedSession() is invoked by EMS(NCE).");
        return null;
    }
    public void endSession() {
        log("TANmsSession_IImpl.endSession() is invoked by EMS(NCE).");
    }
    public void ping() {
        log("TANmsSession_IImpl.ping() is invoked by EMS(NCE).");
    }
    private static void log(String str){
        System.out.println(str);
    }
}
