package mtnm.tmforum.org.transmissionDescriptor;

/**
 * Generated from IDL struct "TMDModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TMDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_T value;

	public TMDModifyData_THolder ()
	{
	}
	public TMDModifyData_THolder(final mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_THelper.write(_out, value);
	}
}
