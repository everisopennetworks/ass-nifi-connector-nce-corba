package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "VRRPProtection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRRPProtection_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.VRRPProtection_T value;

	public VRRPProtection_THolder ()
	{
	}
	public VRRPProtection_THolder(final mtnm.tmforum.org.ipMgr.VRRPProtection_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.ipMgr.VRRPProtection_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.ipMgr.VRRPProtection_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.ipMgr.VRRPProtection_THelper.write(_out, value);
	}
}
