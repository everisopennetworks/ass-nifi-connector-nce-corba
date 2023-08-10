package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "TimeSlotInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TimeSlotInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T[] value;

	public TimeSlotInfoList_THolder ()
	{
	}
	public TimeSlotInfoList_THolder (final mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TimeSlotInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeSlotInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TimeSlotInfoList_THelper.write (out,value);
	}
}
