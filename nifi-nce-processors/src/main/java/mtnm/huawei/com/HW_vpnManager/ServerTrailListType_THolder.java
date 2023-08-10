package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "ServerTrailListType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerTrailListType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.ServerTrailType_T[] value;

	public ServerTrailListType_THolder ()
	{
	}
	public ServerTrailListType_THolder (final mtnm.huawei.com.HW_vpnManager.ServerTrailType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerTrailListType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerTrailListType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerTrailListType_THelper.write (out,value);
	}
}
