package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_ForwardEndPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ForwardEndPoint_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_T value;

	public HW_ForwardEndPoint_THolder ()
	{
	}
	public HW_ForwardEndPoint_THolder(final mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.HW_ForwardEndPoint_THelper.write(_out, value);
	}
}
