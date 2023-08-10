package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "NVList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NVList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.notifications.NameAndAnyValue_T[] value;

	public NVList_THolder ()
	{
	}
	public NVList_THolder (final mtnm.tmforum.org.notifications.NameAndAnyValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NVList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NVList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NVList_THelper.write (out,value);
	}
}
