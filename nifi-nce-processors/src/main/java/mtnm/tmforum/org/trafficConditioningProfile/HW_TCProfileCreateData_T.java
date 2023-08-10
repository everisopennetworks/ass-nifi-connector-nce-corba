package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "HW_TCProfileCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_TCProfileCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_TCProfileCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String type = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_TCProfileCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String type, java.lang.String owner, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.type = type;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.classifierList = classifierList;
		this.additionalInfo = additionalInfo;
	}
}
