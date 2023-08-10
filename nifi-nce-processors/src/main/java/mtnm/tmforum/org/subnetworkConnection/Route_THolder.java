package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "Route_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Route_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] value;

	public Route_THolder ()
	{
	}
	public Route_THolder (final mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Route_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Route_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Route_THelper.write (out,value);
	}
}
