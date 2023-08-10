package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "HW_TrafficClassifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_TrafficClassifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_TrafficClassifier_T(){}
	public java.lang.String classifierID = "";
	public java.lang.String logicalRelationType = "";
	public java.lang.String action = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public HW_TrafficClassifier_T(java.lang.String classifierID, java.lang.String logicalRelationType, java.lang.String action, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams)
	{
		this.classifierID = classifierID;
		this.logicalRelationType = logicalRelationType;
		this.action = action;
		this.transmissionParams = transmissionParams;
	}
}
