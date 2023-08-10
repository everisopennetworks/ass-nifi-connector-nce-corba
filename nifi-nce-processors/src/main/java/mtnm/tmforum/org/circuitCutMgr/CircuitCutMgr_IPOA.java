package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL interface "CircuitCutMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class CircuitCutMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.circuitCutMgr.CircuitCutMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "deletePrefabSNCs", Integer.valueOf(0));
		m_opsHash.put ( "checkPrefabAndCutSNCs", Integer.valueOf(1));
		m_opsHash.put ( "getTopoSubnetworkViewInfo", Integer.valueOf(2));
		m_opsHash.put ( "getAllIdleServiceTrailAndTS", Integer.valueOf(3));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(4));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(5));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(6));
		m_opsHash.put ( "createPrefabSNCsAndDelCutSNCs", Integer.valueOf(7));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(8));
		m_opsHash.put ( "setOwner", Integer.valueOf(9));
		m_opsHash.put ( "getAllIdlePortAndTS", Integer.valueOf(10));
		m_opsHash.put ( "getServiceTrailViewBySNCRate", Integer.valueOf(11));
		m_opsHash.put ( "getSNCServiceRoute", Integer.valueOf(12));
		m_opsHash.put ( "setPrefabSNC", Integer.valueOf(13));
		m_opsHash.put ( "calcuPrefabSNCRoute", Integer.valueOf(14));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/circuitCutMgr/CircuitCutMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
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
			case 0: // deletePrefabSNCs
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg0=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder _arg1= new mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				deletePrefabSNCs(_arg0,_arg1);
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // checkPrefabAndCutSNCs
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg0=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg1=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder _arg3= new mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				checkPrefabAndCutSNCs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getTopoSubnetworkViewInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.circuitCutMgr.NodeList_THolder _arg1= new mtnm.tmforum.org.circuitCutMgr.NodeList_THolder();
				mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHolder _arg2= new mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHolder();
				_out = handler.createReply();
				getTopoSubnetworkViewInfo(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.circuitCutMgr.NodeList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getAllIdleServiceTrailAndTS
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T[] _arg0=mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg1=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCRate_T _arg2=mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.ServiceTrailList_THolder _arg3= new mtnm.tmforum.org.circuitCutMgr.ServiceTrailList_THolder();
				_out = handler.createReply();
				getAllIdleServiceTrailAndTS(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.circuitCutMgr.ServiceTrailList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setUserLabel
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
			case 5: // setNativeEMSName
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
			case 6: // getCapabilities
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
			case 7: // createPrefabSNCsAndDelCutSNCs
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg0=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg1=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] _arg2=mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPairList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg3= new org.omg.CORBA.IntHolder();
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder _arg4= new mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				createPrefabSNCsAndDelCutSNCs(_arg0,_arg1,_arg2,_arg3,_arg4);
				_out.write_ulong(_arg3.value);
				mtnm.tmforum.org.circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setAdditionalInfo
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
			case 9: // setOwner
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
			case 10: // getAllIdlePortAndTS
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T _arg0=mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg1=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.IdlePortAndTSList_THolder _arg2= new mtnm.tmforum.org.circuitCutMgr.IdlePortAndTSList_THolder();
				_out = handler.createReply();
				getAllIdlePortAndTS(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.circuitCutMgr.IdlePortAndTSList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getServiceTrailViewBySNCRate
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.circuitCutMgr.SNCRate_T _arg1=mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THolder _arg2= new mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THolder();
				mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHolder _arg3= new mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHolder();
				_out = handler.createReply();
				getServiceTrailViewBySNCRate(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getSNCServiceRoute
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T _arg0=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THolder _arg1= new mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THolder();
				_out = handler.createReply();
				getSNCServiceRoute(_arg0,_arg1);
				mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setPrefabSNC
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T _arg0=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_T _arg1=mtnm.tmforum.org.circuitCutMgr.SNCServiceRoute_THelper.read(_input);
				_out = handler.createReply();
				setPrefabSNC(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // calcuPrefabSNCRoute
			{
			try
			{
				mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T _arg0=mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_THelper.read(_input);
				mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T[] _arg1=mtnm.tmforum.org.circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				int _arg3=_input.read_ulong();
				boolean _arg4=_input.read_boolean();
				mtnm.tmforum.org.circuitCutMgr.SNCServiceRouteList_THolder _arg5= new mtnm.tmforum.org.circuitCutMgr.SNCServiceRouteList_THolder();
				_arg5._read (_input);
				_out = handler.createReply();
				calcuPrefabSNCRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.circuitCutMgr.SNCServiceRouteList_THelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
