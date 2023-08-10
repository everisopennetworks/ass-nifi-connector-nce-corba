package mtnm.tmforum.org.managedElement;


/**
 * Generated from IDL struct "PortLLDP_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PortLLDP_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PortLLDP_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.PortLLDP_THelper.id(),"PortLLDP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.LLDP_Mode_THelper.id(),"LLDP_Mode_T",new String[]{"LLDP_DISABLE","LLDP_TRANSMIT","LLDP_RECEIVE","LLDP_RECEIVE_AND_TRANSMIT"}), null),new org.omg.CORBA.StructMember("multicastMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.MulticastMode_THelper.id(),"MulticastMode_T",new String[]{"NEAREST_NA","NEAREST_BRIDGE","NEAREST_NON_TPMR_BRIDGE","NEAREST_CUSTOMER_BRIDGE"}), null),new org.omg.CORBA.StructMember("neighborID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborHoldTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborRemainTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborInfoList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfoList_THelper.id(), "PortLLDPNeighboringInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.id(),"PortLLDPNeighboringInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("neighboringNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("destinationAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.id(),"NeighboringNodeType_T",new String[]{"NODE_TYPE_NA","NODE_TYPE_CHASSIS_ID","NODE_TYPE_PORT_ID","NODE_TYPE_TIME_TO_LIVE","NODE_TYPE_PORT_DESCRIPTION","NODE_TYPE_SYSTEM_NAME","NODE_TYPE_SYSTEM_DESCRIPTION","NODE_TYPE_SYSTEM_CAPABILITIES","NODE_TYPE_MANAGEMENT_ADDRESS","NODE_TYPE_ORGANIZATIONALLY_SPECIFIC"}), null),new org.omg.CORBA.StructMember("subtype", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.id(),"NeighboringNodeSubType_T",new String[]{"NODE_SUBTYPE_NA","NODE_SUBTYPE_AGENT_CIRCUIT_ID","NODE_SUBTYPE_CHASSIS_COMPONENT","NODE_SUBTYPE_IP_ADDRESS","NODE_SUBTYPE_INTERFACE_ALIAS","NODE_SUBTYPE_INTERFACE_NAME","NODE_SUBTYPE_LOCALLY_ASSIGNED","NODE_SUBTYPE_LINK_AGGREGATION","NODE_SUBTYPE_MAC_ADDRESS","NODE_SUBTYPE_MAXIMUM_FRAME_SIZE","NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS","NODE_SUBTYPE_MANAGEMENT_VID","NODE_SUBTYPE_NETWORK_ADDRESS","NODE_SUBTYPE_PORT_COMPONENT","NODE_SUBTYPE_PROTOCOL_IDENTITY","NODE_SUBTYPE_PORT_VLAN_ID","NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID","NODE_SUBTYPE_POWER_VIA_MDI","NODE_SUBTYPE_VLAN_NAME","NODE_SUBTYPE_VID_USAGE_DIGEST"}), null),new org.omg.CORBA.StructMember("information", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.PortLLDP_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.PortLLDP_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/PortLLDP_T:1.0";
	}
	public static mtnm.tmforum.org.managedElement.PortLLDP_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.managedElement.PortLLDP_T result = new mtnm.tmforum.org.managedElement.PortLLDP_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.mode=mtnm.tmforum.org.managedElement.LLDP_Mode_THelper.read(in);
		result.multicastMode=mtnm.tmforum.org.managedElement.MulticastMode_THelper.read(in);
		result.neighborID=in.read_long();
		result.neighborHoldTime=in.read_long();
		result.neighborRemainTime=in.read_long();
		result.neighborInfoList = mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfoList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.managedElement.PortLLDP_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		mtnm.tmforum.org.managedElement.LLDP_Mode_THelper.write(out,s.mode);
		mtnm.tmforum.org.managedElement.MulticastMode_THelper.write(out,s.multicastMode);
		out.write_long(s.neighborID);
		out.write_long(s.neighborHoldTime);
		out.write_long(s.neighborRemainTime);
		mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfoList_THelper.write(out,s.neighborInfoList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
