package mtnm.tmforum.org.flowDomain_TI;
/**
 * Generated from IDL enum "CPTP_Role_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CPTP_Role_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public CPTP_Role_T value;

	public CPTP_Role_THolder ()
	{
	}
	public CPTP_Role_THolder (final CPTP_Role_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CPTP_Role_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CPTP_Role_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CPTP_Role_THelper.write (out,value);
	}
}
