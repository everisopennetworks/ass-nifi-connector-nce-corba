package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL enum "ServiceCategory_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceCategory_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ServiceCategory_T value;

	public ServiceCategory_THolder ()
	{
	}
	public ServiceCategory_THolder (final ServiceCategory_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceCategory_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceCategory_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceCategory_THelper.write (out,value);
	}
}