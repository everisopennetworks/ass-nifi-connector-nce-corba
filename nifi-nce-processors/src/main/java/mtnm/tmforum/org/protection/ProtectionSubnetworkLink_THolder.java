package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "ProtectionSubnetworkLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetworkLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T value;

	public ProtectionSubnetworkLink_THolder ()
	{
	}
	public ProtectionSubnetworkLink_THolder(final mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.protection.ProtectionSubnetworkLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.protection.ProtectionSubnetworkLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.protection.ProtectionSubnetworkLink_THelper.write(_out, value);
	}
}