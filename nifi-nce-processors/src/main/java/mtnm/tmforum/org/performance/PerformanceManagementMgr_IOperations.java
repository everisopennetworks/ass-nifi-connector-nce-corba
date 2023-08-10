package mtnm.tmforum.org.performance;


/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface PerformanceManagementMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMEPMcapabilities(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, short layerRate, mtnm.tmforum.org.performance.PMParameterList_THolder pmParameterList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void disablePMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void enablePMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void clearPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getHoldingTime(mtnm.tmforum.org.performance.HoldingTime_THolder holdingTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTCATPParameter(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, mtnm.tmforum.org.performance.TCAParameters_THolder tcaParameter) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTPHistoryPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.performance.PMDataList_THolder pmDataList, mtnm.tmforum.org.performance.PMDataIterator_IHolder pmIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllPMPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.performance.PMPList_THolder pmpList, mtnm.tmforum.org.performance.PMPIterator_IHolder pmpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllPMPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllCurrentPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, mtnm.tmforum.org.performance.PMDataList_THolder pmDataList, mtnm.tmforum.org.performance.PMDataIterator_IHolder pmIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getPMState(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, mtnm.tmforum.org.performance.PMStateList_THolder pmStateList, mtnm.tmforum.org.performance.PMStateIterator_IHolder pmStateIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setTCATPParameter(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.performance.TCAParameters_THolder tcaParameters) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void enableTCA(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void disableTCA(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createPMCollectionTask(java.lang.String taskName, java.lang.String destination, java.lang.String userName, java.lang.String password, java.lang.String emsUserName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pmTPSelectList, java.lang.String period, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deletePMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void selectPMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName, mtnm.tmforum.org.performance.CollectTaskInfoList_THolder taskInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void SuspendPMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void ResumePMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void ModifyPMCollectionTask(java.lang.String oldTaskName, java.lang.String newTaskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setTCANotifySwitch(boolean tcaNotifySwitch) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createPerformanceMonitoringData(mtnm.tmforum.org.performance.PerformanceCreateInstance_T createInstance, mtnm.tmforum.org.performance.PerformanceCreateInstanceList_THolder failedInstanceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deletePerformanceMonitoringData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTpSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTpSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getPfmInstanceByResource(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef, short[] layerRateList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo, mtnm.tmforum.org.performance.PerformanceMonitoringInstanceList_THolder instanceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
