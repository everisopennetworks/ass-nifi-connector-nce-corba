package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "EProtectionGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.EProtectionGroup_T[] value;

	public EProtectionGroupList_THolder ()
	{
	}
	public EProtectionGroupList_THolder (final mtnm.tmforum.org.protection.EProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EProtectionGroupList_THelper.write (out,value);
	}
}
