package mtnm.tmforum.org.managedElementManager;


/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface ManagedElementMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(int how_many, mtnm.tmforum.org.managedElement.ManagedElementList_THolder meList, mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder meIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainingSubnetworkNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder subnetNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllPTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder tp) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getManagedElement(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.managedElement.ManagedElement_THolder me) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedPotentialTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedInUseTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedInUseTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedCurrentTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainingTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainingTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setTPData(mtnm.tmforum.org.subnetworkConnection.TPData_T tpInfo, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder modifiedTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder ccList, mtnm.tmforum.org.subnetworkConnection.CCIterator_IHolder ccIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void checkActiveAlarms(org.omg.CosNotification.StructuredEvent[] activeEventList, mtnm.tmforum.org.notifications.EventList_THolder clearedEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedMeNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getNEStaticInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder staticInfoList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void activateCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createFTP(mtnm.tmforum.org.flowDomain.FTPCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyFTPMembers(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, java.lang.String modifyType, mtnm.tmforum.org.subnetworkConnection.TPData_T[] tpList, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder successedTPList, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFTPMembers(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getADCInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objName, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder adcInfoLst) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setADCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T adcInfo, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedadcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAPRInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objName, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder aprInfoLst) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAPRInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T aprInfo, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedaprInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAPEInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T apeInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setwdmALCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T wdmalcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setotnALCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T otnalcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllManagedElementGroups(int how_many, mtnm.tmforum.org.managedElement.neGroupInfoList_THolder neGroupInfoList, mtnm.tmforum.org.managedElement.neGroupInfoListIterator_IHolder neGroupInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllManagedElementsWithMEGroup(java.lang.String[] neGroupNameList, mtnm.tmforum.org.managedElement.neGroupList_THolder neGroupList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyCrossConnection(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T ccToModify, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T newCc, mtnm.tmforum.org.subnetworkConnection.CrossConnect_THolder modifiedCc) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAvailableTimeSlot(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, org.omg.CORBA.StringHolder timeslot) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllLLDPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.managedElement.PortLLDPList_THolder portLLDPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}