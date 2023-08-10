package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL alias "SeverityList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SeverityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.equipment.Severity_T[] value;

	public SeverityList_THolder ()
	{
	}
	public SeverityList_THolder (final mtnm.tmforum.org.equipment.Severity_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SeverityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SeverityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SeverityList_THelper.write (out,value);
	}
}
