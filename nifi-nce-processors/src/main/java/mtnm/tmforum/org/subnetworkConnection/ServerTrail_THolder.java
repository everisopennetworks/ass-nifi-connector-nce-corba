package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "ServerTrail_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerTrail_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.ServerTrail_T value;

	public ServerTrail_THolder ()
	{
	}
	public ServerTrail_THolder(final mtnm.tmforum.org.subnetworkConnection.ServerTrail_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.subnetworkConnection.ServerTrail_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.subnetworkConnection.ServerTrail_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.subnetworkConnection.ServerTrail_THelper.write(_out, value);
	}
}
