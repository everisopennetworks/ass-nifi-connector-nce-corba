package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMData_T[] value;

	public PMDataList_THolder ()
	{
	}
	public PMDataList_THolder (final mtnm.tmforum.org.performance.PMData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMDataList_THelper.write (out,value);
	}
}
