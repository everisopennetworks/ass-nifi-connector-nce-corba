package mtnm.tmforum.org.transmissionDescriptor;

/**
 * Generated from IDL struct "TMDCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TMDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_T value;

	public TMDCreateData_THolder ()
	{
	}
	public TMDCreateData_THolder(final mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_THelper.write(_out, value);
	}
}
