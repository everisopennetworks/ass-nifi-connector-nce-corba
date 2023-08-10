package mtnm.tmforum.org.trafficDescriptor;


/**
 * Generated from IDL interface "TrafficDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TrafficDescriptorMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "deleteTrafficDescriptor", Integer.valueOf(0));
		m_opsHash.put ( "HW_getAllTrafficDescriptors", Integer.valueOf(1));
		m_opsHash.put ( "HW_getAllTrafficDescriptorNames", Integer.valueOf(2));
		m_opsHash.put ( "getAllTrafficDescriptorNames", Integer.valueOf(3));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(4));
		m_opsHash.put ( "activateTrafficDescriptor", Integer.valueOf(5));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(6));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(7));
		m_opsHash.put ( "createTrafficDescriptor", Integer.valueOf(8));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(9));
		m_opsHash.put ( "setOwner", Integer.valueOf(10));
		m_opsHash.put ( "deactivateTrafficDescriptor", Integer.valueOf(11));
		m_opsHash.put ( "getAllTrafficDescriptors", Integer.valueOf(12));
		m_opsHash.put ( "getTrafficDescriptor", Integer.valueOf(13));
		m_opsHash.put ( "HW_createTrafficDescriptor", Integer.valueOf(14));
		m_opsHash.put ( "getAssociatedCTPs", Integer.valueOf(15));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trafficDescriptor/TrafficDescriptorMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I __r = mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I __r = mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(__o);
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
			case 0: // deleteTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTrafficDescriptor(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // HW_getAllTrafficDescriptors
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder _arg2= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder();
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder _arg3= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTrafficDescriptors(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // HW_getAllTrafficDescriptorNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				HW_getAllTrafficDescriptorNames(_arg0,_arg1,_arg2,_arg3);
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
			case 3: // getAllTrafficDescriptorNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficDescriptorNames(_arg0,_arg1,_arg2);
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
			case 5: // activateTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder _arg1= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				activateTrafficDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setNativeEMSName
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
			case 7: // getCapabilities
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
			case 8: // createTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.trafficDescriptor.TDCreateData_T _arg0=mtnm.tmforum.org.trafficDescriptor.TDCreateData_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder _arg1= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				createTrafficDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setAdditionalInfo
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
			case 10: // setOwner
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
			case 11: // deactivateTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder _arg1= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				deactivateTrafficDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllTrafficDescriptors
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder _arg1= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder();
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder _arg2= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficDescriptors(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder _arg1= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				getTrafficDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // HW_createTrafficDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TDCreateData_T _arg1=mtnm.tmforum.org.trafficDescriptor.TDCreateData_THelper.read(_input);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder _arg2= new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder();
				_out = handler.createReply();
				HW_createTrafficDescriptor(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAssociatedCTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssociatedCTPs(_arg0,_arg1,_arg2,_arg3);
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
