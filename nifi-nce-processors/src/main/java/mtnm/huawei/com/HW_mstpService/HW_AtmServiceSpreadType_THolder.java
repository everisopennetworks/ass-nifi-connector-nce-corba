package mtnm.huawei.com.HW_mstpService;
/**
 * Generated from IDL enum "HW_AtmServiceSpreadType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmServiceSpreadType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_AtmServiceSpreadType_T value;

	public HW_AtmServiceSpreadType_THolder ()
	{
	}
	public HW_AtmServiceSpreadType_THolder (final HW_AtmServiceSpreadType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmServiceSpreadType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmServiceSpreadType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmServiceSpreadType_THelper.write (out,value);
	}
}
