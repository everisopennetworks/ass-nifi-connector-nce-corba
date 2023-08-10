package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PerformanceCreateInstanceList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceCreateInstanceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PerformanceCreateInstance_T[] value;

	public PerformanceCreateInstanceList_THolder ()
	{
	}
	public PerformanceCreateInstanceList_THolder (final mtnm.tmforum.org.performance.PerformanceCreateInstance_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceCreateInstanceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceCreateInstanceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceCreateInstanceList_THelper.write (out,value);
	}
}
