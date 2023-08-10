package mtnm.tmforum.org.flowDomainFragment_TI;

/**
 * Generated from IDL struct "FDFrModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNamesToRemove;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEndTPNames;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEndTPNames;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] internalTPNames;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNamesToRemove, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEndTPNames, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEndTPNames, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] internalTPNames, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.tpNamesToRemove = tpNamesToRemove;
		this.aEndTPNames = aEndTPNames;
		this.zEndTPNames = zEndTPNames;
		this.internalTPNames = internalTPNames;
		this.additionalModificationInfo = additionalModificationInfo;
	}
}
