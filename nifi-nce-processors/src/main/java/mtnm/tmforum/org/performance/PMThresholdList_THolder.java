package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMThresholdList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMThresholdList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMThreshold_T[] value;

	public PMThresholdList_THolder ()
	{
	}
	public PMThresholdList_THolder (final mtnm.tmforum.org.performance.PMThreshold_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdList_THelper.write (out,value);
	}
}
