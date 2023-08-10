package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "CreateSharedRouteData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CreateSharedRouteData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_T value;

	public CreateSharedRouteData_THolder ()
	{
	}
	public CreateSharedRouteData_THolder(final mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_THelper.write(_out, value);
	}
}
