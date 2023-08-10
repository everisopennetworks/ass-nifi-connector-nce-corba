package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "QueryRedefineAlarmDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class QueryRedefineAlarmDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T[] value;

	public QueryRedefineAlarmDataList_THolder ()
	{
	}
	public QueryRedefineAlarmDataList_THolder (final mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QueryRedefineAlarmDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueryRedefineAlarmDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QueryRedefineAlarmDataList_THelper.write (out,value);
	}
}
