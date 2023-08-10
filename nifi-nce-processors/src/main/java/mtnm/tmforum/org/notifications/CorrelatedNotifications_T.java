package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL struct "CorrelatedNotifications_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CorrelatedNotifications_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CorrelatedNotifications_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] source;
	public java.lang.String[] notifIDs;
	public CorrelatedNotifications_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] source, java.lang.String[] notifIDs)
	{
		this.source = source;
		this.notifIDs = notifIDs;
	}
}
