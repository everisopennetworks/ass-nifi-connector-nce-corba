package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL alias "HW_EthServiceList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_EthServiceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpService.HW_EthService_T[] value;

	public HW_EthServiceList_THolder ()
	{
	}
	public HW_EthServiceList_THolder (final mtnm.huawei.com.HW_mstpService.HW_EthService_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_EthServiceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_EthServiceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_EthServiceList_THelper.write (out,value);
	}
}
