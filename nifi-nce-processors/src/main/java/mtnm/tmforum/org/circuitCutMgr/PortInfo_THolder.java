package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "PortInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.PortInfo_T value;

	public PortInfo_THolder ()
	{
	}
	public PortInfo_THolder(final mtnm.tmforum.org.circuitCutMgr.PortInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.write(_out, value);
	}
}
