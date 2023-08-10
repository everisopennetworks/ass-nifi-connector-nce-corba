package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL interface "HW_EthServiceIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_EthServiceIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_EthServiceIterator_I value;
	public HW_EthServiceIterator_IHolder()
	{
	}
	public HW_EthServiceIterator_IHolder (final HW_EthServiceIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_EthServiceIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_EthServiceIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_EthServiceIterator_IHelper.write (_out,value);
	}
}
