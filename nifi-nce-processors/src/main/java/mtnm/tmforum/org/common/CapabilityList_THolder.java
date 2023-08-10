package mtnm.tmforum.org.common;

/**
 * Generated from IDL alias "CapabilityList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CapabilityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] value;

	public CapabilityList_THolder ()
	{
	}
	public CapabilityList_THolder (final mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CapabilityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CapabilityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CapabilityList_THelper.write (out,value);
	}
}
