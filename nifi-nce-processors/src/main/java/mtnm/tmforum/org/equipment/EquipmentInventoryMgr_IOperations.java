package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL interface "EquipmentInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EquipmentInventoryMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void provisionEquipment(mtnm.tmforum.org.equipment.EQTCreateData_T equipmentCreateData, mtnm.tmforum.org.equipment.Equipment_THolder createdEquipment) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void unprovisionEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getContainedEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentHolderName, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.EquipmentOrHolder_THolder equip) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder eqList, mtnm.tmforum.org.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEquipmentNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSupportedPTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ptpName, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder eqList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSupportingEquipmentNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ptpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder staticInfoList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getPhysicalLocationInfo(mtnm.tmforum.org.equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEquipmentAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, mtnm.tmforum.org.equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAlarmSeverityList(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.SeverityList_THolder severityList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setAlarmSeverityList(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.Severity_T[] severityList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
