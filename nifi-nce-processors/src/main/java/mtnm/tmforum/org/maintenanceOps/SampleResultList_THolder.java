package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL alias "SampleResultList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SampleResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.SampleResult_T[] value;

	public SampleResultList_THolder ()
	{
	}
	public SampleResultList_THolder (final mtnm.tmforum.org.maintenanceOps.SampleResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleResultList_THelper.write (out,value);
	}
}
