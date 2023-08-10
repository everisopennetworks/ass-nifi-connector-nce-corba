package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "HolderState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HolderState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HolderState_T value;

	public HolderState_THolder ()
	{
	}
	public HolderState_THolder (final HolderState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HolderState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HolderState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HolderState_THelper.write (out,value);
	}
}
