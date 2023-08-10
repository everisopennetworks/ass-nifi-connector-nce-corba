package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL alias "HW_TrafficClassifierList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_TrafficClassifierList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T[] value;

	public HW_TrafficClassifierList_THolder ()
	{
	}
	public HW_TrafficClassifierList_THolder (final mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_TrafficClassifierList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_TrafficClassifierList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_TrafficClassifierList_THelper.write (out,value);
	}
}
