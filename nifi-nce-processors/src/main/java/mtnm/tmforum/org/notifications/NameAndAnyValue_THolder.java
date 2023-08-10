package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL struct "NameAndAnyValue_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NameAndAnyValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.notifications.NameAndAnyValue_T value;

	public NameAndAnyValue_THolder ()
	{
	}
	public NameAndAnyValue_THolder(final mtnm.tmforum.org.notifications.NameAndAnyValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.write(_out, value);
	}
}
