package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "HoldingTime_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HoldingTime_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.HoldingTime_T value;

	public HoldingTime_THolder ()
	{
	}
	public HoldingTime_THolder(final mtnm.tmforum.org.performance.HoldingTime_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.performance.HoldingTime_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.performance.HoldingTime_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.performance.HoldingTime_THelper.write(_out, value);
	}
}
