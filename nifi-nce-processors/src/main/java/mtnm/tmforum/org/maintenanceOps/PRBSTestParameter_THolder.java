package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "PRBSTestParameter_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PRBSTestParameter_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T value;

	public PRBSTestParameter_THolder ()
	{
	}
	public PRBSTestParameter_THolder(final mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.write(_out, value);
	}
}
