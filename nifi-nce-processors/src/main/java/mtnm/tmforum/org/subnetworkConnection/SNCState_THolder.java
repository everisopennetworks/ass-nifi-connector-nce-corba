package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "SNCState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public SNCState_T value;

	public SNCState_THolder ()
	{
	}
	public SNCState_THolder (final SNCState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCState_THelper.write (out,value);
	}
}
