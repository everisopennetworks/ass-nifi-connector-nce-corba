package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "RedefineAlarmDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RedefineAlarmDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.RedefineAlarmData_T[] value;

	public RedefineAlarmDataList_THolder ()
	{
	}
	public RedefineAlarmDataList_THolder (final mtnm.tmforum.org.emsMgr.RedefineAlarmData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RedefineAlarmDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RedefineAlarmDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RedefineAlarmDataList_THelper.write (out,value);
	}
}
