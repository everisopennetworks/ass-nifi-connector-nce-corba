package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "EndTPFaultStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EndTPFaultStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T value;

	public EndTPFaultStatus_THolder ()
	{
	}
	public EndTPFaultStatus_THolder(final mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.emsMgr.EndTPFaultStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.emsMgr.EndTPFaultStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.emsMgr.EndTPFaultStatus_THelper.write(_out, value);
	}
}
