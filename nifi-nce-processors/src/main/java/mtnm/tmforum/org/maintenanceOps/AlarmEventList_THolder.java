package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL alias "AlarmEventList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class AlarmEventList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public AlarmEventList_THolder ()
	{
	}
	public AlarmEventList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmEventList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmEventList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmEventList_THelper.write (out,value);
	}
}
