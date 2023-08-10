package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "ClockSourceStatusList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ClockSourceStatusList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.ClockSourceStatus_T[] value;

	public ClockSourceStatusList_THolder ()
	{
	}
	public ClockSourceStatusList_THolder (final mtnm.tmforum.org.emsMgr.ClockSourceStatus_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClockSourceStatusList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClockSourceStatusList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClockSourceStatusList_THelper.write (out,value);
	}
}
