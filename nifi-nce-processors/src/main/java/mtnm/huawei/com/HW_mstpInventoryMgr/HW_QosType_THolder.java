package mtnm.huawei.com.HW_mstpInventoryMgr;
/**
 * Generated from IDL enum "HW_QosType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_QosType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_QosType_T value;

	public HW_QosType_THolder ()
	{
	}
	public HW_QosType_THolder (final HW_QosType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_QosType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_QosType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_QosType_THelper.write (out,value);
	}
}
