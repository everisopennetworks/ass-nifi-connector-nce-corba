package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "ExceptionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ExceptionType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ExceptionType_T value;

	public ExceptionType_THolder ()
	{
	}
	public ExceptionType_THolder (final ExceptionType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionType_THelper.write (out,value);
	}
}
