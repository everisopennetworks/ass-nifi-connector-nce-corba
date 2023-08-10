package mtnm.tmforum.org.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MaintenanceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class MaintenanceMgr_IPOATie
	extends MaintenanceMgr_IPOA
{
	private MaintenanceMgr_IOperations _delegate;

	private POA _poa;
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MaintenanceMgr_IPOATie(MaintenanceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I __r = mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I __r = mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IHelper.narrow(__o);
		return __r;
	}
	public MaintenanceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaintenanceMgr_IOperations delegate)
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
	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void performMaintenanceOperationEx(mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperationEx(maintenanceOperation,maintenanceOperationMode,resultOfMaintenanceData);
	}

	public void getActiveMaintenanceOperations(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOpeationList,cmoIt);
	}

	public void setOAMParameters(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] ParamList, mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOAMParameters(name,oamParamType,ParamList,oamParameters);
	}

	public void getOAMParameters(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder ParamList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getOAMParameters(name,ParamList);
	}

	public void performMaintenanceOperation(mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
	}

	public void disablePRBSTest(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.disablePRBSTest(tpNameList,failedTPList);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setServiceAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOn(serviceName,alarmEventList);
	}

	public void getPRBSTestResult(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.maintenanceOps.PRBSTestResultList_THolder resultList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getPRBSTestResult(tpNameList,resultList);
	}

	public void createATMMaintenanceEntity(mtnm.tmforum.org.maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, mtnm.tmforum.org.globaldefs.NVSList_THolder maintenanceEntityName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createATMMaintenanceEntity(maintenanceEntityAttr,maintenanceEntityName);
	}

	public void deleteMaintenanceAssociation(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] maName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceAssociation(maName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setServiceAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setServiceAlarmReportingOff(serviceName,alarmEventList);
	}

	public void createMaintenanceDomain(mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_T md, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceDomain(md,theMD,errorReason);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllMaintenanceAssociations(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationList_THolder maList, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceAssociations(mdName,how_many,maList,maIt);
	}

	public void createMaintenancePoints(mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenancePoints(mpCreateData,theMP,errorReason);
	}

	public void createMaintenanceAssociation(mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_T ma, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMaintenanceAssociation(ma,theMA,errorReason);
	}

	public void deleteMaintenancePoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenancePoint(mpName);
	}

	public void getAllMaintenanceDomains(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THolder mdList, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenanceDomains(meName,how_many,mdList,mdIt);
	}

	public void getAllMaintenancePoints(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointList_THolder mpList, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMaintenancePoints(mdOrMaName,how_many,mpList,mpIt);
	}

	public void enablePRBSTest(mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T[] testParaList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.enablePRBSTest(testParaList,failedTPList);
	}

	public void deleteMaintenanceDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMaintenanceDomain(mdName);
	}

}
