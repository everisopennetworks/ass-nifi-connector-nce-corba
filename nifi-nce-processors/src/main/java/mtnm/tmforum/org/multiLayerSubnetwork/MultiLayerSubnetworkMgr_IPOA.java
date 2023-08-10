package mtnm.tmforum.org.multiLayerSubnetwork;


/**
 * Generated from IDL interface "MultiLayerSubnetworkMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getSNCsByUserLabel", Integer.valueOf(0));
		m_opsHash.put ( "getAllManagedElementNames", Integer.valueOf(1));
		m_opsHash.put ( "getSNC", Integer.valueOf(2));
		m_opsHash.put ( "deactivateAndDeleteSNC", Integer.valueOf(3));
		m_opsHash.put ( "getRoute", Integer.valueOf(4));
		m_opsHash.put ( "getAllTPPoolNames", Integer.valueOf(5));
		m_opsHash.put ( "getAllEdgePointNames", Integer.valueOf(6));
		m_opsHash.put ( "createSharedRoute", Integer.valueOf(7));
		m_opsHash.put ( "getOrginalRoute", Integer.valueOf(8));
		m_opsHash.put ( "setOwner", Integer.valueOf(9));
		m_opsHash.put ( "deleteSharedRoute", Integer.valueOf(10));
		m_opsHash.put ( "checkValidSNC", Integer.valueOf(11));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", Integer.valueOf(12));
		m_opsHash.put ( "getPresetRoute", Integer.valueOf(13));
		m_opsHash.put ( "getConjunctionSNC", Integer.valueOf(14));
		m_opsHash.put ( "getSNCsByEndObjectName", Integer.valueOf(15));
		m_opsHash.put ( "getOrginalPresetRoute", Integer.valueOf(16));
		m_opsHash.put ( "getAllConjunctionSNCs", Integer.valueOf(17));
		m_opsHash.put ( "getAllInternalTopologicalLinks", Integer.valueOf(18));
		m_opsHash.put ( "createAndActivateSNC", Integer.valueOf(19));
		m_opsHash.put ( "createSNC", Integer.valueOf(20));
		m_opsHash.put ( "getAllInternalTopologicalLinkNames", Integer.valueOf(21));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(22));
		m_opsHash.put ( "createPresetRoute", Integer.valueOf(23));
		m_opsHash.put ( "swapSNC", Integer.valueOf(24));
		m_opsHash.put ( "getSNCs", Integer.valueOf(25));
		m_opsHash.put ( "getSharedRoute", Integer.valueOf(26));
		m_opsHash.put ( "setConjunctionSNC", Integer.valueOf(27));
		m_opsHash.put ( "deleteSNC", Integer.valueOf(28));
		m_opsHash.put ( "getAllTPPools", Integer.valueOf(29));
		m_opsHash.put ( "setConjunctionSNCEx", Integer.valueOf(30));
		m_opsHash.put ( "getAllMicrowaveLinksReport", Integer.valueOf(31));
		m_opsHash.put ( "getWaveLengthStatusByEndObject", Integer.valueOf(32));
		m_opsHash.put ( "getRoutes", Integer.valueOf(33));
		m_opsHash.put ( "deletePresetRoute", Integer.valueOf(34));
		m_opsHash.put ( "getAllSubnetworkConnectionNames", Integer.valueOf(35));
		m_opsHash.put ( "getAllSNCNamesWithHigherOrderSNC", Integer.valueOf(36));
		m_opsHash.put ( "getAllSubnetworkConnectionNamesWithTP", Integer.valueOf(37));
		m_opsHash.put ( "getAllEdgePoints", Integer.valueOf(38));
		m_opsHash.put ( "getRouteAndTopologicalLinksBySNCs", Integer.valueOf(39));
		m_opsHash.put ( "activateSNC", Integer.valueOf(40));
		m_opsHash.put ( "getAllSubnetworkConnections", Integer.valueOf(41));
		m_opsHash.put ( "getAllTopologicalLinks", Integer.valueOf(42));
		m_opsHash.put ( "getTopologicalLink", Integer.valueOf(43));
		m_opsHash.put ( "getAssociatedTP", Integer.valueOf(44));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(45));
		m_opsHash.put ( "getAllTopologicalLinkNames", Integer.valueOf(46));
		m_opsHash.put ( "modifySNC", Integer.valueOf(47));
		m_opsHash.put ( "getAllManagedElements", Integer.valueOf(48));
		m_opsHash.put ( "getRouteAndTopologicalLinks", Integer.valueOf(49));
		m_opsHash.put ( "getTPGroupingRelationships", Integer.valueOf(50));
		m_opsHash.put ( "getSNCNamesByRouteModificationTime", Integer.valueOf(51));
		m_opsHash.put ( "getSNCsByNativeEmsName", Integer.valueOf(52));
		m_opsHash.put ( "switchRoute", Integer.valueOf(53));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(54));
		m_opsHash.put ( "getServerConnections", Integer.valueOf(55));
		m_opsHash.put ( "getMultiLayerSubnetwork", Integer.valueOf(56));
		m_opsHash.put ( "deactivateSNC", Integer.valueOf(57));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(58));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I __r = mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I __r = mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(__o);
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
			case 0: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllManagedElementNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2,_arg3);
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
			case 2: // getSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // deactivateAndDeleteSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg1=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult521 = _arg5.value;
_out.write_string( tmpResult521 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.tmforum.org.subnetworkConnection.Route_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllTPPoolNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTPPoolNames(_arg0,_arg1,_arg2,_arg3);
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
			case 6: // getAllEdgePointNames
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
				getAllEdgePointNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 7: // createSharedRoute
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_T _arg0=mtnm.tmforum.org.subnetworkConnection.CreateSharedRouteData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder();
				_out = handler.createReply();
				createSharedRoute(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.SharedRoute_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getOrginalRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.tmforum.org.subnetworkConnection.Route_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getOrginalRoute(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.Route_THelper.write(_out,_arg2.value);
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
			case 10: // deleteSharedRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				deleteSharedRoute(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // checkValidSNC
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T _arg0=mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPData_T[] _arg1=mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.CORBA.BooleanHolder _arg3= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				checkValidSNC(_arg0,_arg1,_arg2,_arg3);
				_out.write_boolean(_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getPresetRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				getPresetRoute(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getConjunctionSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				getConjunctionSNC(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getSNCsByEndObjectName
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg2=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByEndObjectName(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getOrginalPresetRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				getOrginalPresetRoute(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllConjunctionSNCs
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder _arg1= new mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder();
				mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder _arg2= new mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder();
				_out = handler.createReply();
				getAllConjunctionSNCs(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllInternalTopologicalLinks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
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
			case 19: // createAndActivateSNC
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T _arg0=mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg1=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult522 = _arg5.value;
_out.write_string( tmpResult522 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createSNC
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T _arg0=mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg1=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg3.value);
				java.lang.String tmpResult523 = _arg4.value;
_out.write_string( tmpResult523 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllInternalTopologicalLinkNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 23: // createPresetRoute
			{
			try
			{
				mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T _arg0=mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				createPresetRoute(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // swapSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg3=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SNCState_THolder _arg5= new mtnm.tmforum.org.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				swapSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.subnetworkConnection.SNCState_THelper.write(_out,_arg5.value);
				java.lang.String tmpResult524 = _arg6.value;
_out.write_string( tmpResult524 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getSNCs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCs(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getSharedRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.SharedRoute_THolder();
				_out = handler.createReply();
				getSharedRoute(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.SharedRoute_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // setConjunctionSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setConjunctionSNC(_arg0,_arg1,_arg2);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // deleteSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg1=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllTPPools
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg2= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder _arg3= new mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
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
			case 30: // setConjunctionSNCEx
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg3=_input.read_boolean();
				_out = handler.createReply();
				setConjunctionSNCEx(_arg0,_arg1,_arg2,_arg3);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllMicrowaveLinksReport
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.notifications.NameAndAnyValue_T[] _arg3=mtnm.tmforum.org.notifications.NVList_THelper.read(_input);
				_out = handler.createReply();
				getAllMicrowaveLinksReport(_arg0,_arg1,_arg2,_arg3);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getWaveLengthStatusByEndObject
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg2=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg3=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.ConnectionDirection_T _arg4=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.WaveLengthStatusList_THolder _arg5= new mtnm.tmforum.org.subnetworkConnection.WaveLengthStatusList_THolder();
				_out = handler.createReply();
				getWaveLengthStatusByEndObject(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.WaveLengthStatusList_THelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getRoutes
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.tmforum.org.subnetworkConnection.RouteInfoList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.RouteInfoList_THolder();
				_out = handler.createReply();
				getRoutes(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.RouteInfoList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // deletePresetRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				deletePresetRoute(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllSubnetworkConnectionNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 36: // getAllSNCNamesWithHigherOrderSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllSNCNamesWithHigherOrderSNC(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getAllSubnetworkConnectionNamesWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg4= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 38: // getAllEdgePoints
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
				getAllEdgePoints(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 39: // getRouteAndTopologicalLinksBySNCs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder();
				mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder _arg3= new mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinksBySNCs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // activateSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg1=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult525 = _arg5.value;
_out.write_string( tmpResult525 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getAllSubnetworkConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getAllTopologicalLinks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder _arg3= new mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
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
			case 43: // getTopologicalLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder _arg1= new mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopologicalLink(_arg0,_arg1);
				mtnm.tmforum.org.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAssociatedTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAssociatedTP(_arg0,_arg1);
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // setUserLabel
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
			case 46: // getAllTopologicalLinkNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 47: // modifySNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.subnetworkConnection.SNCModifyData_T _arg2=mtnm.tmforum.org.subnetworkConnection.SNCModifyData_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg3=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T _arg4=mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg5=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg6= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg7= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				java.lang.String tmpResult526 = _arg8.value;
_out.write_string( tmpResult526 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getAllManagedElements
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.managedElement.ManagedElementList_THolder _arg2= new mtnm.tmforum.org.managedElement.ManagedElementList_THolder();
				mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder _arg3= new mtnm.tmforum.org.managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.managedElement.ManagedElementList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.managedElement.ManagedElementIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // getRouteAndTopologicalLinks
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.Route_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.Route_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // getTPGroupingRelationships
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getTPGroupingRelationships(_arg0,_arg1,_arg2,_arg3);
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
			case 51: // getSNCNamesByRouteModificationTime
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getSNCNamesByRouteModificationTime(_arg0,_arg1,_arg2,_arg3);
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
			case 52: // getSNCsByNativeEmsName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder _arg3= new mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getSNCsByNativeEmsName(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 53: // switchRoute
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg2=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg3=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg5= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_arg5._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SNCState_THolder _arg6= new mtnm.tmforum.org.subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				java.lang.String tmpResult527 = _arg7.value;
_out.write_string( tmpResult527 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // setAdditionalInfo
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
			case 55: // getServerConnections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.ServerTrailList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.ServerTrailList_THolder();
				_out = handler.createReply();
				getServerConnections(_arg0,_arg1);
				mtnm.tmforum.org.subnetworkConnection.ServerTrailList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 56: // getMultiLayerSubnetwork
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 57: // deactivateSNC
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T _arg1=mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_T _arg2=mtnm.tmforum.org.multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder _arg3= new mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder _arg4= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				java.lang.String tmpResult528 = _arg5.value;
_out.write_string( tmpResult528 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 58: // setNativeEMSName
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
