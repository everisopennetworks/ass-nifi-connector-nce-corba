package mtnm.tmforum.org.performance;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class PerformanceManagementMgr_IPOATie
	extends PerformanceManagementMgr_IPOA
{
	private PerformanceManagementMgr_IOperations _delegate;

	private POA _poa;
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PerformanceManagementMgr_IPOATie(PerformanceManagementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.performance.PerformanceManagementMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.performance.PerformanceManagementMgr_I __r = mtnm.tmforum.org.performance.PerformanceManagementMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.performance.PerformanceManagementMgr_I __r = mtnm.tmforum.org.performance.PerformanceManagementMgr_IHelper.narrow(__o);
		return __r;
	}
	public PerformanceManagementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PerformanceManagementMgr_IOperations delegate)
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
	public void getHistoryPMDataByPull(java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMDataByPull(taskName,compressType,packingType,pmTPSelectList,pmParameters,startTime,endTime);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getPMState(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, mtnm.tmforum.org.performance.PMStateList_THolder pmStateList, mtnm.tmforum.org.performance.PMStateIterator_IHolder pmStateIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getPMState(pmTPSelectList,pmParameters,how_many,pmStateList,pmStateIt);
	}

	public void setTCATPParameter(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.performance.TCAParameters_THolder tcaParameters) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setTCATPParameter(tpName,tcaParameters);
	}

	public void createPerformanceMonitoringData(mtnm.tmforum.org.performance.PerformanceCreateInstance_T createInstance, mtnm.tmforum.org.performance.PerformanceCreateInstanceList_THolder failedInstanceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createPerformanceMonitoringData(createInstance,failedInstanceList);
	}

	public void getTCATPParameter(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, mtnm.tmforum.org.performance.TCAParameters_THolder tcaParameter) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
	}

	public void enableTCA(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.enableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void ModifyPMCollectionTask(java.lang.String oldTaskName, java.lang.String newTaskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.ModifyPMCollectionTask(oldTaskName,newTaskName,emsUserName);
	}

	public void clearPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.clearPMData(pmTPSelectList,failedTPSelectList);
	}

	public void disablePMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.disablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void disableTCA(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.disableTCA(pmTPSelectList,failedTPSelectList);
	}

	public void getAllPMPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPNames(tpOrMeName,how_many,nameList,nameIt);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deletePerformanceMonitoringData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTpSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTpSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deletePerformanceMonitoringData(pmTpSelectList,failedTpSelectList);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void selectPMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName, mtnm.tmforum.org.performance.CollectTaskInfoList_THolder taskInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.selectPMCollectionTask(taskNameList,emsUserName,taskInfoList);
	}

	public void getPfmInstanceByResource(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef, short[] layerRateList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo, mtnm.tmforum.org.performance.PerformanceMonitoringInstanceList_THolder instanceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getPfmInstanceByResource(resourceRef,layerRateList,additionalInfo,instanceList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllCurrentPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, mtnm.tmforum.org.performance.PMDataList_THolder pmDataList, mtnm.tmforum.org.performance.PMDataIterator_IHolder pmIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createPMCollectionTask(java.lang.String taskName, java.lang.String destination, java.lang.String userName, java.lang.String password, java.lang.String emsUserName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pmTPSelectList, java.lang.String period, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createPMCollectionTask(taskName,destination,userName,password,emsUserName,pmTPSelectList,period,startTime,endTime,forceUpload);
	}

	public void setTCANotifySwitch(boolean tcaNotifySwitch) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setTCANotifySwitch(tcaNotifySwitch);
	}

	public void SuspendPMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.SuspendPMCollectionTask(taskName,emsUserName);
	}

	public void getTPHistoryPMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, mtnm.tmforum.org.performance.PMDataList_THolder pmDataList, mtnm.tmforum.org.performance.PMDataIterator_IHolder pmIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
	}

	public void ResumePMCollectionTask(java.lang.String taskName, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.ResumePMCollectionTask(taskName,emsUserName);
	}

	public void getHoldingTime(mtnm.tmforum.org.performance.HoldingTime_THolder holdingTime) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getHoldingTime(holdingTime);
	}

	public void getMEPMcapabilities(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, short layerRate, mtnm.tmforum.org.performance.PMParameterList_THolder pmParameterList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMEPMcapabilities(meName,layerRate,pmParameterList);
	}

	public void getAllPMPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.performance.PMPList_THolder pmpList, mtnm.tmforum.org.performance.PMPIterator_IHolder pmpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
	}

	public void enablePMData(mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, mtnm.tmforum.org.performance.PMTPSelectList_THolder failedTPSelectList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.enablePMData(pmTPSelectList,failedTPSelectList);
	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getHistoryPMData(destination,userName,password,pmTPSelectList,pmParameters,startTime,endTime,forceUpload);
	}

	public void deletePMCollectionTask(java.lang.String[] taskNameList, java.lang.String emsUserName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deletePMCollectionTask(taskNameList,emsUserName);
	}

}
