package mtnm.tmforum.org.managedElementManager;


/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getAllManagedElements", Integer.valueOf(0));
		m_opsHash.put ( "getAvailableTimeSlot", Integer.valueOf(1));
		m_opsHash.put ( "createCrossConnections", Integer.valueOf(2));
		m_opsHash.put ( "activateCrossConnections", Integer.valueOf(3));
		m_opsHash.put ( "checkActiveAlarms", Integer.valueOf(4));
		m_opsHash.put ( "deactivateCrossConnections", Integer.valueOf(5));
		m_opsHash.put ( "modifyFTPMembers", Integer.valueOf(6));
		m_opsHash.put ( "setAPRInfo", Integer.valueOf(7));
		m_opsHash.put ( "getContainedPotentialTPs", Integer.valueOf(8));
		m_opsHash.put ( "getContainedInUseTPs", Integer.valueOf(9));
		m_opsHash.put ( "getAllPTPs", Integer.valueOf(10));
		m_opsHash.put ( "setOwner", Integer.valueOf(11));
		m_opsHash.put ( "getContainingTPNames", Integer.valueOf(12));
		m_opsHash.put ( "getContainedInUseTPNames", Integer.valueOf(13));
		m_opsHash.put ( "setAPEInfo", Integer.valueOf(14));
		m_opsHash.put ( "getAllAlarmsByFTP", Integer.valueOf(15));
		m_opsHash.put ( "getADCInfo", Integer.valueOf(16));
		m_opsHash.put ( "deleteFTP", Integer.valueOf(17));
		m_opsHash.put ( "modifyCrossConnection", Integer.valueOf(18));
		m_opsHash.put ( "getAllManagedElementNames", Integer.valueOf(19));
		m_opsHash.put ( "getAllActiveAlarms", Integer.valueOf(20));
		m_opsHash.put ( "getAllPTPNames", Integer.valueOf(21));
		m_opsHash.put ( "getNEStaticInfo", Integer.valueOf(22));
		m_opsHash.put ( "getContainedCurrentTPNames", Integer.valueOf(23));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(24));
		m_opsHash.put ( "setotnALCInfo", Integer.valueOf(25));
		m_opsHash.put ( "getActiveAlarms", Integer.valueOf(26));
		m_opsHash.put ( "getContainedPotentialTPNames", Integer.valueOf(27));
		m_opsHash.put ( "setwdmALCInfo", Integer.valueOf(28));
		m_opsHash.put ( "getAllManagedElementGroups", Integer.valueOf(29));
		m_opsHash.put ( "getAllCrossConnections", Integer.valueOf(30));
		m_opsHash.put ( "getContainingSubnetworkNames", Integer.valueOf(31));
		m_opsHash.put ( "deleteCrossConnections", Integer.valueOf(32));
		m_opsHash.put ( "getFTPMembers", Integer.valueOf(33));
		m_opsHash.put ( "getContainedCurrentTPs", Integer.valueOf(34));
		m_opsHash.put ( "getContainingTPs", Integer.valueOf(35));
		m_opsHash.put ( "getTP", Integer.valueOf(36));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(37));
		m_opsHash.put ( "getAPRInfo", Integer.valueOf(38));
		m_opsHash.put ( "getManagedElement", Integer.valueOf(39));
		m_opsHash.put ( "setADCInfo", Integer.valueOf(40));
		m_opsHash.put ( "getAllManagedElementsWithMEGroup", Integer.valueOf(41));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(42));
		m_opsHash.put ( "setTPData", Integer.valueOf(43));
		m_opsHash.put ( "createFTP", Integer.valueOf(44));
		m_opsHash.put ( "getAllLLDPs", Integer.valueOf(45));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(46));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I __r = mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.managedElementManager.ManagedElementMgr_I __r = mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IHelper.narrow(__o);
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
			case 0: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.managedElement.ManagedElementList_THolder _arg1= new mtnm.tmforum.org.managedElement.ManagedElementList_THolder();
				mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder _arg2= new mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAvailableTimeSlot
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getAvailableTimeSlot(_arg0,_arg1);
				java.lang.String tmpResult505 = _arg1.value;
