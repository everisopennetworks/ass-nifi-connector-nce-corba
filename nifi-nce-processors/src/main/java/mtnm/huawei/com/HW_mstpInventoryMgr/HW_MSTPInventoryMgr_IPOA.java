package mtnm.huawei.com.HW_mstpInventoryMgr;


/**
 * Generated from IDL interface "HW_MSTPInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPInventoryMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createVirtualBridge", Integer.valueOf(0));
		m_opsHash.put ( "getAllContainedInUseTPNames", Integer.valueOf(1));
		m_opsHash.put ( "deleteQosRule", Integer.valueOf(2));
		m_opsHash.put ( "getLinkAggregationGroup", Integer.valueOf(3));
		m_opsHash.put ( "deleteFlow", Integer.valueOf(4));
		m_opsHash.put ( "createFlow", Integer.valueOf(5));
		m_opsHash.put ( "getBindingPath", Integer.valueOf(6));
		m_opsHash.put ( "getAllVLANNames", Integer.valueOf(7));
		m_opsHash.put ( "getQosRule", Integer.valueOf(8));
		m_opsHash.put ( "getMstpEndPoint", Integer.valueOf(9));
		m_opsHash.put ( "delBindingPath", Integer.valueOf(10));
		m_opsHash.put ( "getAllContainedCurrentTPNames", Integer.valueOf(11));
		m_opsHash.put ( "createVLAN", Integer.valueOf(12));
		m_opsHash.put ( "setOwner", Integer.valueOf(13));
		m_opsHash.put ( "delVLANForwardPort", Integer.valueOf(14));
		m_opsHash.put ( "setFlow", Integer.valueOf(15));
		m_opsHash.put ( "deleteVirtualBridge", Integer.valueOf(16));
		m_opsHash.put ( "addVLANForwardPort", Integer.valueOf(17));
		m_opsHash.put ( "deleteLinkAggregationGroup", Integer.valueOf(18));
		m_opsHash.put ( "createLinkAggregationGroup", Integer.valueOf(19));
		m_opsHash.put ( "setVLANData", Integer.valueOf(20));
		m_opsHash.put ( "setLCASState", Integer.valueOf(21));
		m_opsHash.put ( "getAllMstpEndPointNames", Integer.valueOf(22));
		m_opsHash.put ( "getAllLinkAggregationGroups", Integer.valueOf(23));
		m_opsHash.put ( "modifyLinkAggregationGroup", Integer.valueOf(24));
		m_opsHash.put ( "getAllMstpEndPoints", Integer.valueOf(25));
		m_opsHash.put ( "getAllLinkAggregationGroupNames", Integer.valueOf(26));
		m_opsHash.put ( "getAvailablePortNames", Integer.valueOf(27));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(28));
		m_opsHash.put ( "deleteVLAN", Integer.valueOf(29));
		m_opsHash.put ( "getAllFlowNames", Integer.valueOf(30));
		m_opsHash.put ( "setMstpEndPointShapingQueue", Integer.valueOf(31));
		m_opsHash.put ( "setQosRule", Integer.valueOf(32));
		m_opsHash.put ( "getAllSpanningTrees", Integer.valueOf(33));
		m_opsHash.put ( "getVirtualBridge", Integer.valueOf(34));
		m_opsHash.put ( "getMstpEndPointShapingQueue", Integer.valueOf(35));
		m_opsHash.put ( "getAllQosRuleNames", Integer.valueOf(36));
		m_opsHash.put ( "getAllQosRules", Integer.valueOf(37));
		m_opsHash.put ( "setSTPortParam", Integer.valueOf(38));
		m_opsHash.put ( "setMstpEndPoint", Integer.valueOf(39));
		m_opsHash.put ( "getFlow", Integer.valueOf(40));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(41));
		m_opsHash.put ( "setSTProtocolParam", Integer.valueOf(42));
		m_opsHash.put ( "getLCASState", Integer.valueOf(43));
		m_opsHash.put ( "getAllSpanningTreeNames", Integer.valueOf(44));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(45));
		m_opsHash.put ( "setSTBridgeParam", Integer.valueOf(46));
		m_opsHash.put ( "createQosRule", Integer.valueOf(47));
		m_opsHash.put ( "getAllVBs", Integer.valueOf(48));
		m_opsHash.put ( "getAllVLANs", Integer.valueOf(49));
		m_opsHash.put ( "getSpanningTree", Integer.valueOf(50));
		m_opsHash.put ( "addBindingPath", Integer.valueOf(51));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(52));
		m_opsHash.put ( "getAllFlows", Integer.valueOf(53));
		m_opsHash.put ( "getAllVBNames", Integer.valueOf(54));
		m_opsHash.put ( "getVLAN", Integer.valueOf(55));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
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
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // createVirtualBridge
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_ushort();
				java.lang.String _arg2=_input.read_string();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder();
				_out = handler.createReply();
				createVirtualBridge(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllContainedInUseTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // deleteQosRule
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteQosRule(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getLinkAggregationGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				getLinkAggregationGroup(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // deleteFlow
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFlow(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createFlow
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder();
				_out = handler.createReply();
				createFlow(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getBindingPath
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				getBindingPath(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllVLANNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllVLANNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getQosRule
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder();
				_out = handler.createReply();
				getQosRule(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getMstpEndPoint
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder();
				_out = handler.createReply();
				getMstpEndPoint(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // delBindingPath
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.Directionality_T _arg1=mtnm.tmforum.org.terminationPoint.Directionality_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				delBindingPath(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllContainedCurrentTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // createVLAN
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_ushort();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				createVLAN(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setOwner
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // delVLANForwardPort
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				delVLANForwardPort(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setFlow
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder();
				_out = handler.createReply();
				setFlow(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // deleteVirtualBridge
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVirtualBridge(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // addVLANForwardPort
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				addVLANForwardPort(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // deleteLinkAggregationGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteLinkAggregationGroup(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // createLinkAggregationGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder _arg4= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				createLinkAggregationGroup(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setVLANData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				setVLANData(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setLCASState
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				setLCASState(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllMstpEndPointNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] _arg1=mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMstpEndPointNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllLinkAggregationGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupIterator_IHolder();
				_out = handler.createReply();
				getAllLinkAggregationGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // modifyLinkAggregationGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder _arg4= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				modifyLinkAggregationGroup(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_LinkAggregationGroup_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllMstpEndPoints
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] _arg1=mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointList_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointIterator_IHolder _arg4= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointIterator_IHolder();
				_out = handler.createReply();
				getAllMstpEndPoints(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getAllLinkAggregationGroupNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllLinkAggregationGroupNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAvailablePortNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAvailablePortNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getCapabilities
			{
			try
			{
				mtnm.tmforum.org.common.CapabilityList_THolder _arg0= new mtnm.tmforum.org.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				mtnm.tmforum.org.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // deleteVLAN
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVLAN(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllFlowNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFlowNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // setMstpEndPointShapingQueue
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setMstpEndPointShapingQueue(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // setQosRule
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder();
				_out = handler.createReply();
				setQosRule(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllSpanningTrees
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeIterator_IHolder();
				_out = handler.createReply();
				getAllSpanningTrees(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTreeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getVirtualBridge
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THolder();
				_out = handler.createReply();
				getVirtualBridge(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridge_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getMstpEndPointShapingQueue
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THolder();
				_out = handler.createReply();
				getMstpEndPointShapingQueue(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getAllQosRuleNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllQosRuleNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getAllQosRules
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleIterator_IHolder();
				_out = handler.createReply();
				getAllQosRules(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRuleIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // setSTPortParam
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTPortParam(_arg0,_arg1,_arg2);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setMstpEndPoint
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] _arg1=mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THolder();
				_out = handler.createReply();
				setMstpEndPoint(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPoint_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getFlow
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THolder();
				_out = handler.createReply();
				getFlow(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_Flow_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // setUserLabel
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // setSTProtocolParam
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTProtocolParam(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // getLCASState
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.BooleanHolder _arg1= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				getLCASState(_arg0,_arg1);
				_out.write_boolean(_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAllSpanningTreeNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSpanningTreeNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // setAdditionalInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // setSTBridgeParam
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTBridgeParam(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // createQosRule
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosType_T _arg1=mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosType_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THolder();
				_out = handler.createReply();
				createQosRule(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_QosRule_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getAllVBs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeIterator_IHolder();
				_out = handler.createReply();
				getAllVBs(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualBridgeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // getAllVLANs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANIterator_IHolder();
				_out = handler.createReply();
				getAllVLANs(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLANIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // getSpanningTree
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_THolder();
				_out = handler.createReply();
				getSpanningTree(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_SpanningTree_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // addBindingPath
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.Directionality_T _arg1=mtnm.tmforum.org.terminationPoint.Directionality_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				addBindingPath(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPathList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // setNativeEMSName
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // getAllFlows
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowList_THolder _arg2= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowList_THolder();
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowIterator_IHolder();
				_out = handler.createReply();
				getAllFlows(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_FlowIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // getAllVBNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllVBNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 55: // getVLAN
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder _arg1= new mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				getVLAN(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpInventoryMgr.HW_VirtualLAN_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
