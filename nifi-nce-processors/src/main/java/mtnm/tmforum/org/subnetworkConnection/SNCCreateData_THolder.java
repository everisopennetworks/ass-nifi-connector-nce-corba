package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "SNCCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T value;

	public SNCCreateData_THolder ()
	{
	}
	public SNCCreateData_THolder(final mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.write(_out, value);
	}
}