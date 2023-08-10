package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeSubType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NeighboringNodeSubType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NeighboringNodeSubType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.id(),"NeighboringNodeSubType_T",new String[]{"NODE_SUBTYPE_NA","NODE_SUBTYPE_AGENT_CIRCUIT_ID","NODE_SUBTYPE_CHASSIS_COMPONENT","NODE_SUBTYPE_IP_ADDRESS","NODE_SUBTYPE_INTERFACE_ALIAS","NODE_SUBTYPE_INTERFACE_NAME","NODE_SUBTYPE_LOCALLY_ASSIGNED","NODE_SUBTYPE_LINK_AGGREGATION","NODE_SUBTYPE_MAC_ADDRESS","NODE_SUBTYPE_MAXIMUM_FRAME_SIZE","NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS","NODE_SUBTYPE_MANAGEMENT_VID","NODE_SUBTYPE_NETWORK_ADDRESS","NODE_SUBTYPE_PORT_COMPONENT","NODE_SUBTYPE_PROTOCOL_IDENTITY","NODE_SUBTYPE_PORT_VLAN_ID","NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID","NODE_SUBTYPE_POWER_VIA_MDI","NODE_SUBTYPE_VLAN_NAME","NODE_SUBTYPE_VID_USAGE_DIGEST"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.NeighboringNodeSubType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.NeighboringNodeSubType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/NeighboringNodeSubType_T:1.0";
	}
	public static NeighboringNodeSubType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return NeighboringNodeSubType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NeighboringNodeSubType_T s)
	{
		out.write_long(s.value());
	}
}
