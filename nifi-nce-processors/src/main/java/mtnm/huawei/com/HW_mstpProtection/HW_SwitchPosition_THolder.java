package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_SwitchPosition_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_SwitchPosition_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public HW_SwitchPosition_T value;

	public HW_SwitchPosition_THolder ()
	{
	}
	public HW_SwitchPosition_THolder (final HW_SwitchPosition_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_SwitchPosition_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_SwitchPosition_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_SwitchPosition_THelper.write (out,value);
	}
}
