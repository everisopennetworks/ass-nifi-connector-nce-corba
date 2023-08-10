package mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage;

/**
 * Generated from IDL struct "OAMParametersData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class OAMParametersData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T value;

	public OAMParametersData_THolder ()
	{
	}
	public OAMParametersData_THolder(final mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.write(_out, value);
	}
}
