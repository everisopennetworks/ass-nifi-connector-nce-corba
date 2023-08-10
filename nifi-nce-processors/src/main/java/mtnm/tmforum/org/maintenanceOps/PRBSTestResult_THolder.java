package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "PRBSTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PRBSTestResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T value;

	public PRBSTestResult_THolder ()
	{
	}
	public PRBSTestResult_THolder(final mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.PRBSTestResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.PRBSTestResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.PRBSTestResult_THelper.write(_out, value);
	}
}
