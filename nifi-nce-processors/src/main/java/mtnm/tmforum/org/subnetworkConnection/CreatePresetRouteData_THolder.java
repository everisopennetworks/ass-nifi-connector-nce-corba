package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "CreatePresetRouteData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CreatePresetRouteData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T value;

	public CreatePresetRouteData_THolder ()
	{
	}
	public CreatePresetRouteData_THolder(final mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_THelper.write(_out, value);
	}
}
