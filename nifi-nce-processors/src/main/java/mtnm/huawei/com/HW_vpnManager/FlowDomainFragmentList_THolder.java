package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "FlowDomainFragmentList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomainFragmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_T[] value;

	public FlowDomainFragmentList_THolder ()
	{
	}
	public FlowDomainFragmentList_THolder (final mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FlowDomainFragmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FlowDomainFragmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FlowDomainFragmentList_THelper.write (out,value);
	}
}
