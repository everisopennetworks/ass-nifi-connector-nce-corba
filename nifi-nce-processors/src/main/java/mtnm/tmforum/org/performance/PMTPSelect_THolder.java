package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMTPSelect_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMTPSelect_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMTPSelect_T value;

	public PMTPSelect_THolder ()
	{
	}
	public PMTPSelect_THolder(final mtnm.tmforum.org.performance.PMTPSelect_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.performance.PMTPSelect_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.performance.PMTPSelect_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.performance.PMTPSelect_THelper.write(_out, value);
	}
}
