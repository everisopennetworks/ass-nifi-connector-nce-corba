package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PerformanceTemplateList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceTemplateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PerformanceTemplate_T[] value;

	public PerformanceTemplateList_THolder ()
	{
	}
	public PerformanceTemplateList_THolder (final mtnm.tmforum.org.performance.PerformanceTemplate_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerformanceTemplateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerformanceTemplateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerformanceTemplateList_THelper.write (out,value);
	}
}
