package mtnm.huawei.com.HW_mstpInventoryMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_MSTPInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_MSTPInventoryMgr_IPOATie
	extends HW_MSTPInventoryMgr_IPOA
{
	private HW_MSTPInventoryMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I __r = mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I __r = mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_MSTPInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPInventoryMgr_IOperations delegate)
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
	public void createVirtualBridge(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder vb) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createVirtualBridge(equipmentName,vbId,vbName,vb);
	}

	public void getAllContainedInUseTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedInUseTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void deleteQosRule(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] qosRuleName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteQosRule(qosRuleName);
	}

	public void getLinkAggregationGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] lagName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder lag) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getLinkAggregationGroup(lagName,lag);
	}

	public void deleteFlow(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] flowName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlow(flowName);
	}

	public void createFlow(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder flow) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFlow(equipmentName,paraList,flow);
	}

	public void getBindingPath(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder bindingPathList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getBindingPath(endPointName,bindingPathList);
	}

	public void getAllVLANNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vbName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANNames(vbName,how_many,nameList,nameIt);
	}

	public void getQosRule(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] qosRuleName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder qosRule) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getQosRule(qosRuleName,qosRule);
	}

	public void getMstpEndPoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder endPoint) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPoint(endPointName,endPoint);
	}

	public void delBindingPath(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.tmforum.org.terminationPoint.Directionality_T bindingDirect, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pathList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder bindingPathList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.delBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void getAllContainedCurrentTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedCurrentTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void createVLAN(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vbName, short vlanId, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] forwardTPList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder vlan) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createVLAN(vbName,vlanId,forwardTPList,vlan);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void delVLANForwardPort(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vlanName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] forwardTPList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder vlan) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.delVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void setFlow(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] flowName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] qosRuleNames, mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder flow) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setFlow(flowName,qosRuleNames,flow);
	}

	public void deleteVirtualBridge(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vbName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteVirtualBridge(vbName);
	}

	public void addVLANForwardPort(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vlanName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] forwardTPList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder vlan) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.addVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void deleteLinkAggregationGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] lagName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteLinkAggregationGroup(lagName);
	}

	public void createLinkAggregationGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mainPortName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] branchPortNameList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder lag) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createLinkAggregationGroup(meName,paraList,mainPortName,branchPortNameList,lag);
	}

	public void setVLANData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vlanName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder vlan) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setVLANData(vlanName,paraList,vlan);
	}

	public void setLCASState(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setLCASState(endPointName,enableState);
	}

	public void getAllMstpEndPointNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] typeList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPointNames(meName,typeList,how_many,nameList,nameIt);
	}

	public void getAllLinkAggregationGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupList_THolder lagList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupIterator_IHolder lagIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroups(meName,how_many,lagList,lagIt);
	}

	public void modifyLinkAggregationGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] lagName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder lag) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyLinkAggregationGroup(lagName,paraList,addedBranchPortNameList,deletedBranchPortNameList,lag);
	}

	public void getAllMstpEndPoints(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] typeList, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointList_THolder endPointList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointIterator_IHolder endPointIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPoints(meName,typeList,how_many,endPointList,endPointIt);
	}

	public void getAllLinkAggregationGroupNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroupNames(meName,how_many,nameList,nameIt);
	}

	public void getAvailablePortNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAvailablePortNames(equipmentName,how_many,nameList,nameIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void deleteVLAN(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vlanName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteVLAN(vlanName);
	}

	public void getAllFlowNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowNames(meName,how_many,nameList,nameIt);
	}

	public void setMstpEndPointShapingQueue(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder shapingQueueList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void setQosRule(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] qosRuleName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder qosRule) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setQosRule(qosRuleName,paraList,qosRule);
	}

	public void getAllSpanningTrees(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeList_THolder spanningTreeList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTrees(equipmentName,how_many,spanningTreeList,spanningTreeIt);
	}

	public void getVirtualBridge(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vbName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder vb) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getVirtualBridge(vbName,vb);
	}

	public void getMstpEndPointShapingQueue(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder shapingQueueList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void getAllQosRuleNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRuleNames(meName,how_many,nameList,nameIt);
	}

	public void getAllQosRules(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleList_THolder qosRuleList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleIterator_IHolder qosRuleIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRules(meName,how_many,qosRuleList,qosRuleIt);
	}

	public void setSTPortParam(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] spanningTreeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] portName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setSTPortParam(spanningTreeName,portName,paraList);
	}

	public void setMstpEndPoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] paraList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder endPoint) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPoint(endPointName,paraList,endPoint);
	}

	public void getFlow(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] flowName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder flow) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFlow(flowName,flow);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setSTProtocolParam(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] spanningTreeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setSTProtocolParam(spanningTreeName,paraList);
	}

	public void getLCASState(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getLCASState(endPointName,enableState);
	}

	public void getAllSpanningTreeNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTreeNames(equipmentName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setSTBridgeParam(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] spanningTreeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setSTBridgeParam(spanningTreeName,paraList);
	}

	public void createQosRule(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosType_T qosType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder qosRule) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createQosRule(equipmentName,qosType,paraList,qosRule);
	}

	public void getAllVBs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeList_THolder vbList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeIterator_IHolder vbIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVBs(meName,how_many,vbList,vbIt);
	}

	public void getAllVLANs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vbName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANList_THolder vlanList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANIterator_IHolder vlanIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANs(vbName,how_many,vlanList,vlanIt);
	}

	public void getSpanningTree(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] spanningTreeName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_THolder spanningTree) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSpanningTree(spanningTreeName,spanningTree);
	}

	public void addBindingPath(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endPointName, mtnm.tmforum.org.terminationPoint.Directionality_T bindingDirect, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pathList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder bindingPathList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.addBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllFlows(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowList_THolder flowList, mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowIterator_IHolder flowIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlows(meName,how_many,flowList,flowIt);
	}

	public void getAllVBNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVBNames(meName,how_many,nameList,nameIt);
	}

	public void getVLAN(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vlanName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder vlan) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getVLAN(vlanName,vlan);
	}

}
