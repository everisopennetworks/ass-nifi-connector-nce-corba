package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "Directionality_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Directionality_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public Directionality_T value;

	public Directionality_THolder ()
	{
	}
	public Directionality_THolder (final Directionality_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Directionality_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Directionality_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Directionality_THelper.write (out,value);
	}
}
