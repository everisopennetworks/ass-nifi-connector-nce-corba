package mtnm.tmforum.org.maintenanceOps;
/**
 * Generated from IDL enum "MaintenanceOperationMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MaintenanceOperationMode_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public MaintenanceOperationMode_T value;

	public MaintenanceOperationMode_THolder ()
	{
	}
	public MaintenanceOperationMode_THolder (final MaintenanceOperationMode_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MaintenanceOperationMode_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MaintenanceOperationMode_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MaintenanceOperationMode_THelper.write (out,value);
	}
}
