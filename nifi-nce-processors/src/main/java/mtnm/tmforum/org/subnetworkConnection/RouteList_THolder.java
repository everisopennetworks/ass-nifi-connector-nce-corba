package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "RouteList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] value;

	public RouteList_THolder ()
	{
	}
	public RouteList_THolder (final mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteList_THelper.write (out,value);
	}
}
