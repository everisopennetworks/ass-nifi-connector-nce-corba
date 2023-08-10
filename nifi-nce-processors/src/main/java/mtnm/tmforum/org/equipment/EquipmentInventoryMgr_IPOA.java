package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL interface "EquipmentInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EquipmentInventoryMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.equipment.EquipmentInventoryMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "provisionEquipment", Integer.valueOf(0));
		m_opsHash.put ( "getEquipmentStaticInfo", Integer.valueOf(1));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(2));
		m_opsHash.put ( "unprovisionEquipment", Integer.valueOf(3));
		m_opsHash.put ( "setAlarmSeverityList", Integer.valueOf(4));
		m_opsHash.put ( "setAlarmReportingOff", Integer.valueOf(5));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(6));
		m_opsHash.put ( "getAllEquipmentNames", Integer.valueOf(7));
		m_opsHash.put ( "getAllSupportedPTPNames", Integer.valueOf(8));
		m_opsHash.put ( "getAllEquipment", Integer.valueOf(9));
		m_opsHash.put ( "getContainedEquipment", Integer.valueOf(10));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(11));
		m_opsHash.put ( "getEquipment", Integer.valueOf(12));
		m_opsHash.put ( "getAllSupportedPTPs", Integer.valueOf(13));
		m_opsHash.put ( "getAllSupportingEquipmentNames", Integer.valueOf(14));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(15));
		m_opsHash.put ( "setOwner", Integer.valueOf(16));
		m_opsHash.put ( "getAllEquipmentAdditionalInfo", Integer.valueOf(17));
		m_opsHash.put ( "setAlarmReportingOn", Integer.valueOf(18));
		m_opsHash.put ( "getPhysicalLocationInfo", Integer.valueOf(19));
		m_opsHash.put ( "getAlarmSeverityList", Integer.valueOf(20));
		m_opsHash.put ( "getAllSupportingEquipment", Integer.valueOf(21));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/equipment/EquipmentInventoryMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I __r = mtnm.tmforum.org.equipment.EquipmentInventoryMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I __r = mtnm.tmforum.org.equipment.EquipmentInventoryMgr_IHelper.narrow(__o);
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
			case 0: // provisionEquipment
			{
			try
			{
				mtnm.tmforum.org.equipment.EQTCreateData_T _arg0=mtnm.tmforum.org.equipment.EQTCreateData_THelper.read(_input);
				mtnm.tmforum.org.equipment.Equipment_THolder _arg1= new mtnm.tmforum.org.equipment.Equipment_THolder();
				_out = handler.createReply();
				provisionEquipment(_arg0,_arg1);
				mtnm.tmforum.org.equipment.Equipment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getEquipmentStaticInfo
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.equipment.EquipmentObjectTypeList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getEquipmentStaticInfo(_arg0,_arg1,_arg2,_arg3);
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
			case 3: // unprovisionEquipment
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				unprovisionEquipment(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setAlarmSeverityList
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.Severity_T[] _arg1=mtnm.tmforum.org.equipment.SeverityList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmSeverityList(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setAlarmReportingOff
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOff(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setUserLabel
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
			case 7: // getAllEquipmentNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllEquipmentNames(_arg0,_arg1,_arg2,_arg3);
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
			case 8: // getAllSupportedPTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedPTPNames(_arg0,_arg1,_arg2,_arg3);
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
			case 9: // getAllEquipment
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder _arg2= new mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder();
				mtnm.tmforum.org.equipment.EquipmentOrHolderIterator_IHolder _arg3= new mtnm.tmforum.org.equipment.EquipmentOrHolderIterator_IHolder();
				_out = handler.createReply();
				getAllEquipment(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.equipment.EquipmentOrHolderIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getContainedEquipment
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder _arg1= new mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getContainedEquipment(_arg0,_arg1);
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getCapabilities
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
			case 12: // getEquipment
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.EquipmentOrHolder_THolder _arg1= new mtnm.tmforum.org.equipment.EquipmentOrHolder_THolder();
				_out = handler.createReply();
				getEquipment(_arg0,_arg1);
				mtnm.tmforum.org.equipment.EquipmentOrHolder_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllSupportedPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedPTPs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllSupportingEquipmentNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllSupportingEquipmentNames(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setAdditionalInfo
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
			case 16: // setOwner
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
			case 17: // getAllEquipmentAdditionalInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.ObjectAdditionalInfoList_THolder _arg1= new mtnm.tmforum.org.equipment.ObjectAdditionalInfoList_THolder();
				_out = handler.createReply();
				getAllEquipmentAdditionalInfo(_arg0,_arg1);
				mtnm.tmforum.org.equipment.ObjectAdditionalInfoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // setAlarmReportingOn
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOn(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getPhysicalLocationInfo
			{
			try
			{
				mtnm.tmforum.org.equipment.PhysicalLocationInfoList_THolder _arg0= new mtnm.tmforum.org.equipment.PhysicalLocationInfoList_THolder();
				_out = handler.createReply();
				getPhysicalLocationInfo(_arg0);
				mtnm.tmforum.org.equipment.PhysicalLocationInfoList_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAlarmSeverityList
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.SeverityList_THolder _arg1= new mtnm.tmforum.org.equipment.SeverityList_THolder();
				_out = handler.createReply();
				getAlarmSeverityList(_arg0,_arg1);
				mtnm.tmforum.org.equipment.SeverityList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllSupportingEquipment
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder _arg1= new mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder();
				_out = handler.createReply();
				getAllSupportingEquipment(_arg0,_arg1);
				mtnm.tmforum.org.equipment.EquipmentOrHolderList_THelper.write(_out,_arg1.value);
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
