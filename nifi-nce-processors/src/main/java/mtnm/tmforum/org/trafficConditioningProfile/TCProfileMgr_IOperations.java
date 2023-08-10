package mtnm.tmforum.org.trafficConditioningProfile;


/**
 * Generated from IDL interface "TCProfileMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface TCProfileMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTCProfiles(int how_many, mtnm.tmforum.org.trafficConditioningProfile.TCProfileList_THolder tcProfileList, mtnm.tmforum.org.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder tcProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createTCProfile(mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllTCProfileNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder tcProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllTCProfiles(int how_many, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileIterator_IHolder tcProfileIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_createTCProfile(mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T newTCProfileCreateData, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder newTCProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_modifyTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T tcProfileModifyData, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void assignTrafficConditioningProfile(mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] resourceList, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder failedResourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deassignTrafficConditioningProfile(mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] resourceList, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder failedResourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedResouces(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder resourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
