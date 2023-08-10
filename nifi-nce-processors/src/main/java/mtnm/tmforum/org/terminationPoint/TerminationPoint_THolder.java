package mtnm.tmforum.org.terminationPoint;

/**
 * Generated from IDL struct "TerminationPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TerminationPoint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.terminationPoint.TerminationPoint_T value;

	public TerminationPoint_THolder ()
	{
	}
	public TerminationPoint_THolder(final mtnm.tmforum.org.terminationPoint.TerminationPoint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out, value);
	}
}
