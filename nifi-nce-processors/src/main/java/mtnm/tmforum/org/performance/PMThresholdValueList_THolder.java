package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMThresholdValueList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMThresholdValueList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMThresholdValue_T[] value;

	public PMThresholdValueList_THolder ()
	{
	}
	public PMThresholdValueList_THolder (final mtnm.tmforum.org.performance.PMThresholdValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdValueList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdValueList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdValueList_THelper.write (out,value);
	}
}
