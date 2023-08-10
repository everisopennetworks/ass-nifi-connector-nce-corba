package mtnm.tmforum.org.protection;


/**
 * Generated from IDL interface "ProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.protection.ProtectionMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getAdjacentTPs", Integer.valueOf(0));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(1));
		m_opsHash.put ( "performWDMProtectionCommand", Integer.valueOf(2));
		m_opsHash.put ( "getIPProtectionGroup", Integer.valueOf(3));
		m_opsHash.put ( "HW_getXPICGroup", Integer.valueOf(4));
		m_opsHash.put ( "retrieveIFSwitchData", Integer.valueOf(5));
		m_opsHash.put ( "getEProtectionGroup", Integer.valueOf(6));
		m_opsHash.put ( "getWDMProtectionGroup", Integer.valueOf(7));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(8));
		m_opsHash.put ( "setProtectionGroup", Integer.valueOf(9));
		m_opsHash.put ( "getAllNUTTPNames", Integer.valueOf(10));
		m_opsHash.put ( "HW_getAllXPICGroups", Integer.valueOf(11));
		m_opsHash.put ( "getAllEProtectionGroups", Integer.valueOf(12));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(13));
		m_opsHash.put ( "retrieveSwitchData", Integer.valueOf(14));
		m_opsHash.put ( "retrieveWDMSwitchData", Integer.valueOf(15));
		m_opsHash.put ( "performProtectionCommand", Integer.valueOf(16));
		m_opsHash.put ( "getAllProtectionSubnetworks", Integer.valueOf(17));
		m_opsHash.put ( "retrieveIPSwitchData", Integer.valueOf(18));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(19));
		m_opsHash.put ( "getAllPreemptibleTPNames", Integer.valueOf(20));
		m_opsHash.put ( "setOwner", Integer.valueOf(21));
		m_opsHash.put ( "HW_getERPSProtectionGroup", Integer.valueOf(22));
		m_opsHash.put ( "createProtectionGroup", Integer.valueOf(23));
		m_opsHash.put ( "getAllProtectedTPNames", Integer.valueOf(24));
		m_opsHash.put ( "modifyProtectionGroup", Integer.valueOf(25));
		m_opsHash.put ( "deleteProtectionGroup", Integer.valueOf(26));
		m_opsHash.put ( "HW_getIFProtectionGroup", Integer.valueOf(27));
		m_opsHash.put ( "getAllIPProtectionGroups", Integer.valueOf(28));
		m_opsHash.put ( "retrieveESwitchData", Integer.valueOf(29));
		m_opsHash.put ( "HW_getAllIFProtectionGroups", Integer.valueOf(30));
		m_opsHash.put ( "getProtectionGroup", Integer.valueOf(31));
		m_opsHash.put ( "HW_getAllERPSProtectionGroups", Integer.valueOf(32));
		m_opsHash.put ( "getAllWDMProtectionGroups", Integer.valueOf(33));
		m_opsHash.put ( "getAllProtectionGroups", Integer.valueOf(34));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.protection.ProtectionMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.protection.ProtectionMgr_I __r = mtnm.tmforum.org.protection.ProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.protection.ProtectionMgr_I __r = mtnm.tmforum.org.protection.ProtectionMgr_IHelper.narrow(__o);
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
			case 0: // getAdjacentTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAdjacentTPs(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setNativeEMSName
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
			case 2: // performWDMProtectionCommand
			{
			try
			{
				mtnm.tmforum.org.protection.ProtectionCommand_T _arg0=mtnm.tmforum.org.protection.ProtectionCommand_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg3=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.WDMSwitchData_THolder _arg4= new mtnm.tmforum.org.protection.WDMSwitchData_THolder();
				_out = handler.createReply();
				performWDMProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.protection.WDMSwitchData_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getIPProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.IPProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.IPProtectionGroup_THolder();
				_out = handler.createReply();
				getIPProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.IPProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // HW_getXPICGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.HW_XPICGroup_THolder _arg1= new mtnm.tmforum.org.protection.HW_XPICGroup_THolder();
				_out = handler.createReply();
				HW_getXPICGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.HW_XPICGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // retrieveIFSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.IFSwitchDataList_THolder _arg1= new mtnm.tmforum.org.protection.IFSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveIFSwitchData(_arg0,_arg1);
				mtnm.tmforum.org.protection.IFSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getEProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.EProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.EProtectionGroup_THolder();
				_out = handler.createReply();
				getEProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.EProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getWDMProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.WDMProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.WDMProtectionGroup_THolder();
				_out = handler.createReply();
				getWDMProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.WDMProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setUserLabel
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
			case 9: // setProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionGroup_THolder _arg2= new mtnm.tmforum.org.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				setProtectionGroup(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllNUTTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllNUTTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 11: // HW_getAllXPICGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.protection.HW_XPICGroupList_THolder _arg2= new mtnm.tmforum.org.protection.HW_XPICGroupList_THolder();
				mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHolder _arg3= new mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHolder();
				_out = handler.createReply();
				HW_getAllXPICGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.protection.HW_XPICGroupList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllEProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.protection.EProtectionGroupList_THolder _arg2= new mtnm.tmforum.org.protection.EProtectionGroupList_THolder();
				mtnm.tmforum.org.protection.EProtectionGroupIterator_IHolder _arg3= new mtnm.tmforum.org.protection.EProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllEProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.protection.EProtectionGroupList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.protection.EProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getCapabilities
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
			case 14: // retrieveSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.SwitchDataList_THolder _arg1= new mtnm.tmforum.org.protection.SwitchDataList_THolder();
				_out = handler.createReply();
				retrieveSwitchData(_arg0,_arg1);
				mtnm.tmforum.org.protection.SwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // retrieveWDMSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.WDMSwitchDataList_THolder _arg1= new mtnm.tmforum.org.protection.WDMSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveWDMSwitchData(_arg0,_arg1);
				mtnm.tmforum.org.protection.WDMSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // performProtectionCommand
			{
			try
			{
				mtnm.tmforum.org.protection.ProtectionCommand_T _arg0=mtnm.tmforum.org.protection.ProtectionCommand_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg3=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.SwitchData_THolder _arg4= new mtnm.tmforum.org.protection.SwitchData_THolder();
				_out = handler.createReply();
				performProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.protection.SwitchData_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllProtectionSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.protection.ProtectionSubnetworkList_THolder _arg1= new mtnm.tmforum.org.protection.ProtectionSubnetworkList_THolder();
				mtnm.tmforum.org.protection.ProtectionSubnetworkIterator_IHolder _arg2= new mtnm.tmforum.org.protection.ProtectionSubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionSubnetworks(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.protection.ProtectionSubnetworkList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.protection.ProtectionSubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // retrieveIPSwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.IPSwitchDataList_THolder _arg1= new mtnm.tmforum.org.protection.IPSwitchDataList_THolder();
				_out = handler.createReply();
				retrieveIPSwitchData(_arg0,_arg1);
				mtnm.tmforum.org.protection.IPSwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setAdditionalInfo
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
			case 20: // getAllPreemptibleTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPreemptibleTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 21: // setOwner
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
			case 22: // HW_getERPSProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_THolder();
				_out = handler.createReply();
				HW_getERPSProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // createProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.protection.PGPCreateData_T _arg0=mtnm.tmforum.org.protection.PGPCreateData_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				createProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllProtectedTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllProtectedTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 25: // modifyProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.PGPModifyData_T _arg1=mtnm.tmforum.org.protection.PGPModifyData_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionGroup_THolder _arg2= new mtnm.tmforum.org.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				modifyProtectionGroup(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deleteProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionGroup_THolder _arg2= new mtnm.tmforum.org.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				deleteProtectionGroup(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.protection.ProtectionGroup_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // HW_getIFProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.HW_IFProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.HW_IFProtectionGroup_THolder();
				_out = handler.createReply();
				HW_getIFProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.HW_IFProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllIPProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.protection.IPProtectionGroupList_THolder _arg2= new mtnm.tmforum.org.protection.IPProtectionGroupList_THolder();
				mtnm.tmforum.org.protection.IPProtectionGroupIterator_IHolder _arg3= new mtnm.tmforum.org.protection.IPProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllIPProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.protection.IPProtectionGroupList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.protection.IPProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // retrieveESwitchData
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ESwitchDataList_THolder _arg1= new mtnm.tmforum.org.protection.ESwitchDataList_THolder();
				_out = handler.createReply();
				retrieveESwitchData(_arg0,_arg1);
				mtnm.tmforum.org.protection.ESwitchDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // HW_getAllIFProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THolder _arg1= new mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THolder();
				_out = handler.createReply();
				HW_getAllIFProtectionGroups(_arg0,_arg1);
				mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getProtectionGroup
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.ProtectionGroup_THolder _arg1= new mtnm.tmforum.org.protection.ProtectionGroup_THolder();
				_out = handler.createReply();
				getProtectionGroup(_arg0,_arg1);
				mtnm.tmforum.org.protection.ProtectionGroup_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // HW_getAllERPSProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.protection.HW_ERPSProtectionGroupList_THolder _arg1= new mtnm.tmforum.org.protection.HW_ERPSProtectionGroupList_THolder();
				_out = handler.createReply();
				HW_getAllERPSProtectionGroups(_arg0,_arg1);
				mtnm.tmforum.org.protection.HW_ERPSProtectionGroupList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllWDMProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.protection.WDMProtectionGroupList_THolder _arg2= new mtnm.tmforum.org.protection.WDMProtectionGroupList_THolder();
				mtnm.tmforum.org.protection.WDMProtectionGroupIterator_IHolder _arg3= new mtnm.tmforum.org.protection.WDMProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllWDMProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.protection.WDMProtectionGroupList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.protection.WDMProtectionGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllProtectionGroups
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.protection.ProtectionGroupList_THolder _arg2= new mtnm.tmforum.org.protection.ProtectionGroupList_THolder();
				mtnm.tmforum.org.protection.ProtectionGroupIterator_IHolder _arg3= new mtnm.tmforum.org.protection.ProtectionGroupIterator_IHolder();
				_out = handler.createReply();
				getAllProtectionGroups(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.protection.ProtectionGroupList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.protection.ProtectionGroupIterator_IHelper.write(_out,_arg3.value);
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
