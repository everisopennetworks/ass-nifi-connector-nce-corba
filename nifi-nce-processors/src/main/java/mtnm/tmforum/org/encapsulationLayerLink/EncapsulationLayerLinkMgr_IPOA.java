package mtnm.tmforum.org.encapsulationLayerLink;


/**
 * Generated from IDL interface "EncapsulationLayerLinkMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EncapsulationLayerLinkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "deactivateELLink", Integer.valueOf(0));
		m_opsHash.put ( "getAllELLinksWithMeOrFd", Integer.valueOf(1));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(2));
		m_opsHash.put ( "getServerSNCsAndTLs", Integer.valueOf(3));
		m_opsHash.put ( "getConnectingELL", Integer.valueOf(4));
		m_opsHash.put ( "getAllELLinks", Integer.valueOf(5));
		m_opsHash.put ( "createELLink", Integer.valueOf(6));
		m_opsHash.put ( "getELLinkWithTP", Integer.valueOf(7));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(8));
		m_opsHash.put ( "getELLinkWithSncOrTl", Integer.valueOf(9));
		m_opsHash.put ( "decreaseBandwidthOfELLink", Integer.valueOf(10));
		m_opsHash.put ( "modifyELLink", Integer.valueOf(11));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(12));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(13));
		m_opsHash.put ( "setOwner", Integer.valueOf(14));
		m_opsHash.put ( "setELLinkLCASState", Integer.valueOf(15));
		m_opsHash.put ( "activateELLink", Integer.valueOf(16));
		m_opsHash.put ( "getTransmissionParams", Integer.valueOf(17));
		m_opsHash.put ( "increaseBandwidthOfELLink", Integer.valueOf(18));
		m_opsHash.put ( "getAllELLinkNames", Integer.valueOf(19));
		m_opsHash.put ( "deleteELLink", Integer.valueOf(20));
		m_opsHash.put ( "getELLink", Integer.valueOf(21));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/encapsulationLayerLink/EncapsulationLayerLinkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I __r = mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I __r = mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(__o);
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
			case 0: // deactivateELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateELLink(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult77 = _arg2.value;
_out.write_string( tmpResult77 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllELLinksWithMeOrFd
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder _arg2= new mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder();
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder _arg3= new mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder();
				_out = handler.createReply();
				getAllELLinksWithMeOrFd(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHelper.write(_out,_arg3.value);
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
			case 3: // getServerSNCsAndTLs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getServerSNCsAndTLs(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getConnectingELL
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getConnectingELL(_arg0,_arg1);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllELLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder();
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder _arg2= new mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder();
				_out = handler.createReply();
				getAllELLinks(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // createELLink
			{
			try
			{
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T _arg0=mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createELLink(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult78 = _arg2.value;
_out.write_string( tmpResult78 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getELLinkWithTP
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLinkWithTP(_arg0,_arg1);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
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
			case 9: // getELLinkWithSncOrTl
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLinkWithSncOrTl(_arg0,_arg1);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // decreaseBandwidthOfELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg1=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				short _arg2=_input.read_short();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg3=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg4= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				decreaseBandwidthOfELLink(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // modifyELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_T _arg1=mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg2= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyELLink(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult79 = _arg3.value;
_out.write_string( tmpResult79 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getCapabilities
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
			case 13: // setAdditionalInfo
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
			case 14: // setOwner
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
			case 15: // setELLinkLCASState
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				setELLinkLCASState(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // activateELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateELLink(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult80 = _arg2.value;
_out.write_string( tmpResult80 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getTransmissionParams
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
			case 18: // increaseBandwidthOfELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] _arg2=mtnm.tmforum.org.subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				short _arg3=_input.read_short();
				mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] _arg4=mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg5=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg6= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				increaseBandwidthOfELLink(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg6.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllELLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllELLinkNames(_arg0,_arg1,_arg2);
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
			case 20: // deleteELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteELLink(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getELLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLink(_arg0,_arg1);
				mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
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
