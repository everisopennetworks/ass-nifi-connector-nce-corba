package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmPGSwitchAction_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSwitchAction_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_AtmPGSwitchAction_T value;

	public HW_AtmPGSwitchAction_THolder ()
	{
	}
	public HW_AtmPGSwitchAction_THolder (final HW_AtmPGSwitchAction_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_AtmPGSwitchAction_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_AtmPGSwitchAction_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_AtmPGSwitchAction_THelper.write (out,value);
	}
}
