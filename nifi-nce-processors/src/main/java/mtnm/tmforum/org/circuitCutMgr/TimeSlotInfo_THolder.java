package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "TimeSlotInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TimeSlotInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T value;

	public TimeSlotInfo_THolder ()
	{
	}
	public TimeSlotInfo_THolder(final mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.write(_out, value);
	}
}
