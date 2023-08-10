package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NeighboringNodeType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NeighboringNodeType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.id(),"NeighboringNodeType_T",new String[]{"NODE_TYPE_NA","NODE_TYPE_CHASSIS_ID","NODE_TYPE_PORT_ID","NODE_TYPE_TIME_TO_LIVE","NODE_TYPE_PORT_DESCRIPTION","NODE_TYPE_SYSTEM_NAME","NODE_TYPE_SYSTEM_DESCRIPTION","NODE_TYPE_SYSTEM_CAPABILITIES","NODE_TYPE_MANAGEMENT_ADDRESS","NODE_TYPE_ORGANIZATIONALLY_SPECIFIC"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.NeighboringNodeType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.NeighboringNodeType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/NeighboringNodeType_T:1.0";
	}
	public static NeighboringNodeType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return NeighboringNodeType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NeighboringNodeType_T s)
	{
		out.write_long(s.value());
	}
}
