package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL alias "SplitHorizonGroupAttrList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SplitHorizonGroupAttrList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_vpnManager.SplitHorizonGroup_T[] value;

	public SplitHorizonGroupAttrList_THolder ()
	{
	}
	public SplitHorizonGroupAttrList_THolder (final mtnm.huawei.com.HW_vpnManager.SplitHorizonGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SplitHorizonGroupAttrList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SplitHorizonGroupAttrList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SplitHorizonGroupAttrList_THelper.write (out,value);
	}
}
