package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "PortLLDPList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PortLLDPList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.tmforum.org.managedElement.PortLLDP_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.tmforum.org.managedElement.PortLLDP_T[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PortLLDPList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.managedElement.PortLLDPList_THelper.id(), "PortLLDPList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.PortLLDP_THelper.id(),"PortLLDP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("mode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.LLDP_Mode_THelper.id(),"LLDP_Mode_T",new String[]{"LLDP_DISABLE","LLDP_TRANSMIT","LLDP_RECEIVE","LLDP_RECEIVE_AND_TRANSMIT"}), null),new org.omg.CORBA.StructMember("multicastMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.MulticastMode_THelper.id(),"MulticastMode_T",new String[]{"NEAREST_NA","NEAREST_BRIDGE","NEAREST_NON_TPMR_BRIDGE","NEAREST_CUSTOMER_BRIDGE"}), null),new org.omg.CORBA.StructMember("neighborID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborHoldTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborRemainTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("neighborInfoList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfoList_THelper.id(), "PortLLDPNeighboringInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.id(),"PortLLDPNeighboringInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("neighboringNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("destinationAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeType_THelper.id(),"NeighboringNodeType_T",new String[]{"NODE_TYPE_NA","NODE_TYPE_CHASSIS_ID","NODE_TYPE_PORT_ID","NODE_TYPE_TIME_TO_LIVE","NODE_TYPE_PORT_DESCRIPTION","NODE_TYPE_SYSTEM_NAME","NODE_TYPE_SYSTEM_DESCRIPTION","NODE_TYPE_SYSTEM_CAPABILITIES","NODE_TYPE_MANAGEMENT_ADDRESS","NODE_TYPE_ORGANIZATIONALLY_SPECIFIC"}), null),new org.omg.CORBA.StructMember("subtype", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.NeighboringNodeSubType_THelper.id(),"NeighboringNodeSubType_T",new String[]{"NODE_SUBTYPE_NA","NODE_SUBTYPE_AGENT_CIRCUIT_ID","NODE_SUBTYPE_CHASSIS_COMPONENT","NODE_SUBTYPE_IP_ADDRESS","NODE_SUBTYPE_INTERFACE_ALIAS","NODE_SUBTYPE_INTERFACE_NAME","NODE_SUBTYPE_LOCALLY_ASSIGNED","NODE_SUBTYPE_LINK_AGGREGATION","NODE_SUBTYPE_MAC_ADDRESS","NODE_SUBTYPE_MAXIMUM_FRAME_SIZE","NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS","NODE_SUBTYPE_MANAGEMENT_VID","NODE_SUBTYPE_NETWORK_ADDRESS","NODE_SUBTYPE_PORT_COMPONENT","NODE_SUBTYPE_PROTOCOL_IDENTITY","NODE_SUBTYPE_PORT_VLAN_ID","NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID","NODE_SUBTYPE_POWER_VIA_MDI","NODE_SUBTYPE_VLAN_NAME","NODE_SUBTYPE_VID_USAGE_DIGEST"}), null),new org.omg.CORBA.StructMember("information", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/PortLLDPList_T:1.0";
	}
	public static mtnm.tmforum.org.managedElement.PortLLDP_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.tmforum.org.managedElement.PortLLDP_T[] _result;
		int _l_result119 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result119 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result119);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.tmforum.org.managedElement.PortLLDP_T[_l_result119];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.tmforum.org.managedElement.PortLLDP_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.tmforum.org.managedElement.PortLLDP_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.tmforum.org.managedElement.PortLLDP_THelper.write(_out,_s[i]);
		}

	}
}
