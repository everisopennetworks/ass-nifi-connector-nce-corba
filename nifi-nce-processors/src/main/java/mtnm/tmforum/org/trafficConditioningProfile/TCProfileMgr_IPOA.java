package mtnm.tmforum.org.trafficConditioningProfile;


/**
 * Generated from IDL interface "TCProfileMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TCProfileMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(0));
		m_opsHash.put ( "HW_createTCProfile", Integer.valueOf(1));
		m_opsHash.put ( "deleteTCProfile", Integer.valueOf(2));
		m_opsHash.put ( "HW_getAllTCProfiles", Integer.valueOf(3));
		m_opsHash.put ( "assignTrafficConditioningProfile", Integer.valueOf(4));
		m_opsHash.put ( "getTCProfile", Integer.valueOf(5));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(6));
		m_opsHash.put ( "getTCProfileAssociatedResouces", Integer.valueOf(7));
		m_opsHash.put ( "getAllTCProfiles", Integer.valueOf(8));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(9));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(10));
		m_opsHash.put ( "createTCProfile", Integer.valueOf(11));
		m_opsHash.put ( "HW_modifyTCProfile", Integer.valueOf(12));
		m_opsHash.put ( "setOwner", Integer.valueOf(13));
		m_opsHash.put ( "HW_getTCProfile", Integer.valueOf(14));
		m_opsHash.put ( "HW_getAllTCProfileNames", Integer.valueOf(15));
		m_opsHash.put ( "modifyTCProfile", Integer.valueOf(16));
		m_opsHash.put ( "deassignTrafficConditioningProfile", Integer.valueOf(17));
		m_opsHash.put ( "getTCProfileAssociatedTPs", Integer.valueOf(18));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trafficConditioningProfile/TCProfileMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I __r = mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I __r = mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(__o);
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
			case 0: // setNativeEMSName
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
			case 1: // HW_createTCProfile
			{
			try
			{
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T _arg0=mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder();
				_out = handler.createReply();
				HW_createTCProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // deleteTCProfile
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTCProfile(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // HW_getAllTCProfiles
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileList_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileList_THolder();
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileIterator_IHolder _arg2= new mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTCProfiles(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // assignTrafficConditioningProfile
			{
			try
			{
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] _arg0=mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder();
				_out = handler.createReply();
				assignTrafficConditioningProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getTCProfile
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				getTCProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
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
			case 7: // getTCProfileAssociatedResouces
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder();
				_out = handler.createReply();
				getTCProfileAssociatedResouces(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllTCProfiles
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileList_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TCProfileList_THolder();
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileIterator_IHolder _arg2= new mtnm.tmforum.org.trafficConditioningProfile.TCProfileIterator_IHolder();
				_out = handler.createReply();
				getAllTCProfiles(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getCapabilities
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
			case 10: // setAdditionalInfo
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
			case 11: // createTCProfile
			{
			try
			{
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T _arg0=mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder();
				_out = handler.createReply();
				createTCProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // HW_modifyTCProfile
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T _arg1=mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder _arg2= new mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				HW_modifyTCProfile(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult707 = _arg3.value;
_out.write_string( tmpResult707 );
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
			case 14: // HW_getTCProfile
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder();
				_out = handler.createReply();
				HW_getTCProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // HW_getAllTCProfileNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTCProfileNames(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // modifyTCProfile
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T _arg1=mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder _arg3= new mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTCProfile(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THelper.write(_out,_arg3.value);
				java.lang.String tmpResult708 = _arg4.value;
_out.write_string( tmpResult708 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // deassignTrafficConditioningProfile
			{
			try
			{
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] _arg0=mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THelper.read(_input);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder _arg1= new mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder();
				_out = handler.createReply();
				deassignTrafficConditioningProfile(_arg0,_arg1);
				mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getTCProfileAssociatedTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getTCProfileAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
