package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL union "PhysicalLocationInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PhysicalLocationInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PhysicalLocationInfo_T value;

	public PhysicalLocationInfo_THolder ()
	{
	}
	public PhysicalLocationInfo_THolder (final PhysicalLocationInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PhysicalLocationInfo_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PhysicalLocationInfo_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PhysicalLocationInfo_THelper.write (out, value);
	}
}
