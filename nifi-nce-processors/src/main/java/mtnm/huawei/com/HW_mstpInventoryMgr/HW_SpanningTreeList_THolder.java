package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "HW_SpanningTreeList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_SpanningTreeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_T[] value;

	public HW_SpanningTreeList_THolder ()
	{
	}
	public HW_SpanningTreeList_THolder (final mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_SpanningTreeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_SpanningTreeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_SpanningTreeList_THelper.write (out,value);
	}
}
