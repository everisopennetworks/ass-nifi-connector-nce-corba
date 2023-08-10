package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL struct "CorrelatedNotifications_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CorrelatedNotifications_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.notifications.CorrelatedNotifications_T value;

	public CorrelatedNotifications_THolder ()
	{
	}
	public CorrelatedNotifications_THolder(final mtnm.tmforum.org.notifications.CorrelatedNotifications_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.notifications.CorrelatedNotifications_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.notifications.CorrelatedNotifications_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.notifications.CorrelatedNotifications_THelper.write(_out, value);
	}
}
