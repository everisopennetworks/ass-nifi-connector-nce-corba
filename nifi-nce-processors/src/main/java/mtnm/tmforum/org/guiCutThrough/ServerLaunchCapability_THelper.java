package mtnm.tmforum.org.guiCutThrough;
/**
 * Generated from IDL enum "ServerLaunchCapability_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ServerLaunchCapability_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerLaunchCapability_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_THelper.id(),"ServerLaunchCapability_T",new String[]{"CLIENT_LAUNCH_ONLY","SERVER_LAUNCH_CAPABLE"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_T extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/ServerLaunchCapability_T:1.0";
	}
	public static ServerLaunchCapability_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServerLaunchCapability_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServerLaunchCapability_T s)
	{
		out.write_long(s.value());
	}
}
