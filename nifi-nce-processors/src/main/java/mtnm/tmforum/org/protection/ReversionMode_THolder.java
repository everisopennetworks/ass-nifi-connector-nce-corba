package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ReversionMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ReversionMode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ReversionMode_T value;

	public ReversionMode_THolder ()
	{
	}
	public ReversionMode_THolder (final ReversionMode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ReversionMode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReversionMode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ReversionMode_THelper.write (out,value);
	}
}
