package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "SNCCreateDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCCreateDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] value;

	public SNCCreateDataList_THolder ()
	{
	}
	public SNCCreateDataList_THolder (final mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SNCCreateDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SNCCreateDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SNCCreateDataList_THelper.write (out,value);
	}
}
