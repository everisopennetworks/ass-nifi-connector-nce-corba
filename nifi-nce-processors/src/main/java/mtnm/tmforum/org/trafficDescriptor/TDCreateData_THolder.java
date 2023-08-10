package mtnm.tmforum.org.trafficDescriptor;

/**
 * Generated from IDL struct "TDCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TDCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficDescriptor.TDCreateData_T value;

	public TDCreateData_THolder ()
	{
	}
	public TDCreateData_THolder(final mtnm.tmforum.org.trafficDescriptor.TDCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trafficDescriptor.TDCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trafficDescriptor.TDCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trafficDescriptor.TDCreateData_THelper.write(_out, value);
	}
}
