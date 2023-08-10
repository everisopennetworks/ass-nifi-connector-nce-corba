package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "MatrixFlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T value;

	public MatrixFlowDomainFragment_THolder ()
	{
	}
	public MatrixFlowDomainFragment_THolder(final mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out, value);
	}
}
