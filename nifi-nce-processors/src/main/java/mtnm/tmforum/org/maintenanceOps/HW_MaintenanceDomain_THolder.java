package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "HW_MaintenanceDomain_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MaintenanceDomain_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_T value;

	public HW_MaintenanceDomain_THolder ()
	{
	}
	public HW_MaintenanceDomain_THolder(final mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THelper.write(_out, value);
	}
}
