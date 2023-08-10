package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "CorrelatedNotificationList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CorrelatedNotificationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.notifications.CorrelatedNotifications_T[] value;

	public CorrelatedNotificationList_THolder ()
	{
	}
	public CorrelatedNotificationList_THolder (final mtnm.tmforum.org.notifications.CorrelatedNotifications_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CorrelatedNotificationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CorrelatedNotificationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CorrelatedNotificationList_THelper.write (out,value);
	}
}
