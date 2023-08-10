package mtnm.tmforum.org.flowDomain;

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
	public java.lang.String ftpType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public mtnm.tmforum.org.terminationPoint.TPConnectionState_T connectionState;
	public mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode;
	public mtnm.tmforum.org.terminationPoint.Directionality_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String ftpType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, mtnm.tmforum.org.terminationPoint.TPConnectionState_T connectionState, mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode, mtnm.tmforum.org.terminationPoint.Directionality_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.ftpType = ftpType;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
