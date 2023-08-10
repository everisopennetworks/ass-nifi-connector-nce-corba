package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL interface "HW_FlowIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_FlowIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_FlowIterator_I value;
	public HW_FlowIterator_IHolder()
	{
	}
	public HW_FlowIterator_IHolder (final HW_FlowIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_FlowIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_FlowIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_FlowIterator_IHelper.write (_out,value);
	}
}
