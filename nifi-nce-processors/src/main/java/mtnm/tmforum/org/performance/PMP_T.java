package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMP_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMP_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList;
	public mtnm.tmforum.org.performance.AdministrativeState_T monitoringState;
	public mtnm.tmforum.org.performance.AdministrativeState_T supervisionState;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMP_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList, mtnm.tmforum.org.performance.AdministrativeState_T monitoringState, mtnm.tmforum.org.performance.AdministrativeState_T supervisionState, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.pmParameterWithThresholdsList = pmParameterWithThresholdsList;
		this.monitoringState = monitoringState;
		this.supervisionState = supervisionState;
		this.additionalInfo = additionalInfo;
	}
}
