package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL interface "TCProfileMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TCProfileMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TCProfileMgr_I value;
	public TCProfileMgr_IHolder()
	{
	}
	public TCProfileMgr_IHolder (final TCProfileMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TCProfileMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCProfileMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TCProfileMgr_IHelper.write (_out,value);
	}
}
