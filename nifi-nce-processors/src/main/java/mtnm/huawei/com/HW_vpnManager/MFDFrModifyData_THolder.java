package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "MFDFrModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MFDFrModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_T value;

	public MFDFrModifyData_THolder ()
	{
	}
	public MFDFrModifyData_THolder(final mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_THelper.write(_out, value);
	}
}
