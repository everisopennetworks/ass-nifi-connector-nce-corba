package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "HW_IFProtectionGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_IFProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] value;

	public HW_IFProtectionGroupList_THolder ()
	{
	}
	public HW_IFProtectionGroupList_THolder (final mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_IFProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_IFProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_IFProtectionGroupList_THelper.write (out,value);
	}
}
