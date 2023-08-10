package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "ShapingQueue".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ShapingQueueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue value;

	public ShapingQueueHolder ()
	{
	}
	public ShapingQueueHolder(final mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.write(_out, value);
	}
}
