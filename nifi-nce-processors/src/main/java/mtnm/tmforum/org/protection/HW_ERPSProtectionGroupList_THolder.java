package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "HW_ERPSProtectionGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ERPSProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_T[] value;

	public HW_ERPSProtectionGroupList_THolder ()
	{
	}
	public HW_ERPSProtectionGroupList_THolder (final mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_ERPSProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ERPSProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_ERPSProtectionGroupList_THelper.write (out,value);
	}
}
