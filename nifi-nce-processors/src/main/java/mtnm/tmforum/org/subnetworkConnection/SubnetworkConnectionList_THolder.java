package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL alias "SubnetworkConnectionList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SubnetworkConnectionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_T[] value;

	public SubnetworkConnectionList_THolder ()
	{
	}
	public SubnetworkConnectionList_THolder (final mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SubnetworkConnectionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubnetworkConnectionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SubnetworkConnectionList_THelper.write (out,value);
	}
}
