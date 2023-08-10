package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "SNCType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SNCType_T value;

	public SNCType_THolder ()
	{
	}
	public SNCType_THolder (final SNCType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCType_THelper.write (out,value);
	}
}
