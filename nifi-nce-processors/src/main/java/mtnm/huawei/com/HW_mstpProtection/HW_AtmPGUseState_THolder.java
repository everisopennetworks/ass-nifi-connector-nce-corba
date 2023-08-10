package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmPGUseState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGUseState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_AtmPGUseState_T value;

	public HW_AtmPGUseState_THolder ()
	{
	}
	public HW_AtmPGUseState_THolder (final HW_AtmPGUseState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmPGUseState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmPGUseState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmPGUseState_THelper.write (out,value);
	}
}
