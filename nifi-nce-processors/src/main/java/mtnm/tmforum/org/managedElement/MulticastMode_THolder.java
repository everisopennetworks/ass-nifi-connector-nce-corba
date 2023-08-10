package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "MulticastMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MulticastMode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public MulticastMode_T value;

	public MulticastMode_THolder ()
	{
	}
	public MulticastMode_THolder (final MulticastMode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MulticastMode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MulticastMode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MulticastMode_THelper.write (out,value);
	}
}
