package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "ServerTrailList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerTrailList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.ServerTrail_T[] value;

	public ServerTrailList_THolder ()
	{
	}
	public ServerTrailList_THolder (final mtnm.tmforum.org.subnetworkConnection.ServerTrail_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerTrailList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerTrailList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerTrailList_THelper.write (out,value);
	}
}
