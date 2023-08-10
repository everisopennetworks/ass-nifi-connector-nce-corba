package mtnm.tmforum.org.emsMgr;
/**
 * Generated from IDL enum "InventoryType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class InventoryType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TYPE_EMS = 0;
	public static final InventoryType_T TYPE_EMS = new InventoryType_T(_TYPE_EMS);
	public static final int _TYPE_MANAGEDELEMENT = 1;
	public static final InventoryType_T TYPE_MANAGEDELEMENT = new InventoryType_T(_TYPE_MANAGEDELEMENT);
	public static final int _TYPE_RACK = 2;
	public static final InventoryType_T TYPE_RACK = new InventoryType_T(_TYPE_RACK);
	public static final int _TYPE_SHELF = 3;
	public static final InventoryType_T TYPE_SHELF = new InventoryType_T(_TYPE_SHELF);
	public static final int _TYPE_SLOT = 4;
	public static final InventoryType_T TYPE_SLOT = new InventoryType_T(_TYPE_SLOT);
	public static final int _TYPE_EQUIPMENT = 5;
	public static final InventoryType_T TYPE_EQUIPMENT = new InventoryType_T(_TYPE_EQUIPMENT);
	public static final int _TYPE_PTP = 6;
	public static final InventoryType_T TYPE_PTP = new InventoryType_T(_TYPE_PTP);
	public static final int _TYPE_IPCROSSCONNECTION = 7;
	public static final InventoryType_T TYPE_IPCROSSCONNECTION = new InventoryType_T(_TYPE_IPCROSSCONNECTION);
	public static final int _TYPE_TOPOLOGICALLINK = 8;
	public static final InventoryType_T TYPE_TOPOLOGICALLINK = new InventoryType_T(_TYPE_TOPOLOGICALLINK);
	public static final int _TYPE_MFDFR = 9;
	public static final InventoryType_T TYPE_MFDFR = new InventoryType_T(_TYPE_MFDFR);
	public static final int _TYPE_TCPROFILE = 10;
	public static final InventoryType_T TYPE_TCPROFILE = new InventoryType_T(_TYPE_TCPROFILE);
	public static final int _TYPE_IPPROTECTIONGROUP = 11;
	public static final InventoryType_T TYPE_IPPROTECTIONGROUP = new InventoryType_T(_TYPE_IPPROTECTIONGROUP);
	public static final int _TYPE_EPROTECTION = 12;
	public static final InventoryType_T TYPE_EPROTECTION = new InventoryType_T(_TYPE_EPROTECTION);
	public static final int _TYPE_TOPOSUBNETWORKVIEW = 13;
	public static final InventoryType_T TYPE_TOPOSUBNETWORKVIEW = new InventoryType_T(_TYPE_TOPOSUBNETWORKVIEW);
	public static final int _TYPE_TRAFFICTRUNK = 14;
	public static final InventoryType_T TYPE_TRAFFICTRUNK = new InventoryType_T(_TYPE_TRAFFICTRUNK);
	public static final int _TYPE_SNC = 15;
	public static final InventoryType_T TYPE_SNC = new InventoryType_T(_TYPE_SNC);
	public static final int _TYPE_FDFR = 16;
	public static final InventoryType_T TYPE_FDFR = new InventoryType_T(_TYPE_FDFR);
	public static final int _TYPE_TRAILNETWORKPROTECTION = 17;
	public static final InventoryType_T TYPE_TRAILNETWORKPROTECTION = new InventoryType_T(_TYPE_TRAILNETWORKPROTECTION);
	public static final int _TYPE_VRRP = 18;
	public static final InventoryType_T TYPE_VRRP = new InventoryType_T(_TYPE_VRRP);
	public static final int _TYPE_FRR = 19;
	public static final InventoryType_T TYPE_FRR = new InventoryType_T(_TYPE_FRR);
	public static final int _TYPE_STATICROUTING = 20;
	public static final InventoryType_T TYPE_STATICROUTING = new InventoryType_T(_TYPE_STATICROUTING);
	public static final int _TYPE_BRIDGE = 21;
	public static final InventoryType_T TYPE_BRIDGE = new InventoryType_T(_TYPE_BRIDGE);
	public static final int _TYPE_VRF = 22;
	public static final InventoryType_T TYPE_VRF = new InventoryType_T(_TYPE_VRF);
	public static final int _TYPE_SNCROUTE = 23;
	public static final InventoryType_T TYPE_SNCROUTE = new InventoryType_T(_TYPE_SNCROUTE);
	public static final int _TYPE_FDFRROUTE = 24;
	public static final InventoryType_T TYPE_FDFRROUTE = new InventoryType_T(_TYPE_FDFRROUTE);
	public int value()
	{
		return value;
	}
	public static InventoryType_T from_int(int value)
	{
		switch (value) {
			case _TYPE_EMS: return TYPE_EMS;
			case _TYPE_MANAGEDELEMENT: return TYPE_MANAGEDELEMENT;
			case _TYPE_RACK: return TYPE_RACK;
			case _TYPE_SHELF: return TYPE_SHELF;
			case _TYPE_SLOT: return TYPE_SLOT;
			case _TYPE_EQUIPMENT: return TYPE_EQUIPMENT;
			case _TYPE_PTP: return TYPE_PTP;
			case _TYPE_IPCROSSCONNECTION: return TYPE_IPCROSSCONNECTION;
			case _TYPE_TOPOLOGICALLINK: return TYPE_TOPOLOGICALLINK;
			case _TYPE_MFDFR: return TYPE_MFDFR;
			case _TYPE_TCPROFILE: return TYPE_TCPROFILE;
			case _TYPE_IPPROTECTIONGROUP: return TYPE_IPPROTECTIONGROUP;
			case _TYPE_EPROTECTION: return TYPE_EPROTECTION;
			case _TYPE_TOPOSUBNETWORKVIEW: return TYPE_TOPOSUBNETWORKVIEW;
			case _TYPE_TRAFFICTRUNK: return TYPE_TRAFFICTRUNK;
			case _TYPE_SNC: return TYPE_SNC;
			case _TYPE_FDFR: return TYPE_FDFR;
			case _TYPE_TRAILNETWORKPROTECTION: return TYPE_TRAILNETWORKPROTECTION;
			case _TYPE_VRRP: return TYPE_VRRP;
			case _TYPE_FRR: return TYPE_FRR;
			case _TYPE_STATICROUTING: return TYPE_STATICROUTING;
			case _TYPE_BRIDGE: return TYPE_BRIDGE;
			case _TYPE_VRF: return TYPE_VRF;
			case _TYPE_SNCROUTE: return TYPE_SNCROUTE;
			case _TYPE_FDFRROUTE: return TYPE_FDFRROUTE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TYPE_EMS: return "TYPE_EMS";
			case _TYPE_MANAGEDELEMENT: return "TYPE_MANAGEDELEMENT";
			case _TYPE_RACK: return "TYPE_RACK";
			case _TYPE_SHELF: return "TYPE_SHELF";
			case _TYPE_SLOT: return "TYPE_SLOT";
			case _TYPE_EQUIPMENT: return "TYPE_EQUIPMENT";
			case _TYPE_PTP: return "TYPE_PTP";
			case _TYPE_IPCROSSCONNECTION: return "TYPE_IPCROSSCONNECTION";
			case _TYPE_TOPOLOGICALLINK: return "TYPE_TOPOLOGICALLINK";
			case _TYPE_MFDFR: return "TYPE_MFDFR";
			case _TYPE_TCPROFILE: return "TYPE_TCPROFILE";
			case _TYPE_IPPROTECTIONGROUP: return "TYPE_IPPROTECTIONGROUP";
			case _TYPE_EPROTECTION: return "TYPE_EPROTECTION";
			case _TYPE_TOPOSUBNETWORKVIEW: return "TYPE_TOPOSUBNETWORKVIEW";
			case _TYPE_TRAFFICTRUNK: return "TYPE_TRAFFICTRUNK";
			case _TYPE_SNC: return "TYPE_SNC";
			case _TYPE_FDFR: return "TYPE_FDFR";
			case _TYPE_TRAILNETWORKPROTECTION: return "TYPE_TRAILNETWORKPROTECTION";
			case _TYPE_VRRP: return "TYPE_VRRP";
			case _TYPE_FRR: return "TYPE_FRR";
			case _TYPE_STATICROUTING: return "TYPE_STATICROUTING";
			case _TYPE_BRIDGE: return "TYPE_BRIDGE";
			case _TYPE_VRF: return "TYPE_VRF";
			case _TYPE_SNCROUTE: return "TYPE_SNCROUTE";
			case _TYPE_FDFRROUTE: return "TYPE_FDFRROUTE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected InventoryType_T(int i)
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
