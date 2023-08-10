package mtnm.tmforum.org.trailNtwProtection;


/**
 * Generated from IDL interface "TrailNtwProtMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface TrailNtwProtMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrailNtwProtections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName, int how_many, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THolder tnpList, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHolder tnpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _trailNtwProtection) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createTrailNtwProtection(mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T tnpCreateData, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder theTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T tnpModifyData, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder modifiedTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, boolean keepPGs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] swapTPname, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo, mtnm.tmforum.org.protection.ProtectionGroupList_THolder deletedPGList, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder deletedTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performTrailNtwProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
