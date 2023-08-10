package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL alias "PRBSTestResultList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PRBSTestResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T[] value;

	public PRBSTestResultList_THolder ()
	{
	}
	public PRBSTestResultList_THolder (final mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PRBSTestResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PRBSTestResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PRBSTestResultList_THelper.write (out,value);
	}
}
