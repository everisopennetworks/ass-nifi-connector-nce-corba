package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL alias "HW_AtmServiceProtectPairList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmServiceProtectPairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T[] value;

	public HW_AtmServiceProtectPairList_THolder ()
	{
	}
	public HW_AtmServiceProtectPairList_THolder (final mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceProtectPairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceProtectPairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceProtectPairList_THelper.write (out,value);
	}
}
