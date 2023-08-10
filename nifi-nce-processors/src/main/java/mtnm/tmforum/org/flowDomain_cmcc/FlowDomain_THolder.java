package mtnm.tmforum.org.flowDomain_cmcc;

/**
 * Generated from IDL struct "FlowDomain_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomain_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_T value;

	public FlowDomain_THolder ()
	{
	}
	public FlowDomain_THolder(final mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.write(_out, value);
	}
}
