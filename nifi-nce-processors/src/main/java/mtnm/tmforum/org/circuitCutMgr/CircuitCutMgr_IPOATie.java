package mtnm.tmforum.org.circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CircuitCutMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class CircuitCutMgr_IPOATie
	extends CircuitCutMgr_IPOA
{
	private CircuitCutMgr_IOperations _delegate;

	private POA _poa;
	public CircuitCutMgr_IPOATie(CircuitCutMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CircuitCutMgr_IPOATie(CircuitCutMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_I __r = mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_I __r = mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_IHelper.narrow(__o);
		return __r;
	}
	public CircuitCutMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CircuitCutMgr_IOperations delegate)
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
	public void deletePrefabSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] delPrefabSNCInfoList, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.deletePrefabSNCs(delPrefabSNCInfoList,errorReasonList);
	}

	public void checkPrefabAndCutSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] checkPrefabSNCList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] checkCutSNCList, boolean isAccordCheck, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasons) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.checkPrefabAndCutSNCs(checkPrefabSNCList,checkCutSNCList,isAccordCheck,errorReasons);
	}

	public void getTopoSubnetworkViewInfo(int how_many, mtnm.tmforum.org.circuitCutMgr.NodeList_THolder nodeList, mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void getAllIdleServiceTrailAndTS(mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T[] serviceTrailEndPointList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.ServiceTrailList_THolder idleSNCServiceTrailList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.getAllIdleServiceTrailAndTS(serviceTrailEndPointList,deleteCutSNCList,rate,idleSNCServiceTrailList);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createPrefabSNCsAndDelCutSNCs(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] prefabSNCList, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] cutSNCList, mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] cutAndPrefabSNCList, org.omg.CORBA.IntHolder result, mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.createPrefabSNCsAndDelCutSNCs(prefabSNCList,cutSNCList,cutAndPrefabSNCList,result,errorReasonList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllIdlePortAndTS(mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T sncTtPInfo, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] cutSNCList, mtnm.tmforum.org.circuitCutMgr.IdlePortAndTSList_THolder idleportAndTSList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.getAllIdlePortAndTS(sncTtPInfo,cutSNCList,idleportAndTSList);
	}

	public void getServiceTrailViewBySNCRate(int how_many, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THolder connectivityNodePairList, mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHolder ConnectivityNodePairListIt) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.getServiceTrailViewBySNCRate(how_many,rate,connectivityNodePairList,ConnectivityNodePairListIt);
	}

	public void getSNCServiceRoute(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T sncBasicInfo, mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THolder sncServiceRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.getSNCServiceRoute(sncBasicInfo,sncServiceRoute);
	}

	public void setPrefabSNC(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T prefabSNCInfo, mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_T prefabSNCServiceRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.setPrefabSNC(prefabSNCInfo,prefabSNCServiceRoute);
	}

	public void calcuPrefabSNCRoute(mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T createPrefabSNC, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, int srcSncpNEID, int snkSncpNEID, boolean isCalcSNCP, mtnm.tmforum.org.circuitCutMgr.SNCServiceRouteList_THolder normalOrSncpRoute) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.calcuPrefabSNCRoute(createPrefabSNC,deleteCutSNCList,srcSncpNEID,snkSncpNEID,isCalcSNCP,normalOrSncpRoute);
	}

}
