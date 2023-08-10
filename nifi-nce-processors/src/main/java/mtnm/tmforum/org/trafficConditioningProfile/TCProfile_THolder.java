package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "TCProfile_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TCProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfile_T value;

	public TCProfile_THolder ()
	{
	}
	public TCProfile_THolder(final mtnm.tmforum.org.trafficConditioningProfile.TCProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.write(_out, value);
	}
}
