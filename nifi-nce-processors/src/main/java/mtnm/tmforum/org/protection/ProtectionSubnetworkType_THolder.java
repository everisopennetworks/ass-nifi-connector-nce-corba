package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionSubnetworkType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetworkType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionSubnetworkType_T value;

	public ProtectionSubnetworkType_THolder ()
	{
	}
	public ProtectionSubnetworkType_THolder (final ProtectionSubnetworkType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSubnetworkType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSubnetworkType_THelper.write (out,value);
	}
}
