package mtnm.tmforum.org.flowDomainFragment;

/**
 * Generated from IDL struct "FlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T value;

	public FlowDomainFragment_THolder ()
	{
	}
	public FlowDomainFragment_THolder(final mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out, value);
	}
}
