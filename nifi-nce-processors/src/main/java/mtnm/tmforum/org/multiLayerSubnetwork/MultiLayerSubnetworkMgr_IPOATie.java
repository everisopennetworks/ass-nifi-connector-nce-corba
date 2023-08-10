package mtnm.tmforum.org.multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MultiLayerSubnetworkMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I __r = mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I __r = mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(__o);
		return __r;
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
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
	public void getSNCsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void getAllManagedElementNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
	}

	public void getSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder snc) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void deactivateAndDeleteSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, mtnm.tmforum.org.subnetworkConnection.Route_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getAllTPPoolNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
	}

	public void getAllEdgePointNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void createSharedRoute(mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_T createData, mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createSharedRoute(createData,route);
	}

	public void getOrginalRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, mtnm.tmforum.org.subnetworkConnection.Route_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getOrginalRoute(sncName,includeHigherOrderCCs,route);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deleteSharedRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteSharedRoute(sncName,sharedRouteID);
	}

	public void checkValidSNC(mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.checkValidSNC(createData,tpsToModify,considerResources,valid);
	}

	public void getAllSubnetworkConnectionsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList, mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder sncIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getPresetRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getPresetRoute(sncName,presetRouteID,route);
	}

	public void getConjunctionSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName1, mtnm.tmforum.org.globaldefs.NVSList_THolder sncName2, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getConjunctionSNC(sncName1,sncName2,additionalInfo);
	}

	public void getSNCsByEndObjectName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndObjectName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndObjectName, short[] connectionRateList, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByEndObjectName(aEndObjectName,zEndObjectName,connectionRateList,sncList);
	}

	public void getOrginalPresetRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getOrginalPresetRoute(sncName,presetRouteID,route);
	}

	public void getAllConjunctionSNCs(int how_many, mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder conjunctionSNCList, mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder conjunctionSNCIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllConjunctionSNCs(how_many,conjunctionSNCList,conjunctionSNCIt);
	}

	public void getAllInternalTopologicalLinks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinks(meName,how_many,topoList,topoIt);
	}

	public void createAndActivateSNC(mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void createSNC(mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
	}

	public void getAllInternalTopologicalLinkNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinkNames(meName,how_many,nameList,nameIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createPresetRoute(mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T createData, mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createPresetRoute(createData,route);
	}

	public void swapSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
	}

	public void getSNCs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] sncNameList, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNCs(sncNameList,sncList);
	}

	public void getSharedRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID, mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSharedRoute(sncName,sharedRouteID,route);
	}

	public void setConjunctionSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName1, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName2, boolean operate) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setConjunctionSNC(sncName1,sncName2,operate);
	}

	public void deleteSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName,emsFreedomLevel);
	}

	public void getAllTPPools(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void setConjunctionSNCEx(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName1, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName2, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo, boolean operate) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setConjunctionSNCEx(sncName1,sncName2,additionalInfo,operate);
	}

	public void getAllMicrowaveLinksReport(java.lang.String destination, java.lang.String userName, java.lang.String password, mtnm.tmforum.org.notifications.NameAndAnyValue_T[] filter) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMicrowaveLinksReport(destination,userName,password,filter);
	}

	public void getWaveLengthStatusByEndObject(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] inclusionNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] exclusionNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndName, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.subnetworkConnection.WaveLengthStatusList_THolder waveLengthStatusList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getWaveLengthStatusByEndObject(aEndName,inclusionNameList,exclusionNameList,zEndName,direction,waveLengthStatusList);
	}

	public void getRoutes(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] sncNameList, boolean includeHigherOrderCCs, mtnm.tmforum.org.subnetworkConnection.RouteInfoList_THolder routeInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRoutes(sncNameList,includeHigherOrderCCs,routeInfoList);
	}

	public void deletePresetRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deletePresetRoute(sncName,presetRouteID);
	}

	public void getAllSubnetworkConnectionNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllSNCNamesWithHigherOrderSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, short[] connectivityRateList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSNCNamesWithHigherOrderSNC(name,connectivityRateList,nameList);
	}

	public void getAllSubnetworkConnectionNamesWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getAllEdgePoints(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getRouteAndTopologicalLinksBySNCs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] sncNameList, int how_many, mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder routeAndTlList, mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder routeAndTlIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinksBySNCs(sncNameList,how_many,routeAndTlList,routeAndTlIt);
	}

	public void activateSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getAllSubnetworkConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList, mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder sncIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getAllTopologicalLinks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
	}

	public void getTopologicalLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoLinkName, mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder topoLink) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalLink(topoLinkName,topoLink);
	}

	public void getAssociatedTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTP(tpName,tpList);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllTopologicalLinkNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
	}

	public void modifySNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, mtnm.tmforum.org.subnetworkConnection.SNCModifyData_T SNCModifyData, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void getAllManagedElements(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, int how_many, mtnm.tmforum.org.managedElement.ManagedElementList_THolder meList, mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder meIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(subnetName,how_many,meList,meIt);
	}

	public void getRouteAndTopologicalLinks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.Route_THolder route, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void getTPGroupingRelationships(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
	}

	public void getSNCNamesByRouteModificationTime(java.lang.String utcBeginTime, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNCNamesByRouteModificationTime(utcBeginTime,how_many,nameList,nameIt);
	}

	public void getSNCsByNativeEmsName(java.lang.String nativeEmsName, int how_many, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList, mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder sncIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByNativeEmsName(nativeEmsName,how_many,sncList,sncIt);
	}

	public void switchRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo, mtnm.tmforum.org.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getServerConnections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] clientName, mtnm.tmforum.org.subnetworkConnection.ServerTrailList_THolder serverInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getServerConnections(clientName,serverInfoList);
	}

	public void getMultiLayerSubnetwork(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] subnetName, mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void deactivateSNC(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
