package mtnm.tmforum.org.flowDomain_TI;


/**
 * Generated from IDL interface "FlowDomainMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FlowDomainMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createAndActivateFDFr", Integer.valueOf(0));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(1));
		m_opsHash.put ( "deactivateAndDeleteFDFr", Integer.valueOf(2));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(3));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(4));
		m_opsHash.put ( "getAllFDFrs", Integer.valueOf(5));
		m_opsHash.put ( "createFTP", Integer.valueOf(6));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(7));
		m_opsHash.put ( "setOwner", Integer.valueOf(8));
		m_opsHash.put ( "deleteFTP", Integer.valueOf(9));
		m_opsHash.put ( "modifyFDFr", Integer.valueOf(10));
		m_opsHash.put ( "getFDFr", Integer.valueOf(11));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain_TI/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_IHelper.narrow(__o);
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
			case 0: // createAndActivateFDFr
			{
			try
			{
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrCreateData_T _arg0=mtnm.tmforum.org.flowDomainFragment_TI.FDFrCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THolder _arg5= new mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THolder();
				_arg5._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg6= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder _arg7= new mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg8= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg9= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg10= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9,_arg10);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THelper.write(_out,_arg7.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg9.value);
				java.lang.String tmpResult277 = _arg10.value;
_out.write_string( tmpResult277 );
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
			case 2: // deactivateAndDeleteFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder _arg2= new mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteFDFr(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult278 = _arg3.value;
_out.write_string( tmpResult278 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setNativeEMSName
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
			case 4: // getCapabilities
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
			case 5: // getAllFDFrs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrList_THolder _arg3= new mtnm.tmforum.org.flowDomainFragment_TI.FDFrList_THolder();
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrIterator_IHolder _arg4= new mtnm.tmforum.org.flowDomainFragment_TI.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // createFTP
			{
			try
			{
				mtnm.tmforum.org.flowDomain_TI.FTPCreateData_T _arg0=mtnm.tmforum.org.flowDomain_TI.FTPCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult279 = _arg3.value;
_out.write_string( tmpResult279 );
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
			case 9: // deleteFTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteFTP(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult280 = _arg2.value;
_out.write_string( tmpResult280 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // modifyFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_TI.FDFrModifyData_T _arg1=mtnm.tmforum.org.flowDomainFragment_TI.FDFrModifyData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T _arg2=mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg5= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder _arg6= new mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THelper.write(_out,_arg6.value);
				java.lang.String tmpResult281 = _arg7.value;
_out.write_string( tmpResult281 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THelper.write(_out,_arg1.value);
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
