package mtnm.tmforum.org.guiCutThrough;
/**
 * Generated from IDL enum "ServerLaunchCapability_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerLaunchCapability_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ServerLaunchCapability_T value;

	public ServerLaunchCapability_THolder ()
	{
	}
	public ServerLaunchCapability_THolder (final ServerLaunchCapability_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerLaunchCapability_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerLaunchCapability_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerLaunchCapability_THelper.write (out,value);
	}
}
