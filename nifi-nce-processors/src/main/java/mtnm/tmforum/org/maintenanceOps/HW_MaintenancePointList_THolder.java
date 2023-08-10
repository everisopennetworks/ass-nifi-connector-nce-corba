package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL alias "HW_MaintenancePointList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MaintenancePointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_T[] value;

	public HW_MaintenancePointList_THolder ()
	{
	}
	public HW_MaintenancePointList_THolder (final mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HW_MaintenancePointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MaintenancePointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HW_MaintenancePointList_THelper.write (out,value);
	}
}
