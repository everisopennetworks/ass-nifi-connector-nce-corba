package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "TPType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPType_T value;

	public TPType_THolder ()
	{
	}
	public TPType_THolder (final TPType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPType_THelper.write (out,value);
	}
}
