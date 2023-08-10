package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "ResourceList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] value;

	public ResourceList_THolder ()
	{
	}
	public ResourceList_THolder (final mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceList_THelper.write (out,value);
	}
}
