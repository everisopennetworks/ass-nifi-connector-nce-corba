package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL alias "TCProfileList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TCProfileList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfile_T[] value;

	public TCProfileList_THolder ()
	{
	}
	public TCProfileList_THolder (final mtnm.tmforum.org.trafficConditioningProfile.TCProfile_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCProfileList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCProfileList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TCProfileList_THelper.write (out,value);
	}
}
