package mtnm.tmforum.org.emsSessionFactory;


/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EmsSessionFactory_IOperations
	extends mtnm.tmforum.org.mtnmVersion.Version_IOperations
{
	/* constants */
	/* operations  */
	void getEmsSession(java.lang.String user, java.lang.String password, mtnm.tmforum.org.nmsSession.NmsSession_I client, mtnm.tmforum.org.emsSession.EmsSession_IHolder emsSessionInterface) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
