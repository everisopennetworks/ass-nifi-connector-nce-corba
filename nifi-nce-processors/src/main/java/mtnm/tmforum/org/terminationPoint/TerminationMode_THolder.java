package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "TerminationMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TerminationMode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TerminationMode_T value;

	public TerminationMode_THolder ()
	{
	}
	public TerminationMode_THolder (final TerminationMode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TerminationMode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TerminationMode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TerminationMode_THelper.write (out,value);
	}
}
