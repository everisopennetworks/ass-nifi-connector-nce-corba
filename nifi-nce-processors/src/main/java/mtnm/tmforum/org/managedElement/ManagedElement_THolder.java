package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "ManagedElement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ManagedElement_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.ManagedElement_T value;

	public ManagedElement_THolder ()
	{
	}
	public ManagedElement_THolder(final mtnm.tmforum.org.managedElement.ManagedElement_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.managedElement.ManagedElement_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.managedElement.ManagedElement_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.managedElement.ManagedElement_THelper.write(_out, value);
	}
}
