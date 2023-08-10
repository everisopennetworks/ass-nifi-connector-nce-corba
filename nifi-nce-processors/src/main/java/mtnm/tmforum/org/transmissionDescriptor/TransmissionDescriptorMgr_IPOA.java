package mtnm.tmforum.org.transmissionDescriptor;


/**
 * Generated from IDL interface "TransmissionDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TransmissionDescriptorMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createTransmissionDescriptor", Integer.valueOf(0));
		m_opsHash.put ( "deleteTransmissionDescriptor", Integer.valueOf(1));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(2));
		m_opsHash.put ( "validateTMDAssignmentToObject", Integer.valueOf(3));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(4));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(5));
		m_opsHash.put ( "setTMDAssociation", Integer.valueOf(6));
		m_opsHash.put ( "getTransmissionDescriptor", Integer.valueOf(7));
		m_opsHash.put ( "getAllTransmissionDescriptors", Integer.valueOf(8));
		m_opsHash.put ( "getAllTransmissionDescriptorNames", Integer.valueOf(9));
		m_opsHash.put ( "modifyTransmissionDescriptor", Integer.valueOf(10));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(11));
		m_opsHash.put ( "setOwner", Integer.valueOf(12));
		m_opsHash.put ( "getAssociatedTPs", Integer.valueOf(13));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptorMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I __r = mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I __r = mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(__o);
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
			case 0: // createTransmissionDescriptor
			{
			try
			{
				mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_T _arg0=mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_THelper.read(_input);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				createTransmissionDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // deleteTransmissionDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTransmissionDescriptor(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setUserLabel
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
			case 3: // validateTMDAssignmentToObject
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder _arg2= new mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder();
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToObject(_arg0,_arg1,_arg2,_arg3);
				java.lang.String tmpResult750 = _arg1.value;
_out.write_string( tmpResult750 );
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg3.value);
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
			case 6: // setTMDAssociation
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_THolder _arg1= new mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTMDAssociation(_arg0,_arg1);
				mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getTransmissionDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				getTransmissionDescriptor(_arg0,_arg1);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllTransmissionDescriptors
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorList_THolder _arg1= new mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorList_THolder();
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorIterator_IHolder _arg2= new mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptors(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllTransmissionDescriptorNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptorNames(_arg0,_arg1,_arg2);
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
			case 10: // modifyTransmissionDescriptor
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_T _arg1=mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder _arg3= new mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg5= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTransmissionDescriptor(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				java.lang.String tmpResult751 = _arg6.value;
_out.write_string( tmpResult751 );
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
			case 12: // setOwner
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
			case 13: // getAssociatedTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
