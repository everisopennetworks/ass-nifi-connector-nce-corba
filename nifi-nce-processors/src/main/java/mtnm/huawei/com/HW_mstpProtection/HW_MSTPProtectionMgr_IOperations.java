package mtnm.huawei.com.HW_mstpProtection;


/**
 * Generated from IDL interface "HW_MSTPProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_MSTPProtectionMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRPRNode(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THolder nodeList, mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getRPRNode(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder node) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyRPRNodePara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprNodeParameters, mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder node) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getRPRTopoPara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveRPRSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performRPRProtectionCommand(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_T switchPosition, mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmPgName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmPGParameters, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void retrieveAtmPGSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performAtmPGProtectionCommand(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllRPRLinkInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyRPRLinkPara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprLinkParameters, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
