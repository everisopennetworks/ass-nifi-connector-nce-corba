package mtnm.tmforum.org.TopoManagementManager;

/**
 * Generated from IDL alias "NodeList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NodeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.TopoManagementManager.Node_T[] value;

	public NodeList_THolder ()
	{
	}
	public NodeList_THolder (final mtnm.tmforum.org.TopoManagementManager.Node_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NodeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NodeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NodeList_THelper.write (out,value);
	}
}
