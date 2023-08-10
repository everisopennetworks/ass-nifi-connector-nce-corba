package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeSubType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NeighboringNodeSubType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NODE_SUBTYPE_NA = 0;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_NA = new NeighboringNodeSubType_T(_NODE_SUBTYPE_NA);
	public static final int _NODE_SUBTYPE_AGENT_CIRCUIT_ID = 1;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_AGENT_CIRCUIT_ID = new NeighboringNodeSubType_T(_NODE_SUBTYPE_AGENT_CIRCUIT_ID);
	public static final int _NODE_SUBTYPE_CHASSIS_COMPONENT = 2;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_CHASSIS_COMPONENT = new NeighboringNodeSubType_T(_NODE_SUBTYPE_CHASSIS_COMPONENT);
	public static final int _NODE_SUBTYPE_IP_ADDRESS = 3;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_IP_ADDRESS = new NeighboringNodeSubType_T(_NODE_SUBTYPE_IP_ADDRESS);
	public static final int _NODE_SUBTYPE_INTERFACE_ALIAS = 4;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_INTERFACE_ALIAS = new NeighboringNodeSubType_T(_NODE_SUBTYPE_INTERFACE_ALIAS);
	public static final int _NODE_SUBTYPE_INTERFACE_NAME = 5;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_INTERFACE_NAME = new NeighboringNodeSubType_T(_NODE_SUBTYPE_INTERFACE_NAME);
	public static final int _NODE_SUBTYPE_LOCALLY_ASSIGNED = 6;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_LOCALLY_ASSIGNED = new NeighboringNodeSubType_T(_NODE_SUBTYPE_LOCALLY_ASSIGNED);
	public static final int _NODE_SUBTYPE_LINK_AGGREGATION = 7;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_LINK_AGGREGATION = new NeighboringNodeSubType_T(_NODE_SUBTYPE_LINK_AGGREGATION);
	public static final int _NODE_SUBTYPE_MAC_ADDRESS = 8;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_MAC_ADDRESS = new NeighboringNodeSubType_T(_NODE_SUBTYPE_MAC_ADDRESS);
	public static final int _NODE_SUBTYPE_MAXIMUM_FRAME_SIZE = 9;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_MAXIMUM_FRAME_SIZE = new NeighboringNodeSubType_T(_NODE_SUBTYPE_MAXIMUM_FRAME_SIZE);
	public static final int _NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS = 10;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS = new NeighboringNodeSubType_T(_NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS);
	public static final int _NODE_SUBTYPE_MANAGEMENT_VID = 11;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_MANAGEMENT_VID = new NeighboringNodeSubType_T(_NODE_SUBTYPE_MANAGEMENT_VID);
	public static final int _NODE_SUBTYPE_NETWORK_ADDRESS = 12;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_NETWORK_ADDRESS = new NeighboringNodeSubType_T(_NODE_SUBTYPE_NETWORK_ADDRESS);
	public static final int _NODE_SUBTYPE_PORT_COMPONENT = 13;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_PORT_COMPONENT = new NeighboringNodeSubType_T(_NODE_SUBTYPE_PORT_COMPONENT);
	public static final int _NODE_SUBTYPE_PROTOCOL_IDENTITY = 14;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_PROTOCOL_IDENTITY = new NeighboringNodeSubType_T(_NODE_SUBTYPE_PROTOCOL_IDENTITY);
	public static final int _NODE_SUBTYPE_PORT_VLAN_ID = 15;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_PORT_VLAN_ID = new NeighboringNodeSubType_T(_NODE_SUBTYPE_PORT_VLAN_ID);
	public static final int _NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID = 16;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID = new NeighboringNodeSubType_T(_NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID);
	public static final int _NODE_SUBTYPE_POWER_VIA_MDI = 17;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_POWER_VIA_MDI = new NeighboringNodeSubType_T(_NODE_SUBTYPE_POWER_VIA_MDI);
	public static final int _NODE_SUBTYPE_VLAN_NAME = 18;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_VLAN_NAME = new NeighboringNodeSubType_T(_NODE_SUBTYPE_VLAN_NAME);
	public static final int _NODE_SUBTYPE_VID_USAGE_DIGEST = 19;
	public static final NeighboringNodeSubType_T NODE_SUBTYPE_VID_USAGE_DIGEST = new NeighboringNodeSubType_T(_NODE_SUBTYPE_VID_USAGE_DIGEST);
	public int value()
	{
		return value;
	}
	public static NeighboringNodeSubType_T from_int(int value)
	{
		switch (value) {
			case _NODE_SUBTYPE_NA: return NODE_SUBTYPE_NA;
			case _NODE_SUBTYPE_AGENT_CIRCUIT_ID: return NODE_SUBTYPE_AGENT_CIRCUIT_ID;
			case _NODE_SUBTYPE_CHASSIS_COMPONENT: return NODE_SUBTYPE_CHASSIS_COMPONENT;
			case _NODE_SUBTYPE_IP_ADDRESS: return NODE_SUBTYPE_IP_ADDRESS;
			case _NODE_SUBTYPE_INTERFACE_ALIAS: return NODE_SUBTYPE_INTERFACE_ALIAS;
			case _NODE_SUBTYPE_INTERFACE_NAME: return NODE_SUBTYPE_INTERFACE_NAME;
			case _NODE_SUBTYPE_LOCALLY_ASSIGNED: return NODE_SUBTYPE_LOCALLY_ASSIGNED;
			case _NODE_SUBTYPE_LINK_AGGREGATION: return NODE_SUBTYPE_LINK_AGGREGATION;
			case _NODE_SUBTYPE_MAC_ADDRESS: return NODE_SUBTYPE_MAC_ADDRESS;
			case _NODE_SUBTYPE_MAXIMUM_FRAME_SIZE: return NODE_SUBTYPE_MAXIMUM_FRAME_SIZE;
			case _NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS: return NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS;
			case _NODE_SUBTYPE_MANAGEMENT_VID: return NODE_SUBTYPE_MANAGEMENT_VID;
			case _NODE_SUBTYPE_NETWORK_ADDRESS: return NODE_SUBTYPE_NETWORK_ADDRESS;
			case _NODE_SUBTYPE_PORT_COMPONENT: return NODE_SUBTYPE_PORT_COMPONENT;
			case _NODE_SUBTYPE_PROTOCOL_IDENTITY: return NODE_SUBTYPE_PROTOCOL_IDENTITY;
			case _NODE_SUBTYPE_PORT_VLAN_ID: return NODE_SUBTYPE_PORT_VLAN_ID;
			case _NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID: return NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID;
			case _NODE_SUBTYPE_POWER_VIA_MDI: return NODE_SUBTYPE_POWER_VIA_MDI;
			case _NODE_SUBTYPE_VLAN_NAME: return NODE_SUBTYPE_VLAN_NAME;
			case _NODE_SUBTYPE_VID_USAGE_DIGEST: return NODE_SUBTYPE_VID_USAGE_DIGEST;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NODE_SUBTYPE_NA: return "NODE_SUBTYPE_NA";
			case _NODE_SUBTYPE_AGENT_CIRCUIT_ID: return "NODE_SUBTYPE_AGENT_CIRCUIT_ID";
			case _NODE_SUBTYPE_CHASSIS_COMPONENT: return "NODE_SUBTYPE_CHASSIS_COMPONENT";
			case _NODE_SUBTYPE_IP_ADDRESS: return "NODE_SUBTYPE_IP_ADDRESS";
			case _NODE_SUBTYPE_INTERFACE_ALIAS: return "NODE_SUBTYPE_INTERFACE_ALIAS";
			case _NODE_SUBTYPE_INTERFACE_NAME: return "NODE_SUBTYPE_INTERFACE_NAME";
			case _NODE_SUBTYPE_LOCALLY_ASSIGNED: return "NODE_SUBTYPE_LOCALLY_ASSIGNED";
			case _NODE_SUBTYPE_LINK_AGGREGATION: return "NODE_SUBTYPE_LINK_AGGREGATION";
			case _NODE_SUBTYPE_MAC_ADDRESS: return "NODE_SUBTYPE_MAC_ADDRESS";
			case _NODE_SUBTYPE_MAXIMUM_FRAME_SIZE: return "NODE_SUBTYPE_MAXIMUM_FRAME_SIZE";
			case _NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS: return "NODE_SUBTYPE_MAC_PHY_CONFIGURATION_STATUS";
			case _NODE_SUBTYPE_MANAGEMENT_VID: return "NODE_SUBTYPE_MANAGEMENT_VID";
			case _NODE_SUBTYPE_NETWORK_ADDRESS: return "NODE_SUBTYPE_NETWORK_ADDRESS";
			case _NODE_SUBTYPE_PORT_COMPONENT: return "NODE_SUBTYPE_PORT_COMPONENT";
			case _NODE_SUBTYPE_PROTOCOL_IDENTITY: return "NODE_SUBTYPE_PROTOCOL_IDENTITY";
			case _NODE_SUBTYPE_PORT_VLAN_ID: return "NODE_SUBTYPE_PORT_VLAN_ID";
			case _NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID: return "NODE_SUBTYPE_PORT_AND_PROTOCOL_VLAN_ID";
			case _NODE_SUBTYPE_POWER_VIA_MDI: return "NODE_SUBTYPE_POWER_VIA_MDI";
			case _NODE_SUBTYPE_VLAN_NAME: return "NODE_SUBTYPE_VLAN_NAME";
			case _NODE_SUBTYPE_VID_USAGE_DIGEST: return "NODE_SUBTYPE_VID_USAGE_DIGEST";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NeighboringNodeSubType_T(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
