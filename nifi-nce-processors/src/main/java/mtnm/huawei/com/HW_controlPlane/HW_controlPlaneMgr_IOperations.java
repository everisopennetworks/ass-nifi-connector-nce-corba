package mtnm.huawei.com.HW_controlPlane;


/**
 * Generated from IDL interface "HW_controlPlaneMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_controlPlaneMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRoutingAreaNames(mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllRoutingNodeNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nodeNameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSnppLinks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, mtnm.huawei.com.HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, mtnm.huawei.com.HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getSnppLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] snppLinkName, mtnm.huawei.com.HW_controlPlane.HW_SnppLink_THolder snppLink) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllSnppNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllContainedSnpNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] snppName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setSRLG(int srlgID, boolean addOrRemove, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder snppLinkNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getNodeIDByMEName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getMENameByNodeID(java.lang.String nodeID, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
