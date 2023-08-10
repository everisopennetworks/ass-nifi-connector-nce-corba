package mtnm.tmforum.org.emsMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.emsMgr.EMSMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.emsMgr.EMSMgr_I __r = mtnm.tmforum.org.emsMgr.EMSMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.emsMgr.EMSMgr_I __r = mtnm.tmforum.org.emsMgr.EMSMgr_IHelper.narrow(__o);
		return __r;
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
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
	public void getObjectClockSourceStatus(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getObjectClockSourceStatus(managedElementName,clockSourceStatusList);
	}

	public void getAllTopLevelSubnetworks(int how_many, mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkList_THolder sList, mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(how_many,sList,sIt);
	}

	public void setAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(resourceName);
	}

	public void getTPFaultStatus(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTPFaultStatus(tpNameList,tpFaultStatusList);
	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
	}

	public void getAllHistoryAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllHistoryAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getAllSecondlyAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.notifications.EventList_THolder eventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSecondlyAlarms(alarmList,eventList);
	}

	public void getAllHistoryAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllHistoryAlarmsByFTP(destination,userName,password,meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void clearAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.clearAlarms(alarmList,failedAlarmList);
	}

	public void setAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(resourceName);
	}

	public void getAllTopLevelSubnetworkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
	}

	public void getAllActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getObjectRootAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getObjectRootAlarms(objectName,startTime,endTime,how_many,eventList,eventIt);
	}

	public void getTopLevelTopologicalLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoLinkName, mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder topoLink) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(topoLinkName,topoLink);
	}

	public void setEMSHeartbeatInterval(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ems, int interval) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setEMSHeartbeatInterval(ems,interval);
	}

	public void getAlarmAffectedServiceNames(java.lang.String serialNumber, mtnm.tmforum.org.emsMgr.ServiceNameList_THolder serviceNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmAffectedServiceNames(serialNumber,serviceNameList);
	}

	public void getEMSTime(mtnm.tmforum.org.globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEMSTime(emsName,emsTime);
	}

	public void getEMS(mtnm.tmforum.org.emsMgr.EMS_THolder emsInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllRedefineAlarmDatas(mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T[] queryConditionList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder redefineAlarmDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllRedefineAlarmDatas(queryConditionList,redefineAlarmDataList);
	}

	public void getAllTopLevelTopologicalLinks(int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
	}

	public void getAllEMSSystemActiveAlarms(mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllAlarmStaticInfo(int how_many, mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THolder alarmInfoList, mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHolder alarmInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmStaticInfo(how_many,alarmInfoList,alarmInfoIt);
	}

	public void acknowledgeAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void getAlarmCount(mtnm.tmforum.org.notifications.PerceivedSeverity_T[] severityList, org.omg.CORBA.IntHolder count) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmCount(severityList,count);
	}

	public void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.emsMgr.InventoryType_T[] typeList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getInventory(destination,userName,password,typeList);
	}

	public void redefineAlarmData(java.lang.String actionType, mtnm.tmforum.org.emsMgr.RedefineAlarmData_T[] redefineAlarmDataList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder successRedefineDataList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder failedRedefineDataList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.redefineAlarmData(actionType,redefineAlarmDataList,successRedefineDataList,failedRedefineDataList,errorReason);
	}

	public void unacknowledgeAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(alarmList,failedAlarmList);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setEMSTime(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setEMSTime(emsName,settedTime);
	}

	public void getEMSHeartbeatInterval(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEMSHeartbeatInterval(ems,interval);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getHistoryAlarmDataByPull(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryAlarmDataByPull(nameList,taskName,compressType,packingType,excludeProbCauseList,excludeSeverityList,startTime,endTime);
	}

	public void setAlarmsRemarkInfo(mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T[] alarmRemarkInfoList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmsRemarkInfo(alarmRemarkInfoList,failedAlarmList);
	}

}
