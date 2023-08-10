package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "NamingAttributesList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NamingAttributesList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[][] value;

	public NamingAttributesList_THolder ()
	{
	}
	public NamingAttributesList_THolder (final mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributesList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributesList_THelper.write (out,value);
	}
}
