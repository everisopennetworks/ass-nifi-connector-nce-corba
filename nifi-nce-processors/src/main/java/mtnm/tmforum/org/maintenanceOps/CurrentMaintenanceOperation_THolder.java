package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "CurrentMaintenanceOperation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CurrentMaintenanceOperation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T value;

	public CurrentMaintenanceOperation_THolder ()
	{
	}
	public CurrentMaintenanceOperation_THolder(final mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_THelper.write(_out, value);
	}
}
