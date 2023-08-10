package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ProtectionType_T value;

	public ProtectionType_THolder ()
	{
	}
	public ProtectionType_THolder (final ProtectionType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProtectionType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProtectionType_THelper.write (out,value);
	}
}
