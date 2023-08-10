package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL alias "CurrentMaintenanceOperationList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CurrentMaintenanceOperationList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T[] value;

	public CurrentMaintenanceOperationList_THolder ()
	{
	}
	public CurrentMaintenanceOperationList_THolder (final mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CurrentMaintenanceOperationList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CurrentMaintenanceOperationList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CurrentMaintenanceOperationList_THelper.write (out,value);
	}
}
