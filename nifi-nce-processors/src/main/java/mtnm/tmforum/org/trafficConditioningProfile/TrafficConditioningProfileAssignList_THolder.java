package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL alias "TrafficConditioningProfileAssignList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficConditioningProfileAssignList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] value;

	public TrafficConditioningProfileAssignList_THolder ()
	{
	}
	public TrafficConditioningProfileAssignList_THolder (final mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficConditioningProfileAssignList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficConditioningProfileAssignList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficConditioningProfileAssignList_THelper.write (out,value);
	}
}
