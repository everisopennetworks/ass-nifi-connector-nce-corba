package mtnm.tmforum.org.topologicalLink;

/**
 * Generated from IDL alias "TopologicalLinkList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TopologicalLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.topologicalLink.TopologicalLink_T[] value;

	public TopologicalLinkList_THolder ()
	{
	}
	public TopologicalLinkList_THolder (final mtnm.tmforum.org.topologicalLink.TopologicalLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopologicalLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopologicalLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopologicalLinkList_THelper.write (out,value);
	}
}
