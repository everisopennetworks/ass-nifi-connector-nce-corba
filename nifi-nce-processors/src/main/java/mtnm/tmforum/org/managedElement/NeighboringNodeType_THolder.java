package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NeighboringNodeType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public NeighboringNodeType_T value;

	public NeighboringNodeType_THolder ()
	{
	}
	public NeighboringNodeType_THolder (final NeighboringNodeType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NeighboringNodeType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NeighboringNodeType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NeighboringNodeType_THelper.write (out,value);
	}
}
