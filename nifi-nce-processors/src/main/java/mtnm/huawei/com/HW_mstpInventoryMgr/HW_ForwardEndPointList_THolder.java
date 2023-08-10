package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "HW_ForwardEndPointList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ForwardEndPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_T[] value;

	public HW_ForwardEndPointList_THolder ()
	{
	}
	public HW_ForwardEndPointList_THolder (final mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_ForwardEndPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ForwardEndPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_ForwardEndPointList_THelper.write (out,value);
	}
}
