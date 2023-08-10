package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "ResourceTypeQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ResourceTypeQualifier_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ResourceTypeQualifier_T value;

	public ResourceTypeQualifier_THolder ()
	{
	}
	public ResourceTypeQualifier_THolder (final ResourceTypeQualifier_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceTypeQualifier_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceTypeQualifier_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceTypeQualifier_THelper.write (out,value);
	}
}
