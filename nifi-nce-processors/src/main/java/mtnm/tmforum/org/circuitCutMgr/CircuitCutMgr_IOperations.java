package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL interface "CircuitCutMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface CircuitCutMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createPrefabSNCsAndDelCutSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] prefabSNCList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] cutSNCList, mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] cutAndPrefabSNCList, org.omg.CORBA.IntHolder result, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void checkPrefabAndCutSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] checkPrefabSNCList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] checkCutSNCList, boolean isAccordCheck, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasons) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void calcuPrefabSNCRoute(mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T createPrefabSNC, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, int srcSncpNEID, int snkSncpNEID, boolean isCalcSNCP, mtnm.tmforum.org.circuitCutMgr.SNCServiceRouteList_THolder normalOrSncpRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void getAllIdleServiceTrailAndTS(mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T[] serviceTrailEndPointList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.ServiceTrailList_THolder idleSNCServiceTrailList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void setPrefabSNC(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T prefabSNCInfo, mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_T prefabSNCServiceRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void getSNCServiceRoute(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T sncBasicInfo, mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THolder sncServiceRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void deletePrefabSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] delPrefabSNCInfoList, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void getAllIdlePortAndTS(mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T sncTtPInfo, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] cutSNCList, mtnm.tmforum.org.circuitCutMgr.IdlePortAndTSList_THolder idleportAndTSList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void getServiceTrailViewBySNCRate(int how_many, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THolder connectivityNodePairList, mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHolder ConnectivityNodePairListIt) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void getTopoSubnetworkViewInfo(int how_many, mtnm.tmforum.org.circuitCutMgr.NodeList_THolder nodeList, mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
}
