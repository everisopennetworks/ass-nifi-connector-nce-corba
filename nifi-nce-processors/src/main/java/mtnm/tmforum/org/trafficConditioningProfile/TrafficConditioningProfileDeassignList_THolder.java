package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL alias "TrafficConditioningProfileDeassignList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficConditioningProfileDeassignList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] value;

	public TrafficConditioningProfileDeassignList_THolder ()
	{
	}
	public TrafficConditioningProfileDeassignList_THolder (final mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficConditioningProfileDeassignList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficConditioningProfileDeassignList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficConditioningProfileDeassignList_THelper.write (out,value);
	}
}
