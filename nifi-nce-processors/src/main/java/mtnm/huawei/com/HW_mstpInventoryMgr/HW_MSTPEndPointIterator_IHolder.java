package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL interface "HW_MSTPEndPointIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MSTPEndPointIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MSTPEndPointIterator_I value;
	public HW_MSTPEndPointIterator_IHolder()
	{
	}
	public HW_MSTPEndPointIterator_IHolder (final HW_MSTPEndPointIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MSTPEndPointIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPEndPointIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MSTPEndPointIterator_IHelper.write (_out,value);
	}
}
