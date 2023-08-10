package mtnm.huawei.com.HW_mstpProtection;


/**
 * Generated from IDL interface "HW_MSTPProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "retrieveRPRSwitchData", Integer.valueOf(0));
		m_opsHash.put ( "getAllRPRLinkInfo", Integer.valueOf(1));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(2));
		m_opsHash.put ( "modifyRPRNodePara", Integer.valueOf(3));
		m_opsHash.put ( "retrieveAtmPGSwitchData", Integer.valueOf(4));
		m_opsHash.put ( "performRPRProtectionCommand", Integer.valueOf(5));
		m_opsHash.put ( "getAtmProtectGroup", Integer.valueOf(6));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(7));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(8));
		m_opsHash.put ( "modifyRPRLinkPara", Integer.valueOf(9));
		m_opsHash.put ( "getRPRNode", Integer.valueOf(10));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(11));
		m_opsHash.put ( "getAllAtmProtectGroup", Integer.valueOf(12));
		m_opsHash.put ( "setOwner", Integer.valueOf(13));
		m_opsHash.put ( "getRPRTopoPara", Integer.valueOf(14));
		m_opsHash.put ( "modifyAtmProtectGroup", Integer.valueOf(15));
		m_opsHash.put ( "getAllRPRNode", Integer.valueOf(16));
		m_opsHash.put ( "performAtmPGProtectionCommand", Integer.valueOf(17));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpProtection/HW_MSTPProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I __r = mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I __r = mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(__o);
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
			case 0: // retrieveRPRSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder _arg1= new mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder();
				_out = handler.createReply();
				retrieveRPRSwitchData(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllRPRLinkInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfoList_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfoList_THolder();
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkIterator_IHolder();
				_out = handler.createReply();
				getAllRPRLinkInfo(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfoList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setNativeEMSName
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
			case 3: // modifyRPRNodePara
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder();
				_out = handler.createReply();
				modifyRPRNodePara(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // retrieveAtmPGSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder _arg1= new mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder();
				_out = handler.createReply();
				retrieveAtmPGSwitchData(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // performRPRProtectionCommand
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionCommand_T _arg1=mtnm.tmforum.org.protection.ProtectionCommand_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_T _arg2=mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder _arg3= new mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder();
				_out = handler.createReply();
				performRPRProtectionCommand(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAtmProtectGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder _arg1= new mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder();
				_out = handler.createReply();
				getAtmProtectGroup(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setUserLabel
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
			case 8: // getCapabilities
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
			case 9: // modifyRPRLinkPara
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfo_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfo_THolder();
				_out = handler.createReply();
				modifyRPRLinkPara(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfo_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getRPRNode
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder _arg1= new mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder();
				_out = handler.createReply();
				getRPRNode(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setAdditionalInfo
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
			case 12: // getAllAtmProtectGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THolder();
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder();
				_out = handler.createReply();
				getAllAtmProtectGroup(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupIterator_IHelper.write(_out,_arg3.value);
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
			case 14: // getRPRTopoPara
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THolder _arg1= new mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THolder();
				_out = handler.createReply();
				getRPRTopoPara(_arg0,_arg1);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // modifyAtmProtectGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder();
				_out = handler.createReply();
				modifyAtmProtectGroup(_arg0,_arg1,_arg2);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllRPRNode
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THolder _arg2= new mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THolder();
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHolder _arg3= new mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHolder();
				_out = handler.createReply();
				getAllRPRNode(_arg0,_arg1,_arg2,_arg3);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THelper.write(_out,_arg2.value);
				mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // performAtmPGProtectionCommand
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionCommand_T _arg1=mtnm.tmforum.org.protection.ProtectionCommand_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchAction_T _arg2=mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchAction_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_T _arg3=mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.read(_input);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder _arg4= new mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder();
				_out = handler.createReply();
				performAtmPGProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THelper.write(_out,_arg4.value);
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
