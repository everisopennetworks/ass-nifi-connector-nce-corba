package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL alias "TrailNtwProtectionList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtectionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_T[] value;

	public TrailNtwProtectionList_THolder ()
	{
	}
	public TrailNtwProtectionList_THolder (final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrailNtwProtectionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrailNtwProtectionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrailNtwProtectionList_THelper.write (out,value);
	}
}
