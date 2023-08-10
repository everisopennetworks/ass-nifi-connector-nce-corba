package mtnm.tmforum.org.protection;


/**
 * Generated from IDL interface "ProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface ProtectionMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.ProtectionGroupList_THolder pgList, mtnm.tmforum.org.protection.ProtectionGroupIterator_IHolder pgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.ProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createProtectionGroup(mtnm.tmforum.org.protection.PGPCreateData_T pgpCreateData, mtnm.tmforum.org.protection.ProtectionGroup_THolder thePGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] swapTPName, mtnm.tmforum.org.protection.ProtectionGroup_THolder deletedPGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpName, mtnm.tmforum.org.protection.PGPModifyData_T pgpModifyData, mtnm.tmforum.org.protection.ProtectionGroup_THolder modifiedPGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.protection.ProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllNUTTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllPreemptibleTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllProtectedTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.protection.SwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fromTp, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] toTp, mtnm.tmforum.org.protection.SwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAdjacentTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.EProtectionGroupList_THolder epgpList, mtnm.tmforum.org.protection.EProtectionGroupIterator_IHolder epgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPname, mtnm.tmforum.org.protection.EProtectionGroup_THolder eProtectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveESwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPName, mtnm.tmforum.org.protection.ESwitchDataList_THolder eSwitchDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllProtectionSubnetworks(int how_many, mtnm.tmforum.org.protection.ProtectionSubnetworkList_THolder psnList, mtnm.tmforum.org.protection.ProtectionSubnetworkIterator_IHolder psnIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllWDMProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.WDMProtectionGroupList_THolder wpgpList, mtnm.tmforum.org.protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getWDMProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.protection.WDMProtectionGroup_THolder wProtectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveWDMSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.protection.WDMSwitchDataList_THolder wSwitchDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performWDMProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fromTp, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] toTp, mtnm.tmforum.org.protection.WDMSwitchData_THolder wSwitchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getIPProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.IPProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllIPProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.IPProtectionGroupList_THolder pgList, mtnm.tmforum.org.protection.IPProtectionGroupIterator_IHolder pgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveIPSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.protection.IPSwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllXPICGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.HW_XPICGroupList_THolder xpicList, mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHolder xpicIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getXPICGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] xpicGroupName, mtnm.tmforum.org.protection.HW_XPICGroup_THolder xpicGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllERPSProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.protection.HW_ERPSProtectionGroupList_THolder pgList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getERPSProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllIFProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THolder pgList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getIFProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.HW_IFProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveIFSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.IFSwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
