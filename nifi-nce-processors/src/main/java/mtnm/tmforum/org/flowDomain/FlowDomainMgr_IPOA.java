package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL interface "FlowDomainMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FlowDomainMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.flowDomain.FlowDomainMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getFDFrsWithTP", Integer.valueOf(0));
		m_opsHash.put ( "associateCPTPsWithFlowDomain", Integer.valueOf(1));
		m_opsHash.put ( "createFDFr", Integer.valueOf(2));
		m_opsHash.put ( "createMFD", Integer.valueOf(3));
		m_opsHash.put ( "unassignCPTPsFromMFD", Integer.valueOf(4));
		m_opsHash.put ( "activateFDFr", Integer.valueOf(5));
		m_opsHash.put ( "deleteMFD", Integer.valueOf(6));
		m_opsHash.put ( "getTransmissionParams", Integer.valueOf(7));
		m_opsHash.put ( "addFPsToFDFr", Integer.valueOf(8));
		m_opsHash.put ( "setOwner", Integer.valueOf(9));
		m_opsHash.put ( "getFDfromMFD", Integer.valueOf(10));
		m_opsHash.put ( "getAssigningMFD", Integer.valueOf(11));
		m_opsHash.put ( "getAllFDFrs", Integer.valueOf(12));
		m_opsHash.put ( "deactivateFDFr", Integer.valueOf(13));
		m_opsHash.put ( "getAssignableCPTPs", Integer.valueOf(14));
		m_opsHash.put ( "deAssociateCPTPsFromFlowDomain", Integer.valueOf(15));
		m_opsHash.put ( "createFlowDomain", Integer.valueOf(16));
		m_opsHash.put ( "deAssociateMFDsFromFlowDomain", Integer.valueOf(17));
		m_opsHash.put ( "deleteFTP", Integer.valueOf(18));
		m_opsHash.put ( "deleteFDFr", Integer.valueOf(19));
		m_opsHash.put ( "createFTP", Integer.valueOf(20));
		m_opsHash.put ( "modifyFlowDomain", Integer.valueOf(21));
		m_opsHash.put ( "getAllCPTPs", Integer.valueOf(22));
		m_opsHash.put ( "deleteFlowDomain", Integer.valueOf(23));
		m_opsHash.put ( "getAllMFDNames", Integer.valueOf(24));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(25));
		m_opsHash.put ( "performEthernetOAMCommand", Integer.valueOf(26));
		m_opsHash.put ( "modifyMFD", Integer.valueOf(27));
		m_opsHash.put ( "getAllFDFrNames", Integer.valueOf(28));
		m_opsHash.put ( "removeFPsFromFDFr", Integer.valueOf(29));
		m_opsHash.put ( "modifyFDFr", Integer.valueOf(30));
		m_opsHash.put ( "getFlowDomainsByUserLabel", Integer.valueOf(31));
		m_opsHash.put ( "getAllEthernetOAMPoint", Integer.valueOf(32));
		m_opsHash.put ( "getFDFrServerTrail", Integer.valueOf(33));
		m_opsHash.put ( "getAllFlowDomainNames", Integer.valueOf(34));
		m_opsHash.put ( "assignCPTPsToMFD", Integer.valueOf(35));
		m_opsHash.put ( "getFDFrsByUserLabel", Integer.valueOf(36));
		m_opsHash.put ( "getAllFlowDomains", Integer.valueOf(37));
		m_opsHash.put ( "associateMFDsWithFlowDomain", Integer.valueOf(38));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(39));
		m_opsHash.put ( "getFDFr", Integer.valueOf(40));
		m_opsHash.put ( "getMFD", Integer.valueOf(41));
		m_opsHash.put ( "validateTMDAssignmentToMFD", Integer.valueOf(42));
		m_opsHash.put ( "getFlowDomain", Integer.valueOf(43));
		m_opsHash.put ( "getAllMFDs", Integer.valueOf(44));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(45));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(46));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.flowDomain.FlowDomainMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain.FlowDomainMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain.FlowDomainMgr_IHelper.narrow(__o);
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
			case 0: // getFDFrsWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder _arg2= new mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder();
				mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder _arg3= new mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // associateCPTPsWithFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateCPTPsWithFlowDomain(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // createFDFr
			{
			try
			{
				mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_T _arg0=mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THolder _arg4= new mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg5= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder _arg6= new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg6.value);
				java.lang.String tmpResult161 = _arg7.value;
_out.write_string( tmpResult161 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // createMFD
			{
			try
			{
				mtnm.tmforum.org.flowDomain.MFDCreateData_T _arg0=mtnm.tmforum.org.flowDomain.MFDCreateData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				createMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // unassignCPTPsFromMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				unassignCPTPsFromMFD(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // activateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // deleteMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMFD(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getTransmissionParams
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.flowDomain.ParameterGroupsList_THelper.read(_input);
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
			case 8: // addFPsToFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T _arg1=mtnm.tmforum.org.flowDomain.ConnectivityRequirement_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addFPsToFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult162 = _arg5.value;
_out.write_string( tmpResult162 );
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
			case 10: // getFDfromMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.FlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFDfromMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAssigningMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getAssigningMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllFDFrs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder _arg3= new mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder();
				mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder _arg4= new mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // deactivateFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAssignableCPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssignableCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 15: // deAssociateCPTPsFromFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateCPTPsFromFlowDomain(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // createFlowDomain
			{
			try
			{
				mtnm.tmforum.org.flowDomain.FDCreateData_T _arg0=mtnm.tmforum.org.flowDomain.FDCreateData_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.flowDomain.FlowDomain_THolder _arg2= new mtnm.tmforum.org.flowDomain.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFlowDomain(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult163 = _arg3.value;
_out.write_string( tmpResult163 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // deAssociateMFDsFromFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateMFDsFromFlowDomain(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // deleteFTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFTP(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // deleteFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteFDFr(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
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
				mtnm.tmforum.org.flowDomain.FTPCreateData_T _arg0=mtnm.tmforum.org.flowDomain.FTPCreateData_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // modifyFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.FDModifyData_T _arg1=mtnm.tmforum.org.flowDomain.FDModifyData_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.FlowDomain_THolder _arg2= new mtnm.tmforum.org.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				modifyFlowDomain(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllCPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 23: // deleteFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFlowDomain(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllMFDNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMFDNames(_arg0,_arg1,_arg2,_arg3);
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
			case 25: // getCapabilities
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
			case 26: // performEthernetOAMCommand
			{
			try
			{
				mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T _arg0=mtnm.tmforum.org.flowDomain.EthernetOAMOperation_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THolder _arg1= new mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THolder();
				_out = handler.createReply();
				performEthernetOAMCommand(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // modifyMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.MFDModifyData_T _arg1=mtnm.tmforum.org.flowDomain.MFDModifyData_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder _arg3= new mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder _arg5= new mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFD(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg5.value);
				java.lang.String tmpResult164 = _arg6.value;
_out.write_string( tmpResult164 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getAllFDFrNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // removeFPsFromFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeFPsFromFDFr(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult165 = _arg2.value;
_out.write_string( tmpResult165 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // modifyFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_T _arg1=mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg3=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder _arg4= new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult166 = _arg5.value;
_out.write_string( tmpResult166 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getFlowDomainsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.flowDomain.FDList_THolder _arg1= new mtnm.tmforum.org.flowDomain.FDList_THolder();
				_out = handler.createReply();
				getFlowDomainsByUserLabel(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.FDList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllEthernetOAMPoint
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THolder _arg1= new mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THolder();
				_out = handler.createReply();
				getAllEthernetOAMPoint(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getFDFrServerTrail
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getFDFrServerTrail(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllFlowDomainNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomainNames(_arg0,_arg1,_arg2);
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
			case 35: // assignCPTPsToMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				assignCPTPsToMFD(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getAllFlowDomains
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.flowDomain.FDList_THolder _arg1= new mtnm.tmforum.org.flowDomain.FDList_THolder();
				mtnm.tmforum.org.flowDomain.FDIterator_IHolder _arg2= new mtnm.tmforum.org.flowDomain.FDIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomains(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.flowDomain.FDList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.flowDomain.FDIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // associateMFDsWithFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateMFDsWithFlowDomain(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setUserLabel
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
			case 40: // getFDFr
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder _arg1= new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getMFD(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // validateTMDAssignmentToMFD
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder _arg2= new mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder();
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToMFD(_arg0,_arg1,_arg2,_arg3);
				java.lang.String tmpResult167 = _arg1.value;
_out.write_string( tmpResult167 );
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
			case 43: // getFlowDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.flowDomain.FlowDomain_THolder _arg1= new mtnm.tmforum.org.flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFlowDomain(_arg0,_arg1);
				mtnm.tmforum.org.flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAllMFDs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.flowDomain.MFDList_THolder _arg2= new mtnm.tmforum.org.flowDomain.MFDList_THolder();
				mtnm.tmforum.org.flowDomain.MFDIterator_IHolder _arg3= new mtnm.tmforum.org.flowDomain.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllMFDs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.flowDomain.MFDList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.flowDomain.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // setAdditionalInfo
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
			case 46: // setNativeEMSName
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
