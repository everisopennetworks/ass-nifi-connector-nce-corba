package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EMSMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getEMS(mtnm.tmforum.org.emsMgr.EMS_THolder emsInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworks(int how_many, mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkList_THolder sList, mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTopLevelSubnetworkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinks(int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTopLevelTopologicalLinkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTopLevelTopologicalLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoLinkName, mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder topoLink) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEMSSystemActiveAlarms(mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getObjectRootAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getObjectClockSourceStatus(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, mtnm.tmforum.org.emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void acknowledgeAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void unacknowledgeAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.emsMgr.InventoryType_T[] typeList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEMSHeartbeatInterval(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setEMSHeartbeatInterval(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ems, int interval) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllActiveAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllHistoryAlarms(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.notifications.EventList_THolder eventList, mtnm.tmforum.org.notifications.EventIterator_IHolder eventIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEMSTime(mtnm.tmforum.org.globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setEMSTime(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmsRemarkInfo(mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T[] alarmRemarkInfoList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTPFaultStatus(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void clearAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAlarmCount(mtnm.tmforum.org.notifications.PerceivedSeverity_T[] severityList, org.omg.CORBA.IntHolder count) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSecondlyAlarms(java.lang.String[] alarmList, mtnm.tmforum.org.notifications.EventList_THolder eventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAlarmAffectedServiceNames(java.lang.String serialNumber, mtnm.tmforum.org.emsMgr.ServiceNameList_THolder serviceNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void redefineAlarmData(java.lang.String actionType, mtnm.tmforum.org.emsMgr.RedefineAlarmData_T[] redefineAlarmDataList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder successRedefineDataList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder failedRedefineDataList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllRedefineAlarmDatas(mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T[] queryConditionList, mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder redefineAlarmDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllAlarmStaticInfo(int how_many, mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THolder alarmInfoList, mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHolder alarmInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllHistoryAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getHistoryAlarmDataByPull(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, mtnm.tmforum.org.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
