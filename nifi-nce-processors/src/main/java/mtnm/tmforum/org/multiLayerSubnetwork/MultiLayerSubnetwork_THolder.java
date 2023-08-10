package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL struct "MultiLayerSubnetwork_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MultiLayerSubnetwork_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T value;

	public MultiLayerSubnetwork_THolder ()
	{
	}
	public MultiLayerSubnetwork_THolder(final mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out, value);
	}
}
