package mtnm.tmforum.org.terminationPoint;

/**
 * Generated from IDL struct "TerminationPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TerminationPoint_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public mtnm.tmforum.org.terminationPoint.TPType_T type;
	public mtnm.tmforum.org.terminationPoint.TPConnectionState_T connectionState;
	public mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode;
	public mtnm.tmforum.org.terminationPoint.Directionality_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TerminationPoint_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, mtnm.tmforum.org.terminationPoint.TPType_T type, mtnm.tmforum.org.terminationPoint.TPConnectionState_T connectionState, mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode, mtnm.tmforum.org.terminationPoint.Directionality_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalInfo = additionalInfo;
	}
}
