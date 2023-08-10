package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL interface "MaintenanceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MaintenanceMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MaintenanceMgr_I value;
	public MaintenanceMgr_IHolder()
	{
	}
	public MaintenanceMgr_IHolder (final MaintenanceMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MaintenanceMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MaintenanceMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MaintenanceMgr_IHelper.write (_out,value);
	}
}
