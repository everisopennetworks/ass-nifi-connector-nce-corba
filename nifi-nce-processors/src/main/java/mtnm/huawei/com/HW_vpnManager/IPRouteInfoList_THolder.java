package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "IPRouteInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPRouteInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.IPRouteInfo_T[] value;

	public IPRouteInfoList_THolder ()
	{
	}
	public IPRouteInfoList_THolder (final mtnm.huawei.com.HW_vpnManager.IPRouteInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IPRouteInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPRouteInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IPRouteInfoList_THelper.write (out,value);
	}
}
