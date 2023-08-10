package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "HW_FlowList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_FlowList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_T[] value;

	public HW_FlowList_THolder ()
	{
	}
	public HW_FlowList_THolder (final mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_FlowList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_FlowList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_FlowList_THelper.write (out,value);
	}
}
