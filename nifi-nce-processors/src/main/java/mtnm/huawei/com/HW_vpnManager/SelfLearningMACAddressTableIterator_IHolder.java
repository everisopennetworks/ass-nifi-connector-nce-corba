package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL interface "SelfLearningMACAddressTableIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SelfLearningMACAddressTableIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public SelfLearningMACAddressTableIterator_I value;
	public SelfLearningMACAddressTableIterator_IHolder()
	{
	}
	public SelfLearningMACAddressTableIterator_IHolder (final SelfLearningMACAddressTableIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SelfLearningMACAddressTableIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SelfLearningMACAddressTableIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SelfLearningMACAddressTableIterator_IHelper.write (_out,value);
	}
}
