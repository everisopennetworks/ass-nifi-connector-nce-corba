package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "SelfLearningMACAddressList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SelfLearningMACAddressList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddress_T[] value;

	public SelfLearningMACAddressList_THolder ()
	{
	}
	public SelfLearningMACAddressList_THolder (final mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddress_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SelfLearningMACAddressList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SelfLearningMACAddressList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SelfLearningMACAddressList_THelper.write (out,value);
	}
}
