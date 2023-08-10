package mtnm.huawei.com.HW_vpnManager;


/**
 * Generated from IDL interface "HW_VPNMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_VPNMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.huawei.com.HW_vpnManager.HW_VPNMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getTrafficTrunk", Integer.valueOf(0));
		m_opsHash.put ( "getAllIPCrossConnectionNames", Integer.valueOf(1));
		m_opsHash.put ( "modifyMFDFr", Integer.valueOf(2));
		m_opsHash.put ( "modifyIPCrossConnection", Integer.valueOf(3));
		m_opsHash.put ( "activateMFDFr", Integer.valueOf(4));
		m_opsHash.put ( "getAllIPCrossConnections", Integer.valueOf(5));
		m_opsHash.put ( "getAllMFDFrNames", Integer.valueOf(6));
		m_opsHash.put ( "getAllTrafficTrunkNamesWithME", Integer.valueOf(7));
		m_opsHash.put ( "setOwner", Integer.valueOf(8));
		m_opsHash.put ( "getTrafficTrunksByNativeEmsName", Integer.valueOf(9));
		m_opsHash.put ( "createIPCrossConnections", Integer.valueOf(10));
		m_opsHash.put ( "getFDFrsWithTP", Integer.valueOf(11));
		m_opsHash.put ( "getIPRoutes", Integer.valueOf(12));
		m_opsHash.put ( "deleteFDFr", Integer.valueOf(13));
		m_opsHash.put ( "getAllMFDFrs", Integer.valueOf(14));
		m_opsHash.put ( "deactivateMFDFr", Integer.valueOf(15));
		m_opsHash.put ( "getIPRoutesByTrafficTrunks", Integer.valueOf(16));
		m_opsHash.put ( "getIPCrossConnection", Integer.valueOf(17));
		m_opsHash.put ( "getAllFDFrs", Integer.valueOf(18));
		m_opsHash.put ( "getFDFrRoutes", Integer.valueOf(19));
		m_opsHash.put ( "deleteTrafficTrunk", Integer.valueOf(20));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(21));
		m_opsHash.put ( "modifyFDFr", Integer.valueOf(22));
		m_opsHash.put ( "getAllTrafficTrunksWithME", Integer.valueOf(23));
		m_opsHash.put ( "activateAllTrafficTrunks", Integer.valueOf(24));
		m_opsHash.put ( "getAllFDFrNames", Integer.valueOf(25));
		m_opsHash.put ( "getSelfLearningMACAddressTable", Integer.valueOf(26));
		m_opsHash.put ( "createTrafficTrunk", Integer.valueOf(27));
		m_opsHash.put ( "getFDFrRoute", Integer.valueOf(28));
		m_opsHash.put ( "deleteMFDFr", Integer.valueOf(29));
		m_opsHash.put ( "getAllTrafficTrunks", Integer.valueOf(30));
		m_opsHash.put ( "getMFDFr", Integer.valueOf(31));
		m_opsHash.put ( "getFDFrServerTrail", Integer.valueOf(32));
		m_opsHash.put ( "getFDFrsWithME", Integer.valueOf(33));
		m_opsHash.put ( "createMFDFr", Integer.valueOf(34));
		m_opsHash.put ( "modifyTrafficTrunk", Integer.valueOf(35));
		m_opsHash.put ( "getTrafficTrunksWithTP", Integer.valueOf(36));
		m_opsHash.put ( "deactivateFDFr", Integer.valueOf(37));
		m_opsHash.put ( "activateTrafficTrunk", Integer.valueOf(38));
		m_opsHash.put ( "getTrafficTrunkRoute", Integer.valueOf(39));
		m_opsHash.put ( "getTrafficTrunksByUserLabel", Integer.valueOf(40));
		m_opsHash.put ( "deleteIPCrossConnections", Integer.valueOf(41));
		m_opsHash.put ( "deactivateIPCrossConnections", Integer.valueOf(42));
		m_opsHash.put ( "createFDFr", Integer.valueOf(43));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(44));
		m_opsHash.put ( "deactivateTrafficTrunk", Integer.valueOf(45));
		m_opsHash.put ( "getFDFr", Integer.valueOf(46));
		m_opsHash.put ( "activateIPCrossConnections", Integer.valueOf(47));
		m_opsHash.put ( "getFDFrsByUserLabel", Integer.valueOf(48));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(49));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(50));
		m_opsHash.put ( "activateFDFr", Integer.valueOf(51));
		m_opsHash.put ( "getAllTrafficTrunkNames", Integer.valueOf(52));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_vpnManager/HW_VPNMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
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
			case 0: // getTrafficTrunk
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder();
				_out = handler.createReply();
				getTrafficTrunk(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllIPCrossConnectionNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllIPCrossConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 2: // modifyMFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_T _arg1=mtnm.huawei.com.HW_vpnManager.MFDFrModifyData_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult404 = _arg5.value;
_out.write_string( tmpResult404 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // modifyIPCrossConnection
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionParameters.LayeredParameters_T _arg1=mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyIPCrossConnection(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult405 = _arg3.value;
_out.write_string( tmpResult405 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // activateMFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateMFDFr(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult406 = _arg3.value;
_out.write_string( tmpResult406 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllIPCrossConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder();
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHolder();
				_out = handler.createReply();
				getAllIPCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllMFDFrNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 7: // getAllTrafficTrunkNamesWithME
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunkNamesWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 8: // setOwner
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
			case 9: // getTrafficTrunksByNativeEmsName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				_out = handler.createReply();
				getTrafficTrunksByNativeEmsName(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // createIPCrossConnections
			{
			try
			{
				mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] _arg0=mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder();
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				createIPCrossConnections(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getFDFrsWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder();
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder _arg3= new mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getIPRoutes
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				getIPRoutes(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // deleteFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteFDFr(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllMFDFrs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder();
				mtnm.huawei.com.HW_vpnManager.MFDFrIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.MFDFrIterator_IHolder();
				_out = handler.createReply();
				getAllMFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.MFDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // deactivateMFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateMFDFr(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult407 = _arg3.value;
_out.write_string( tmpResult407 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getIPRoutesByTrafficTrunks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPRouteInfoList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.IPRouteInfoList_THolder();
				_out = handler.createReply();
				getIPRoutesByTrafficTrunks(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.IPRouteInfoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getIPCrossConnection
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THolder();
				_out = handler.createReply();
				getIPCrossConnection(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnection_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllFDFrs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder();
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getFDFrRoutes
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FDFrRouteInfoList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.FDFrRouteInfoList_THolder();
				_out = handler.createReply();
				getFDFrRoutes(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.FDFrRouteInfoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteTrafficTrunk
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTrafficTrunk(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getCapabilities
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
			case 22: // modifyFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FDFrModifyData_T _arg1=mtnm.huawei.com.HW_vpnManager.FDFrModifyData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg3=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder _arg4= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult408 = _arg5.value;
_out.write_string( tmpResult408 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllTrafficTrunksWithME
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunksWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // activateAllTrafficTrunks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateAllTrafficTrunks(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult409 = _arg2.value;
_out.write_string( tmpResult409 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllFDFrNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 26: // getSelfLearningMACAddressTable
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableList_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableList_THolder();
				mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder _arg3= new mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder();
				_out = handler.createReply();
				getSelfLearningMACAddressTable(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // createTrafficTrunk
			{
			try
			{
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkCreateData_T _arg0=mtnm.huawei.com.HW_vpnManager.TrafficTrunkCreateData_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createTrafficTrunk(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult410 = _arg2.value;
_out.write_string( tmpResult410 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getFDFrRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.huawei.com.HW_vpnManager.FDFrRoute_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.FDFrRoute_THolder();
				_out = handler.createReply();
				getFDFrRoute(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.FDFrRoute_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // deleteMFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMFDFr(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllTrafficTrunks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunks(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getMFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				_out = handler.createReply();
				getMFDFr(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getFDFrServerTrail
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getFDFrServerTrail(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getFDFrsWithME
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder _arg3= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder();
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder _arg4= new mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // createMFDFr
			{
			try
			{
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_T _arg0=mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult411 = _arg5.value;
_out.write_string( tmpResult411 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // modifyTrafficTrunk
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkModifyData_T _arg1=mtnm.huawei.com.HW_vpnManager.TrafficTrunkModifyData_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTrafficTrunk(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult412 = _arg3.value;
_out.write_string( tmpResult412 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getTrafficTrunksWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg2= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder _arg3= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getTrafficTrunksWithTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // deactivateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // activateTrafficTrunk
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateTrafficTrunk(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult413 = _arg2.value;
_out.write_string( tmpResult413 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getTrafficTrunkRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				getTrafficTrunkRoute(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getTrafficTrunksByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THolder();
				_out = handler.createReply();
				getTrafficTrunksByUserLabel(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // deleteIPCrossConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				deleteIPCrossConnections(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // deactivateIPCrossConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateIPCrossConnections(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult414 = _arg3.value;
_out.write_string( tmpResult414 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // createFDFr
			{
			try
			{
				mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T _arg0=mtnm.huawei.com.HW_vpnManager.FDFrCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder _arg4= new mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg5= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder _arg6= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg6.value);
				java.lang.String tmpResult415 = _arg7.value;
_out.write_string( tmpResult415 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // setUserLabel
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
			case 45: // deactivateTrafficTrunk
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateTrafficTrunk(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult416 = _arg2.value;
_out.write_string( tmpResult416 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // activateIPCrossConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateIPCrossConnections(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult417 = _arg3.value;
_out.write_string( tmpResult417 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // setAdditionalInfo
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
			case 50: // setNativeEMSName
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
			case 51: // activateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder _arg1= new mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				mtnm.huawei.com.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // getAllTrafficTrunkNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunkNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
