package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "ShapingQueueList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ShapingQueueList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] value;

	public ShapingQueueList_THolder ()
	{
	}
	public ShapingQueueList_THolder (final mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ShapingQueueList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ShapingQueueList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ShapingQueueList_THelper.write (out,value);
	}
}
