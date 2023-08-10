package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "AlarmSerialNoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class AlarmSerialNoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public AlarmSerialNoList_THolder ()
	{
	}
	public AlarmSerialNoList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmSerialNoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmSerialNoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AlarmSerialNoList_THelper.write (out,value);
	}
}
