package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL alias "StaticRoutingList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class StaticRoutingList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.StaticRouting_T[] value;

	public StaticRoutingList_THolder ()
	{
	}
	public StaticRoutingList_THolder (final mtnm.tmforum.org.ipMgr.StaticRouting_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StaticRoutingList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StaticRoutingList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StaticRoutingList_THelper.write (out,value);
	}
}
