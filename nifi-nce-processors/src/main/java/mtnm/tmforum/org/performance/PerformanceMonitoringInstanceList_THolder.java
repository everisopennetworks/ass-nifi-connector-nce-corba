package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PerformanceMonitoringInstanceList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceMonitoringInstanceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T[] value;

	public PerformanceMonitoringInstanceList_THolder ()
	{
	}
	public PerformanceMonitoringInstanceList_THolder (final mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceMonitoringInstanceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceMonitoringInstanceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceMonitoringInstanceList_THelper.write (out,value);
	}
}
