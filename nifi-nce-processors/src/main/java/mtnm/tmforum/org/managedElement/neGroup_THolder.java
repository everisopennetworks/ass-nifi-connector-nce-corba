package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "neGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.neGroup_T value;

	public neGroup_THolder ()
	{
	}
	public neGroup_THolder(final mtnm.tmforum.org.managedElement.neGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.managedElement.neGroup_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.managedElement.neGroup_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.managedElement.neGroup_THelper.write(_out, value);
	}
}
