package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "AlarmRemarkInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class AlarmRemarkInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T[] value;

	public AlarmRemarkInfoList_THolder ()
	{
	}
	public AlarmRemarkInfoList_THolder (final mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmRemarkInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmRemarkInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmRemarkInfoList_THelper.write (out,value);
	}
}
