package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "FDFrRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T[] value;

	public FDFrRoute_THolder ()
	{
	}
	public FDFrRoute_THolder (final mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrRoute_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrRoute_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrRoute_THelper.write (out,value);
	}
}
