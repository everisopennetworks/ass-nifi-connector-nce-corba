package mtnm.tmforum.org.ipMgr;


/**
 * Generated from IDL interface "IPMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class IPMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.ipMgr.IPMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getFDFrVRFs", Integer.valueOf(0));
		m_opsHash.put ( "getAllStaticRoutings", Integer.valueOf(1));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(2));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(3));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(4));
		m_opsHash.put ( "getAllFRRs", Integer.valueOf(5));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(6));
		m_opsHash.put ( "setOwner", Integer.valueOf(7));
		m_opsHash.put ( "getAllBridges", Integer.valueOf(8));
		m_opsHash.put ( "getAllVRRPs", Integer.valueOf(9));
		m_opsHash.put ( "getAllVRFs", Integer.valueOf(10));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/ipMgr/IPMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.ipMgr.IPMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.ipMgr.IPMgr_I __r = mtnm.tmforum.org.ipMgr.IPMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.ipMgr.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.ipMgr.IPMgr_I __r = mtnm.tmforum.org.ipMgr.IPMgr_IHelper.narrow(__o);
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
			case 0: // getFDFrVRFs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.VRFList_THolder _arg2= new mtnm.tmforum.org.ipMgr.VRFList_THolder();
				mtnm.tmforum.org.ipMgr.VRFIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.VRFIterator_IHolder();
				_out = handler.createReply();
				getFDFrVRFs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.VRFList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.VRFIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllStaticRoutings
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.StaticRoutingList_THolder _arg2= new mtnm.tmforum.org.ipMgr.StaticRoutingList_THolder();
				mtnm.tmforum.org.ipMgr.StaticRoutingIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.StaticRoutingIterator_IHolder();
				_out = handler.createReply();
				getAllStaticRoutings(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.StaticRoutingList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.StaticRoutingIterator_IHelper.write(_out,_arg3.value);
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
			case 5: // getAllFRRs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.FRRList_THolder _arg2= new mtnm.tmforum.org.ipMgr.FRRList_THolder();
				mtnm.tmforum.org.ipMgr.FRRIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.FRRIterator_IHolder();
				_out = handler.createReply();
				getAllFRRs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.FRRList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.FRRIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setAdditionalInfo
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
			case 8: // getAllBridges
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.BridgeList_THolder _arg2= new mtnm.tmforum.org.ipMgr.BridgeList_THolder();
				mtnm.tmforum.org.ipMgr.BridgeIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.BridgeIterator_IHolder();
				_out = handler.createReply();
				getAllBridges(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.BridgeList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.BridgeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllVRRPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.VRRPList_THolder _arg2= new mtnm.tmforum.org.ipMgr.VRRPList_THolder();
				mtnm.tmforum.org.ipMgr.VRRPIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.VRRPIterator_IHolder();
				_out = handler.createReply();
				getAllVRRPs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.VRRPList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.VRRPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllVRFs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.ipMgr.VRFList_THolder _arg2= new mtnm.tmforum.org.ipMgr.VRFList_THolder();
				mtnm.tmforum.org.ipMgr.VRFIterator_IHolder _arg3= new mtnm.tmforum.org.ipMgr.VRFIterator_IHolder();
				_out = handler.createReply();
				getAllVRFs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.ipMgr.VRFList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.ipMgr.VRFIterator_IHelper.write(_out,_arg3.value);
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
