package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "WDMSwitchDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class WDMSwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.WDMSwitchData_T[] value;

	public WDMSwitchDataList_THolder ()
	{
	}
	public WDMSwitchDataList_THolder (final mtnm.tmforum.org.protection.WDMSwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WDMSwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WDMSwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WDMSwitchDataList_THelper.write (out,value);
	}
}
