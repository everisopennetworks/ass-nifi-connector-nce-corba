package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "SwitchReason_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SwitchReason_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SwitchReason_T value;

	public SwitchReason_THolder ()
	{
	}
	public SwitchReason_THolder (final SwitchReason_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SwitchReason_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SwitchReason_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SwitchReason_THelper.write (out,value);
	}
}
