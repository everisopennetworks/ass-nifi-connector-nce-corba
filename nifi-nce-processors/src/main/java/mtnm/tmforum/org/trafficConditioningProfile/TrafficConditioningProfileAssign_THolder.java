package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "TrafficConditioningProfileAssign_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficConditioningProfileAssign_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T value;

	public TrafficConditioningProfileAssign_THolder ()
	{
	}
	public TrafficConditioningProfileAssign_THolder(final mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_THelper.write(_out, value);
	}
}
