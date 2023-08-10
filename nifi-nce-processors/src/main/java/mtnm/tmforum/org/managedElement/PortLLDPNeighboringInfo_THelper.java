package mtnm.tmforum.org.managedElement;


/**
 * Generated from IDL struct "PortLLDPNeighboringInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PortLLDPNeighboringInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PortLLDPNeighboringInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.id(),"PortLLDPNeighboringInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("neighboringNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("destinationAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.id(),"NeighboringNodeType_T",new String[]{"NODE_TYPE_NA","NODE_TYPE_CHASSIS_ID","NODE_TYPE_PORT_ID","NODE_TYPE_TIME_TO_LIVE","NODE_TYPE_PORT_DESCRIPTION","NODE_TYPE_SYSTEM_NAME","NODE_TYPE_SYSTEM_DESCRIPTION","NODE_TYPE_SYSTEM_CAPABILITIES","NODE_TYPE_MANAGEMENT_ADDRESS","NODE_TYPE_ORGANIZATIONALLY_SPECIFIC"}), null),new org.omg.CORBA.StructMember("subtype", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.id(),"NeighboringNodeSubType_T",new String[]{"NODE_SUBTYPE_NA","NODE_SUBTYPE_AGENT_CIRCUIT_ID","NODE_SUBTYPE_CHASSIS_COMPONENT","NODE_SUBTYPE_IP_ADDRESS","NODE_SUBTYPE_INTERFACE_ALIAS","NODE_SUBTYPE_INTERFACE_NAME","NODE_SUBTYPE_LOCALLY_ASSIGNED","NODE_SUBTYPE_LINK_AGGREGATION","NODE_SUBTYPE_MAC_ADDRESS","NODE_SUBTYPE_MAXIMUM_FRAME_SIZE","NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS","NODE_SUBTYPE_MANAGEMENT_VID","NODE_SUBTYPE_NETWORK_ADDRESS","NODE_SUBTYPE_PORT_COMPONENT","NODE_SUBTYPE_PROTOCOL_IDENTITY","NODE_SUBTYPE_PORT_VLAN_ID","NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID","NODE_SUBTYPE_POWER_VIA_MDI","NODE_SUBTYPE_VLAN_NAME","NODE_SUBTYPE_VID_USAGE_DIGEST"}), null),new org.omg.CORBA.StructMember("information", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/PortLLDPNeighboringInfo_T:1.0";
	}
	public static mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T result = new mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T();
		result.neighboringNumber=in.read_long();
		result.destinationAddress=in.read_string();
		result.type=mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.read(in);
		result.subtype=mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.read(in);
		result.information=in.read_string();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T s)
	{
		out.write_long(s.neighboringNumber);
		java.lang.String tmpResult494 = s.destinationAddress;
out.write_string( tmpResult494 );
		mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.write(out,s.type);
		mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.write(out,s.subtype);
		java.lang.String tmpResult495 = s.information;
out.write_string( tmpResult495 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
