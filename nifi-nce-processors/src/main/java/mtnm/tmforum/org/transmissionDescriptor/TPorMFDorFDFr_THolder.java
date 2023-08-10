package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL union "TPorMFDorFDFr_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPorMFDorFDFr_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPorMFDorFDFr_T value;

	public TPorMFDorFDFr_THolder ()
	{
	}
	public TPorMFDorFDFr_THolder (final TPorMFDorFDFr_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPorMFDorFDFr_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPorMFDorFDFr_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPorMFDorFDFr_THelper.write (out, value);
	}
}
