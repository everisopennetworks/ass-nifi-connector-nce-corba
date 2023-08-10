package mtnm.tmforum.org.notifications;
/**
 * Generated from IDL enum "ObjectType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ObjectType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ObjectType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.notifications.ObjectType_THelper.id(),"ObjectType_T",new String[]{"OT_EMS","OT_MANAGED_ELEMENT","OT_MULTILAYER_SUBNETWORK","OT_TOPOLOGICAL_LINK","OT_SUBNETWORK_CONNECTION","OT_PHYSICAL_TERMINATION_POINT","OT_CONNECTION_TERMINATION_POINT","OT_TERMINATION_POINT_POOL","OT_EQUIPMENT_HOLDER","OT_EQUIPMENT","OT_PROTECTION_GROUP","OT_TRAFFIC_DESCRIPTOR","OT_AID"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.notifications.ObjectType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.notifications.ObjectType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/notifications/ObjectType_T:1.0";
	}
	public static ObjectType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ObjectType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ObjectType_T s)
	{
		out.write_long(s.value());
	}
}
