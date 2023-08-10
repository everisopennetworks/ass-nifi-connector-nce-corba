package mtnm.tmforum.org.performance;
/**
 * Generated from IDL enum "ActivityStatusEnum_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ActivityStatusEnum_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ActivityStatusEnum_T value;

	public ActivityStatusEnum_THolder ()
	{
	}
	public ActivityStatusEnum_THolder (final ActivityStatusEnum_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ActivityStatusEnum_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ActivityStatusEnum_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ActivityStatusEnum_THelper.write (out,value);
	}
}
