package mtnm.tmforum.org.emsSession;


/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EmsSession_IOperations
	extends mtnm.tmforum.org.session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, mtnm.tmforum.org.common.Common_IHolder managerInterface) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder event) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
