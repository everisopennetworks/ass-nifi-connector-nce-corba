package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ProtectServiceTrail_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectServiceTrail_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T value;

	public ProtectServiceTrail_THolder ()
	{
	}
	public ProtectServiceTrail_THolder(final mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_THelper.write(_out, value);
	}
}
