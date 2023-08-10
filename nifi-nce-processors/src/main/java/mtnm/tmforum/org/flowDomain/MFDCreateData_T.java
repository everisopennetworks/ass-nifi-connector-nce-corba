package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "MFDCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MFDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MFDCreateData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] transmissionDescriptorName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] unassignedCPTPs;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public MFDCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] transmissionDescriptorName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] unassignedCPTPs, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionDescriptorName = transmissionDescriptorName;
		this.unassignedCPTPs = unassignedCPTPs;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
