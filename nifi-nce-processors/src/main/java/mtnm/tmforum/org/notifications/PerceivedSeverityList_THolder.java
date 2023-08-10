package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "PerceivedSeverityList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerceivedSeverityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.notifications.PerceivedSeverity_T[] value;

	public PerceivedSeverityList_THolder ()
	{
	}
	public PerceivedSeverityList_THolder (final mtnm.tmforum.org.notifications.PerceivedSeverity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerceivedSeverityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerceivedSeverityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerceivedSeverityList_THelper.write (out,value);
	}
}
