package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "neGroupInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroupInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.neGroupInfo_T[] value;

	public neGroupInfoList_THolder ()
	{
	}
	public neGroupInfoList_THolder (final mtnm.tmforum.org.managedElement.neGroupInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return neGroupInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = neGroupInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		neGroupInfoList_THelper.write (out,value);
	}
}
