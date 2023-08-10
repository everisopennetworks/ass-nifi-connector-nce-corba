package mtnm.tmforum.org.flowDomainFragment;

/**
 * Generated from IDL struct "FlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FlowDomainFragment_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public mtnm.tmforum.org.subnetworkConnection.SNCState_T fdfrState;
	public mtnm.tmforum.org.flowDomainFragment.FDFrType_T fdfrType;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomainFragment_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs, java.lang.String networkAccessDomain, boolean flexible, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, mtnm.tmforum.org.subnetworkConnection.SNCState_T fdfrState, mtnm.tmforum.org.flowDomainFragment.FDFrType_T fdfrType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.endTPs = endTPs;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.administrativeState = administrativeState;
		this.fdfrState = fdfrState;
		this.fdfrType = fdfrType;
		this.additionalInfo = additionalInfo;
	}
}
