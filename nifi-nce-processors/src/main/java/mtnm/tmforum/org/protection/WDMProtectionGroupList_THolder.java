package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "WDMProtectionGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class WDMProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.WDMProtectionGroup_T[] value;

	public WDMProtectionGroupList_THolder ()
	{
	}
	public WDMProtectionGroupList_THolder (final mtnm.tmforum.org.protection.WDMProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WDMProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WDMProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WDMProtectionGroupList_THelper.write (out,value);
	}
}
