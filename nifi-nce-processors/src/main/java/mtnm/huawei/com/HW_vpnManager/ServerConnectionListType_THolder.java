package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "ServerConnectionListType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerConnectionListType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T[] value;

	public ServerConnectionListType_THolder ()
	{
	}
	public ServerConnectionListType_THolder (final mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerConnectionListType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerConnectionListType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerConnectionListType_THelper.write (out,value);
	}
}
