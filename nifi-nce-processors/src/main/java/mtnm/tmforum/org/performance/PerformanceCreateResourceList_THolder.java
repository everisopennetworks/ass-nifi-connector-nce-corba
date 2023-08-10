package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PerformanceCreateResourceList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceCreateResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PerformanceCreateResource_T[] value;

	public PerformanceCreateResourceList_THolder ()
	{
	}
	public PerformanceCreateResourceList_THolder (final mtnm.tmforum.org.performance.PerformanceCreateResource_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceCreateResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceCreateResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceCreateResourceList_THelper.write (out,value);
	}
}
