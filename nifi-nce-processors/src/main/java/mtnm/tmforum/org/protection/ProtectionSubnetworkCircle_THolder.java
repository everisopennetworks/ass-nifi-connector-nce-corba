package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "ProtectionSubnetworkCircle_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetworkCircle_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] value;

	public ProtectionSubnetworkCircle_THolder ()
	{
	}
	public ProtectionSubnetworkCircle_THolder (final mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSubnetworkCircle_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkCircle_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSubnetworkCircle_THelper.write (out,value);
	}
}
