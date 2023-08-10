package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "NetworkRouted_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NetworkRouted_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public NetworkRouted_T value;

	public NetworkRouted_THolder ()
	{
	}
	public NetworkRouted_THolder (final NetworkRouted_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NetworkRouted_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NetworkRouted_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NetworkRouted_THelper.write (out,value);
	}
}
