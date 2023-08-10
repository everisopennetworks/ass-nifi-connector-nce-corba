package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "LLDP_Mode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LLDP_Mode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public LLDP_Mode_T value;

	public LLDP_Mode_THolder ()
	{
	}
	public LLDP_Mode_THolder (final LLDP_Mode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LLDP_Mode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LLDP_Mode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LLDP_Mode_THelper.write (out,value);
	}
}
