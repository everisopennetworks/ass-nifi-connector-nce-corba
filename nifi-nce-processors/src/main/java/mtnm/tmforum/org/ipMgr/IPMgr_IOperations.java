package mtnm.tmforum.org.ipMgr;


/**
 * Generated from IDL interface "IPMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface IPMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllBridges(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.BridgeList_THolder bridgeList, mtnm.tmforum.org.ipMgr.BridgeIterator_IHolder bridgeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllStaticRoutings(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.StaticRoutingList_THolder srList, mtnm.tmforum.org.ipMgr.StaticRoutingIterator_IHolder srIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllVRFs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.VRFList_THolder vrfList, mtnm.tmforum.org.ipMgr.VRFIterator_IHolder vrfIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFrVRFs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, int how_many, mtnm.tmforum.org.ipMgr.VRFList_THolder vrfList, mtnm.tmforum.org.ipMgr.VRFIterator_IHolder vrfIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllFRRs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.FRRList_THolder frrList, mtnm.tmforum.org.ipMgr.FRRIterator_IHolder frrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllVRRPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.VRRPList_THolder vrrpList, mtnm.tmforum.org.ipMgr.VRRPIterator_IHolder vrrpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
