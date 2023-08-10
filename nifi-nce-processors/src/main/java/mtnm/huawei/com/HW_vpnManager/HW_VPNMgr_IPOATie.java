package mtnm.huawei.com.HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_VPNMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_VPNMgr_IPOATie
	extends HW_VPNMgr_IPOA
{
	private HW_VPNMgr_IOperations _delegate;

	private POA _poa;
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_I __r = mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_I __r = mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_VPNMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_VPNMgr_IOperations delegate)
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
	public void getTrafficTrunk(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder trafficTrunk) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunk(trafficTrunkName,trafficTrunk);
	}

	public void getAllIPCrossConnectionNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnectionNames(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void modifyMFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdfrName, mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_T modifyData, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFDFr(mfdfrName,modifyData,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void modifyIPCrossConnection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ipCCName, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder newIPCC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyIPCrossConnection(ipCCName,transmissionParams,newIPCC,errorReason);
	}

	public void activateMFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void getAllIPCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder ipCCList, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHolder ipCCIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnections(managedElementName,connectionRateList,how_many,ipCCList,ipCCIt);
	}

	public void getAllMFDFrNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrNames(meName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllTrafficTrunkNamesWithME(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNamesWithME(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getTrafficTrunksByNativeEmsName(java.lang.String nativeEmsName, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksByNativeEmsName(nativeEmsName,trafficTrunkList);
	}

	public void createIPCrossConnections(mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] ipCCList, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder successedIPCCList, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder failedIPCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createIPCrossConnections(ipCCList,successedIPCCList,failedIPCCList);
	}

	public void getFDFrsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, int how_many, mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void getIPRoutes(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder routes) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getIPRoutes(trafficTrunkName,routes);
	}

	public void deleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void getAllMFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList, mtnm.huawei.com.HW_vpnManager.MFDFrIterator_IHolder mfdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrs(meName,connectionRateList,how_many,mfdfrList,mfdfrIt);
	}

	public void deactivateMFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void getIPRoutesByTrafficTrunks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] trafficTrunkNameList, mtnm.huawei.com.HW_vpnManager.IPRouteInfoList_THolder routeInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getIPRoutesByTrafficTrunks(trafficTrunkNameList,routeInfoList);
	}

	public void getIPCrossConnection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ipCCName, mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder ipCC) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getIPCrossConnection(ipCCName,ipCC);
	}

	public void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectionRateList,fdfrList,fdfrIt);
	}

	public void getFDFrRoutes(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] fdfrNameList, mtnm.huawei.com.HW_vpnManager.FDFrRouteInfoList_THolder routeInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoutes(fdfrNameList,routeInfoList);
	}

	public void deleteTrafficTrunk(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficTrunk(trafficTrunkName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.huawei.com.HW_vpnManager.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

	public void getAllTrafficTrunksWithME(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunksWithME(managedElementName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void activateAllTrafficTrunks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] trafficTrunkNameList, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateAllTrafficTrunks(trafficTrunkNameList,trafficTrunkList,errorReason);
	}

	public void getAllFDFrNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectionRateList,nameList,nameIt);
	}

	public void getSelfLearningMACAddressTable(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList, int how_many, mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableList_THolder tableList, mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder tableIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSelfLearningMACAddressTable(nameList,how_many,tableList,tableIt);
	}

	public void createTrafficTrunk(mtnm.huawei.com.HW_vpnManager.TrafficTrunkCreateData_T createData, mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createTrafficTrunk(createData,theTrafficTrunk,errorReason);
	}

	public void getFDFrRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, boolean includeHigherOrderCCs, mtnm.huawei.com.HW_vpnManager.FDFrRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,includeHigherOrderCCs,route);
	}

	public void deleteMFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdfrName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFDFr(mfdfrName);
	}

	public void getAllTrafficTrunks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunks(fdName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void getMFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdfrName, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMFDFr(mfdfrName,theMFDFr);
	}

	public void getFDFrServerTrail(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder serverNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void getFDFrsWithME(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithME(managedElementName,connectionRateList,how_many,fdfrList,fdfrIt);
	}

	public void createMFDFr(mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMFDFr(createData,tpsToModify,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void modifyTrafficTrunk(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.TrafficTrunkModifyData_T modifyData, mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder newTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyTrafficTrunk(trafficTrunkName,modifyData,newTrafficTrunk,errorReason);
	}

	public void getTrafficTrunksWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, int how_many, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksWithTP(tpName,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void deactivateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void activateTrafficTrunk(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void getTrafficTrunkRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunkRoute(trafficTrunkName,route);
	}

	public void getTrafficTrunksByUserLabel(java.lang.String userLabel, mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksByUserLabel(userLabel,trafficTrunkList);
	}

	public void deleteIPCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] ipCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder successedIPCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedIPCCNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList);
	}

	public void deactivateIPCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] ipCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder successedIPCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void createFDFr(mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder endTPs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder internalTPs, mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deactivateTrafficTrunk(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder theFDFr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,theFDFr);
	}

	public void activateIPCrossConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] ipCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder successedIPCCNameList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void activateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void getAllTrafficTrunkNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNames(fdName,connectionRateList,how_many,nameList,nameIt);
	}

}
