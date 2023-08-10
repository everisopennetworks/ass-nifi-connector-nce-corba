package mtnm.tmforum.org.flowDomain_TI;

/**
 * Generated from IDL struct "FTPCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FTPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FTPCreateData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName;
	public mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode;
	public mtnm.tmforum.org.terminationPoint.Directionality_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName, mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode, mtnm.tmforum.org.terminationPoint.Directionality_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.ingressTransmissionDescriptorName = ingressTransmissionDescriptorName;
		this.egressTransmissionDescriptorName = egressTransmissionDescriptorName;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
