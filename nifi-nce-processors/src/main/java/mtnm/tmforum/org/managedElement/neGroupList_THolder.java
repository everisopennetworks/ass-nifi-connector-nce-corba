package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "neGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.neGroup_T[] value;

	public neGroupList_THolder ()
	{
	}
	public neGroupList_THolder (final mtnm.tmforum.org.managedElement.neGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return neGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = neGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		neGroupList_THelper.write (out,value);
	}
}
