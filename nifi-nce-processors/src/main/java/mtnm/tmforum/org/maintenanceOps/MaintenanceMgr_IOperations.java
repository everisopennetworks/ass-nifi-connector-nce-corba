package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL interface "MaintenanceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface MaintenanceMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void performMaintenanceOperation(mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performMaintenanceOperationEx(mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getActiveMaintenanceOperations(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void enablePRBSTest(mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T[] testParaList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void disablePRBSTest(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getPRBSTestResult(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNameList, mtnm.tmforum.org.maintenanceOps.PRBSTestResultList_THolder resultList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createMaintenanceDomain(mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_T md, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllMaintenanceDomains(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THolder mdList, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createMaintenanceAssociation(mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_T ma, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllMaintenanceAssociations(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationList_THolder maList, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createMaintenancePoints(mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllMaintenancePoints(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointList_THolder mpList, mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteMaintenanceDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteMaintenanceAssociation(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] maName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteMaintenancePoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createATMMaintenanceEntity(mtnm.tmforum.org.maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, mtnm.tmforum.org.globaldefs.NVSList_THolder maintenanceEntityName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setOAMParameters(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] ParamList, mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getOAMParameters(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder ParamList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setServiceAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
