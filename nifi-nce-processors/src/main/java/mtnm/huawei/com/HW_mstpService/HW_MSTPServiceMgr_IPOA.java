package mtnm.huawei.com.HW_mstpService;


/**
 * Generated from IDL interface "HW_MSTPServiceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPServiceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "deleteEthService", Integer.valueOf(0));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(1));
		m_opsHash.put ( "createEthService", Integer.valueOf(2));
		m_opsHash.put ( "getAllAtmService", Integer.valueOf(3));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(4));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(5));
		m_opsHash.put ( "deleteAtmService", Integer.valueOf(6));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(7));
		m_opsHash.put ( "setOwner", Integer.valueOf(8));
		m_opsHash.put ( "createAtmService", Integer.valueOf(9));
		m_opsHash.put ( "activateAtmService", Integer.valueOf(10));
		m_opsHash.put ( "getAtmService", Integer.valueOf(11));
		m_opsHash.put ( "getEthService", Integer.valueOf(12));
		m_opsHash.put ( "deactivateAtmService", Integer.valueOf(13));
		m_opsHash.put ( "getAllEthService", Integer.valueOf(14));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpService/HW_MSTPServiceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I __r = mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I __r = mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(__o);
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
			case 0: // deleteEthService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteEthService(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setUserLabel
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
			case 2: // createEthService
			{
			try
			{
				mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T _arg0=mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder();
				_out = handler.createReply();
				createEthService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getAllAtmService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] _arg1=mtnm.huawei.com.HW_mstpService.HW_AtmServiceTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceList_THolder _arg3= new mtnm.huawei.com.HW_mstpService.HW_AtmServiceList_THolder();
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceIterator_IHolder _arg4= new mtnm.huawei.com.HW_mstpService.HW_AtmServiceIterator_IHolder();
				_out = handler.createReply();
				getAllAtmService(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setNativeEMSName
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
			case 5: // getCapabilities
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
			case 6: // deleteAtmService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteAtmService(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setAdditionalInfo
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
			case 9: // createAtmService
			{
			try
			{
				mtnm.huawei.com.HW_mstpService.HW_AtmServiceCreateData_T _arg0=mtnm.huawei.com.HW_mstpService.HW_AtmServiceCreateData_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				createAtmService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // activateAtmService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				activateAtmService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAtmService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				getAtmService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getEthService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_EthService_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_EthService_THolder();
				_out = handler.createReply();
				getEthService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_EthService_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // deactivateAtmService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder _arg1= new mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder();
				_out = handler.createReply();
				deactivateAtmService(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpService.HW_AtmService_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllEthService
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T[] _arg1=mtnm.huawei.com.HW_mstpService.HW_EthServiceTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder _arg3= new mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder();
				mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHolder _arg4= new mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHolder();
				_out = handler.createReply();
				getAllEthService(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THelper.write(_out,_arg3.value);
				mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHelper.write(_out,_arg4.value);
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
