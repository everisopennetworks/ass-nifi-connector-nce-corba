package mtnm.tmforum.org.flowDomain_cmcc;


/**
 * Generated from IDL interface "FlowDomainMgr_cmcc_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FlowDomainMgr_cmcc_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "createMFD", Integer.valueOf(0));
		m_opsHash.put ( "getMFD", Integer.valueOf(1));
		m_opsHash.put ( "modifyFlowDomain", Integer.valueOf(2));
		m_opsHash.put ( "unassignCPTPsFromMFD", Integer.valueOf(3));
		m_opsHash.put ( "getTransmissionParams", Integer.valueOf(4));
		m_opsHash.put ( "associateCPTPsWithFlowDomain", Integer.valueOf(5));
		m_opsHash.put ( "associateMFDsWithFlowDomain", Integer.valueOf(6));
		m_opsHash.put ( "setOwner", Integer.valueOf(7));
		m_opsHash.put ( "getFlowDomainsByUserLabel", Integer.valueOf(8));
		m_opsHash.put ( "createAndActivateFDFr", Integer.valueOf(9));
		m_opsHash.put ( "getAllAssociatedMFDs", Integer.valueOf(10));
		m_opsHash.put ( "assignCPTPsToMFD", Integer.valueOf(11));
		m_opsHash.put ( "getAllAssignableCPTPs", Integer.valueOf(12));
		m_opsHash.put ( "modifyFDFr", Integer.valueOf(13));
		m_opsHash.put ( "getAllCPTPs", Integer.valueOf(14));
		m_opsHash.put ( "getFDFrsWithTP", Integer.valueOf(15));
		m_opsHash.put ( "getAllTopologicalLinksOfFD", Integer.valueOf(16));
		m_opsHash.put ( "getAssigningMFD", Integer.valueOf(17));
		m_opsHash.put ( "deleteFDFr", Integer.valueOf(18));
		m_opsHash.put ( "createFlowDomain", Integer.valueOf(19));
		m_opsHash.put ( "createFTP", Integer.valueOf(20));
		m_opsHash.put ( "getAllAssignedCPTPs", Integer.valueOf(21));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(22));
		m_opsHash.put ( "getAssociatingFD", Integer.valueOf(23));
		m_opsHash.put ( "activateFDFr", Integer.valueOf(24));
		m_opsHash.put ( "getFlowDomain", Integer.valueOf(25));
		m_opsHash.put ( "deAssociateCPTPsFromFlowDomain", Integer.valueOf(26));
		m_opsHash.put ( "getFDFr", Integer.valueOf(27));
		m_opsHash.put ( "deleteMFD", Integer.valueOf(28));
		m_opsHash.put ( "getAllSupportedMFDs", Integer.valueOf(29));
		m_opsHash.put ( "getFDFrsByUserLabel", Integer.valueOf(30));
		m_opsHash.put ( "getAllFDFrs", Integer.valueOf(31));
		m_opsHash.put ( "deactivateAndDeleteFDFr", Integer.valueOf(32));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(33));
		m_opsHash.put ( "deleteFTP", Integer.valueOf(34));
		m_opsHash.put ( "getAllFlowDomains", Integer.valueOf(35));
		m_opsHash.put ( "modifyMFD", Integer.valueOf(36));
		m_opsHash.put ( "createFDFr", Integer.valueOf(37));
		m_opsHash.put ( "deAssociateMFDsFromFlowDomain", Integer.valueOf(38));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(39));
		m_opsHash.put ( "deactivateFDFr", Integer.valueOf(40));
		m_opsHash.put ( "deleteFlowDomain", Integer.valueOf(41));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(42));
		m_opsHash.put ( "getFDFrRoute", Integer.valueOf(43));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain_cmcc/FlowDomainMgr_cmcc_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I __r = mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I __r = mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(__o);
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
			case 0: // createMFD
			{
			try
			{
				mtnm.tmforum.org.flowDomain_cmcc.MFDCreateData_T _arg0=mtnm.tmforum.org.flowDomain_cmcc.MFDCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMFD(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult238 = _arg3.value;
_out.write_string( tmpResult238 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // modifyFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.FDModifyData_T _arg1=mtnm.tmforum.org.flowDomain_cmcc.FDModifyData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFlowDomain(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult239 = _arg3.value;
_out.write_string( tmpResult239 );
				java.lang.String tmpResult240 = _arg4.value;
_out.write_string( tmpResult240 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // unassignCPTPsFromMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				unassignCPTPsFromMFD(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult241 = _arg3.value;
_out.write_string( tmpResult241 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getTransmissionParams
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.flowDomain_cmcc.ParameterGroupsList_THelper.read(_input);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder _arg2= new mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder();
				_out = handler.createReply();
				getTransmissionParams(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // associateCPTPsWithFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				associateCPTPsWithFlowDomain(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult242 = _arg3.value;
_out.write_string( tmpResult242 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // associateMFDsWithFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				associateMFDsWithFlowDomain(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult243 = _arg3.value;
_out.write_string( tmpResult243 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setOwner
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
			case 8: // getFlowDomainsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder();
				_out = handler.createReply();
				getFlowDomainsByUserLabel(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain_cmcc.FDList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // createAndActivateFDFr
			{
			try
			{
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_T _arg0=mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder _arg5= new mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder();
				_arg5._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg6= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg7= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg8= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg9= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg10= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9,_arg10);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg7.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg9.value);
				java.lang.String tmpResult244 = _arg10.value;
_out.write_string( tmpResult244 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllAssociatedMFDs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder();
				mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder _arg3= new mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllAssociatedMFDs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.flowDomain_cmcc.MFDList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // assignCPTPsToMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				assignCPTPsToMFD(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult245 = _arg3.value;
_out.write_string( tmpResult245 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllAssignableCPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllAssignableCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 13: // modifyFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrModifyData_T _arg1=mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrModifyData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T _arg2=mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg5= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg6= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg6.value);
				java.lang.String tmpResult246 = _arg7.value;
_out.write_string( tmpResult246 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllCPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.CPTP_Role_T _arg1=mtnm.tmforum.org.flowDomain_cmcc.CPTP_Role_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg4= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllCPTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getFDFrsWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder _arg2= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder();
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder _arg3= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllTopologicalLinksOfFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinksOfFD(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAssigningMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getAssigningMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // deleteFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFDFr(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // createFlowDomain
			{
			try
			{
				mtnm.tmforum.org.flowDomain_cmcc.FDCreateData_T _arg0=mtnm.tmforum.org.flowDomain_cmcc.FDCreateData_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder _arg3= new mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFlowDomain(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg3.value);
				java.lang.String tmpResult247 = _arg4.value;
_out.write_string( tmpResult247 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createFTP
			{
			try
			{
				mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_T _arg0=mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult248 = _arg3.value;
_out.write_string( tmpResult248 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllAssignedCPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllAssignedCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 22: // getCapabilities
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
			case 23: // getAssociatingFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder();
				_out = handler.createReply();
				getAssociatingFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // activateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder();
				_out = handler.createReply();
				getFlowDomain(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deAssociateCPTPsFromFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deAssociateCPTPsFromFlowDomain(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult249 = _arg3.value;
_out.write_string( tmpResult249 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // deleteMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteMFD(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult250 = _arg2.value;
_out.write_string( tmpResult250 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllSupportedMFDs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder();
				mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder _arg3= new mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllSupportedMFDs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.flowDomain_cmcc.MFDList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllFDFrs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder _arg3= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder();
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder _arg4= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // deactivateAndDeleteFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg2= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteFDFr(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult251 = _arg3.value;
_out.write_string( tmpResult251 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // setUserLabel
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
			case 34: // deleteFTP
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
				java.lang.String tmpResult252 = _arg2.value;
_out.write_string( tmpResult252 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllFlowDomains
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder _arg1= new mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder();
				mtnm.tmforum.org.flowDomain_cmcc.FDIterator_IHolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.FDIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomains(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.flowDomain_cmcc.FDList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomain_cmcc.FDIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // modifyMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.MFDModifyData_T _arg1=mtnm.tmforum.org.flowDomain_cmcc.MFDModifyData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder _arg2= new mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFD(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult253 = _arg3.value;
_out.write_string( tmpResult253 );
				java.lang.String tmpResult254 = _arg4.value;
_out.write_string( tmpResult254 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // createFDFr
			{
			try
			{
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_T _arg0=mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPData_T[] _arg2=mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPData_T[] _arg3=mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder _arg5= new mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder();
				_arg5._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg6= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg7= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg7.value);
				java.lang.String tmpResult255 = _arg8.value;
_out.write_string( tmpResult255 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // deAssociateMFDsFromFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deAssociateMFDsFromFlowDomain(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult256 = _arg3.value;
_out.write_string( tmpResult256 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setAdditionalInfo
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
			case 40: // deactivateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // deleteFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteFlowDomain(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult257 = _arg2.value;
_out.write_string( tmpResult257 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // setNativeEMSName
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
			case 43: // getFDFrRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrRoute_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrRoute_THolder();
				_out = handler.createReply();
				getFDFrRoute(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrRoute_THelper.write(_out,_arg1.value);
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
