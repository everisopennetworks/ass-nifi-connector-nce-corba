package mtnm.tmforum.org.globaldefs;

/**
 * Generated from IDL alias "NamingAttributesMultipleList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NamingAttributesMultipleList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] value;

	public NamingAttributesMultipleList_THolder ()
	{
	}
	public NamingAttributesMultipleList_THolder (final mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributesMultipleList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesMultipleList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributesMultipleList_THelper.write (out,value);
	}
}
