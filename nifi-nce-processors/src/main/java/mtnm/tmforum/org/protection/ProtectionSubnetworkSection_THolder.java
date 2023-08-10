package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "ProtectionSubnetworkSection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetworkSection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[] value;

	public ProtectionSubnetworkSection_THolder ()
	{
	}
	public ProtectionSubnetworkSection_THolder (final mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionSubnetworkSection_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionSubnetworkSection_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionSubnetworkSection_THelper.write (out,value);
	}
}
