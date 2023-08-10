package mtnm.huawei.com.HW_vpnManager;
/**
 * Generated from IDL enum "UsedAsType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class UsedAsType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public UsedAsType_T value;

	public UsedAsType_THolder ()
	{
	}
	public UsedAsType_THolder (final UsedAsType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return UsedAsType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = UsedAsType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		UsedAsType_THelper.write (out,value);
	}
}
