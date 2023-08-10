package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "ManagedElementList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ManagedElementList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.ManagedElement_T[] value;

	public ManagedElementList_THolder ()
	{
	}
	public ManagedElementList_THolder (final mtnm.tmforum.org.managedElement.ManagedElement_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ManagedElementList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManagedElementList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ManagedElementList_THelper.write (out,value);
	}
}
