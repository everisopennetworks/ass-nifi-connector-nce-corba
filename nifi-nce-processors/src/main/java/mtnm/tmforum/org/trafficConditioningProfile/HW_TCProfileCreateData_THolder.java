package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "HW_TCProfileCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_TCProfileCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T value;

	public HW_TCProfileCreateData_THolder ()
	{
	}
	public HW_TCProfileCreateData_THolder(final mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_THelper.write(_out, value);
	}
}
