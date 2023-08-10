package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeSubType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NeighboringNodeSubType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public NeighboringNodeSubType_T value;

	public NeighboringNodeSubType_THolder ()
	{
	}
	public NeighboringNodeSubType_THolder (final NeighboringNodeSubType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NeighboringNodeSubType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NeighboringNodeSubType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NeighboringNodeSubType_THelper.write (out,value);
	}
}
