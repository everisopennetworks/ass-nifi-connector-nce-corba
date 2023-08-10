package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "IPCrossConnectionList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPCrossConnectionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] value;

	public IPCrossConnectionList_THolder ()
	{
	}
	public IPCrossConnectionList_THolder (final mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPCrossConnectionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPCrossConnectionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPCrossConnectionList_THelper.write (out,value);
	}
}
