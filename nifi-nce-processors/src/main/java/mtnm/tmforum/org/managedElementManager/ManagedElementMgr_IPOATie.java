package mtnm.tmforum.org.managedElementManager;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class ManagedElementMgr_IPOATie
	extends ManagedElementMgr_IPOA
{
	private ManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I __r = mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I __r = mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IHelper.narrow(__o);
		return __r;
	}
	public ManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void getAllManagedElements(int how_many, mtnm.tmforum.org.managedElement.ManagedElementList_THolder meList, mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder meIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(how_many,meList,meIt);
	}

	public void getAvailableTimeSlot(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, org.omg.CORBA.StringHolder timeslot) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAvailableTimeSlot(tpName,timeslot);
	}

	public void createCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void activateCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void checkActiveAlarms(org.omg.CosNotification.StructuredEvent[] activeEventList, mtnm.tmforum.org.notifications.EventList_THolder clearedEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.checkActiveAlarms(activeEventList,clearedEventList);
	}

	public void deactivateCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void modifyFTPMembers(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, java.lang.String modifyType, mtnm.tmforum.org.subnetworkConnection.TPData_T[] tpList, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder successedTPList, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFTPMembers(ftpName,modifyType,tpList,successedTPList,failedTPList);
	}

	public void setAPRInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T aprInfo, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedaprInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAPRInfo(aprInfo,modifiedaprInfo);
	}

	public void getContainedPotentialTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainedInUseTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getAllPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getContainingTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPNames(tpName,tpNameList);
	}

	public void getContainedInUseTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void setAPEInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T apeInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAPEInfo(apeInfo);
	}

	public void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedMeNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmsByFTP(destination,userName,password,meNameList,excludeProbCauseList,excludeSeverityList,startTime,endTime,failedMeNameList);
	}

	public void getADCInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objName, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder adcInfoLst) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getADCInfo(objName,adcInfoLst);
	}

	public void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName);
	}

	public void modifyCrossConnection(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T ccToModify, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T newCc, mtnm.tmforum.org.subnetworkConnection.CrossConnect_THolder modifiedCc) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyCrossConnection(ccToModify,newCc,modifiedCc);
	}

	public void getAllManagedElementNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(how_many,nameList,nameIt);
	}

	public void getAllActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllPTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getNEStaticInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder staticInfoList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getNEStaticInfo(managedElementName,how_many,staticInfoList,staticInfoIt);
	}

	public void getContainedCurrentTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setotnALCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T otnalcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setotnALCInfo(otnalcInfo);
	}

	public void getActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getActiveAlarms(objectNameList,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainedPotentialTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void setwdmALCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T wdmalcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setwdmALCInfo(wdmalcInfo);
	}

	public void getAllManagedElementGroups(int how_many, mtnm.tmforum.org.managedElement.neGroupInfoList_THolder neGroupInfoList, mtnm.tmforum.org.managedElement.neGroupInfoListIterator_IHolder neGroupInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementGroups(how_many,neGroupInfoList,neGroupInfoIt);
	}

	public void getAllCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder ccList, mtnm.tmforum.org.subnetworkConnection.CCIterator_IHolder ccIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getContainingSubnetworkNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder subnetNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainingSubnetworkNames(managedElementName,subnetNames);
	}

	public void deleteCrossConnections(mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder successedCCList, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder failedCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getFTPMembers(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFTPMembers(ftpName,tpList);
	}

	public void getContainedCurrentTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainingTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPs(tpName,tpList);
	}

	public void getTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder tp) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAPRInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objName, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder aprInfoLst) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAPRInfo(objName,aprInfoLst);
	}

	public void getManagedElement(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.managedElement.ManagedElement_THolder me) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void setADCInfo(mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T adcInfo, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedadcInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setADCInfo(adcInfo,modifiedadcInfo);
	}

	public void getAllManagedElementsWithMEGroup(java.lang.String[] neGroupNameList, mtnm.tmforum.org.managedElement.neGroupList_THolder neGroupList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementsWithMEGroup(neGroupNameList,neGroupList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setTPData(mtnm.tmforum.org.subnetworkConnection.TPData_T tpInfo, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder modifiedTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void createFTP(mtnm.tmforum.org.flowDomain.FTPCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP);
	}

	public void getAllLLDPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.managedElement.PortLLDPList_THolder portLLDPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllLLDPs(name,portLLDPList);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
