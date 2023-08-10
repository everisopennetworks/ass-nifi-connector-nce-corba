package mtnm.tmforum.org.TopoManagementManager;


/**
 * Generated from IDL interface "TopoMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface TopoMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getTopoSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getProtectSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getViewInfoByTopoSubnetwork(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoSubnetwork, int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getClockSourceSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllClockSourceViewlTopologicalLinks(int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
