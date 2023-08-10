package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL alias "SubnetworkList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SubnetworkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T[] value;

	public SubnetworkList_THolder ()
	{
	}
	public SubnetworkList_THolder (final mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SubnetworkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubnetworkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SubnetworkList_THelper.write (out,value);
	}
}
