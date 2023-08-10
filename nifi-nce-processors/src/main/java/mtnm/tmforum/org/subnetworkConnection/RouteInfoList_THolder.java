package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "RouteInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.RouteInfo_T[] value;

	public RouteInfoList_THolder ()
	{
	}
	public RouteInfoList_THolder (final mtnm.tmforum.org.subnetworkConnection.RouteInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteInfoList_THelper.write (out,value);
	}
}
