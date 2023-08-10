package mtnm.tmforum.org.flowDomainFragment_cmcc;

/**
 * Generated from IDL struct "FDFrCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FDFrCreateData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public boolean fullRoute;
	public java.lang.String fdfrType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, boolean fullRoute, java.lang.String fdfrType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.direction = direction;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.fullRoute = fullRoute;
		this.fdfrType = fdfrType;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
