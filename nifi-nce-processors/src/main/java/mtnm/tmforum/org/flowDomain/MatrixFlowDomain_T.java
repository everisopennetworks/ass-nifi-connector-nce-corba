package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "MatrixFlowDomain_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MatrixFlowDomain_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] assignedCPTPs;
	public boolean flexible;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] transmissionDescriptorName;
	public java.lang.String transmissionDescriptorState = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomain_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] assignedCPTPs, boolean flexible, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] transmissionDescriptorName, java.lang.String transmissionDescriptorState, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.assignedCPTPs = assignedCPTPs;
		this.flexible = flexible;
		this.transmissionDescriptorName = transmissionDescriptorName;
		this.transmissionDescriptorState = transmissionDescriptorState;
		this.additionalInfo = additionalInfo;
	}
}
