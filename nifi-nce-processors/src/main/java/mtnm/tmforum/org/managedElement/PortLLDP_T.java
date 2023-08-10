package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "PortLLDP_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortLLDP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PortLLDP_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public mtnm.tmforum.org.managedElement.LLDP_Mode_T mode;
	public mtnm.tmforum.org.managedElement.MulticastMode_T multicastMode;
	public int neighborID;
	public int neighborHoldTime;
	public int neighborRemainTime;
	public mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T[] neighborInfoList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PortLLDP_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.managedElement.LLDP_Mode_T mode, mtnm.tmforum.org.managedElement.MulticastMode_T multicastMode, int neighborID, int neighborHoldTime, int neighborRemainTime, mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T[] neighborInfoList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.mode = mode;
		this.multicastMode = multicastMode;
		this.neighborID = neighborID;
		this.neighborHoldTime = neighborHoldTime;
		this.neighborRemainTime = neighborRemainTime;
		this.neighborInfoList = neighborInfoList;
		this.additionalInfo = additionalInfo;
	}
}
