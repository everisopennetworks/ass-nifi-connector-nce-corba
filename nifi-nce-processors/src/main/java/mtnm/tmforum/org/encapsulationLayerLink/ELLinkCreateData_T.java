package mtnm.tmforum.org.encapsulationLayerLink;

/**
 * Generated from IDL struct "ELLinkCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ELLinkCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ELLinkCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public short rate;
	public mtnm.tmforum.org.encapsulationLayerLink.LinkType_T type;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs;
	public boolean segment;
	public mtnm.tmforum.org.encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode;
	public mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] sncList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] callName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public ELLinkCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, short rate, mtnm.tmforum.org.encapsulationLayerLink.LinkType_T type, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs, boolean segment, mtnm.tmforum.org.encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode, mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] sncList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] callName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.rate = rate;
		this.type = type;
		this.endTPs = endTPs;
		this.segment = segment;
		this.provisioningMode = provisioningMode;
		this.sncList = sncList;
		this.callName = callName;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
