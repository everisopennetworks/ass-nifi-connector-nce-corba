package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL enum "TPorMFDorFDFrQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPorMFDorFDFrQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPorMFDorFDFrQualifier_T value;

	public TPorMFDorFDFrQualifier_THolder ()
	{
	}
	public TPorMFDorFDFrQualifier_THolder (final TPorMFDorFDFrQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPorMFDorFDFrQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPorMFDorFDFrQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPorMFDorFDFrQualifier_THelper.write (out,value);
	}
}
