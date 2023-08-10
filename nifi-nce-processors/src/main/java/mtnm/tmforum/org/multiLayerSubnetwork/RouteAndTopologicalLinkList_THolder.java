package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL alias "RouteAndTopologicalLinkList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteAndTopologicalLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLink_T[] value;

	public RouteAndTopologicalLinkList_THolder ()
	{
	}
	public RouteAndTopologicalLinkList_THolder (final mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteAndTopologicalLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteAndTopologicalLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteAndTopologicalLinkList_THelper.write (out,value);
	}
}
