package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "SNCServiceRouteList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCServiceRouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_T[] value;

	public SNCServiceRouteList_THolder ()
	{
	}
	public SNCServiceRouteList_THolder (final mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCServiceRouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCServiceRouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCServiceRouteList_THelper.write (out,value);
	}
}
