package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "TrafficTrunkList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficTrunkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.TrafficTrunk_T[] value;

	public TrafficTrunkList_THolder ()
	{
	}
	public TrafficTrunkList_THolder (final mtnm.huawei.com.HW_vpnManager.TrafficTrunk_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficTrunkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficTrunkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficTrunkList_THelper.write (out,value);
	}
}
