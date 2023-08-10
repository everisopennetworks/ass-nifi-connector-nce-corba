package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PmMonitorConditioning_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PmMonitorConditioning_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PmMonitorConditioning_T value;

	public PmMonitorConditioning_THolder ()
	{
	}
	public PmMonitorConditioning_THolder(final mtnm.tmforum.org.performance.PmMonitorConditioning_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.write(_out, value);
	}
}