_out.write_string( tmpResult505 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // createCrossConnections
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] _arg0=mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // activateCrossConnections
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] _arg0=mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // checkActiveAlarms
			{
			try
			{
				org.omg.CosNotification.StructuredEvent[] _arg0=mtnm.tmforum.org.notifications.EventList_THelper.read(_input);
				mtnm.tmforum.org.notifications.EventList_THolder _arg1= new mtnm.tmforum.org.notifications.EventList_THolder();
				_out = handler.createReply();
				checkActiveAlarms(_arg0,_arg1);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // deactivateCrossConnections
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] _arg0=mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // modifyFTPMembers
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.subnetworkConnection.TPData_T[] _arg2=mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				modifyFTPMembers(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setAPRInfo
			{
			try
			{
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setAPRInfo(_arg0,_arg1);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getContainedPotentialTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg4= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 9: // getContainedInUseTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg4= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 10: // getAllPTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg4= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg5= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setOwner
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
			case 12: // getContainingTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getContainedInUseTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 14: // setAPEInfo
			{
			try
			{
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setAPEInfo(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg5=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg8= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getADCInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getADCInfo(_arg0,_arg1);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // deleteFTP
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
			case 18: // modifyCrossConnection
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T _arg0=mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T _arg1=mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.CrossConnect_THolder();
				_out = handler.createReply();
				modifyCrossConnection(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
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
			case 20: // getAllActiveAlarms
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg2=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg4= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg5= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllPTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg5= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getNEStaticInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getNEStaticInfo(_arg0,_arg1,_arg2,_arg3);
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
			case 23: // getContainedCurrentTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 24: // getCapabilities
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
			case 25: // setotnALCInfo
			{
			try
			{
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setotnALCInfo(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getActiveAlarms
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg2=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg4= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg5= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getContainedPotentialTPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 28: // setwdmALCInfo
			{
			try
			{
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setwdmALCInfo(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllManagedElementGroups
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.managedElement.neGroupInfoList_THolder _arg1= new mtnm.tmforum.org.managedElement.neGroupInfoList_THolder();
				mtnm.tmforum.org.managedElement.neGroupInfoListIterator_IHolder _arg2= new mtnm.tmforum.org.managedElement.neGroupInfoListIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementGroups(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.managedElement.neGroupInfoList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.managedElement.neGroupInfoListIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllCrossConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				mtnm.tmforum.org.subnetworkConnection.CCIterator_IHolder _arg4= new mtnm.tmforum.org.subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getContainingSubnetworkNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // deleteCrossConnections
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] _arg0=mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getFTPMembers
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				getFTPMembers(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getContainedCurrentTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg4= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 35: // getContainingTPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // setUserLabel
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
			case 38: // getAPRInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getAPRInfo(_arg0,_arg1);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getManagedElement
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.managedElement.ManagedElement_THolder _arg1= new mtnm.tmforum.org.managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				mtnm.tmforum.org.managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // setADCInfo
			{
			try
			{
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setADCInfo(_arg0,_arg1);
				mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getAllManagedElementsWithMEGroup
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.managedElement.neGroupNameList_THelper.read(_input);
				mtnm.tmforum.org.managedElement.neGroupList_THolder _arg1= new mtnm.tmforum.org.managedElement.neGroupList_THolder();
				_out = handler.createReply();
				getAllManagedElementsWithMEGroup(_arg0,_arg1);
				mtnm.tmforum.org.managedElement.neGroupList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // setAdditionalInfo
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
			case 43: // setTPData
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.TPData_T _arg0=mtnm.tmforum.org.subnetworkConnection.TPData_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // createFTP
			{
			try
			{
				mtnm.tmforum.org.flowDomain.FTPCreateData_T _arg0=mtnm.tmforum.org.flowDomain.FTPCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllLLDPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.managedElement.PortLLDPList_THolder _arg1= new mtnm.tmforum.org.managedElement.PortLLDPList_THolder();
				_out = handler.createReply();
				getAllLLDPs(_arg0,_arg1);
				mtnm.tmforum.org.managedElement.PortLLDPList_THelper.write(_out,_arg1.value);
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
