package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionCommand_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionCommand_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionCommand_T value;

	public ProtectionCommand_THolder ()
	{
	}
	public ProtectionCommand_THolder (final ProtectionCommand_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionCommand_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionCommand_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionCommand_THelper.write (out,value);
	}
}
