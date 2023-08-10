package mtnm.tmforum.org.trailNtwProtection;


/**
 * Generated from IDL interface "TrailNtwProtMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TrailNtwProtMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "setUserLabel", Integer.valueOf(0));
		m_opsHash.put ( "getTrailNtwProtection", Integer.valueOf(1));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(2));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(3));
		m_opsHash.put ( "modifyTrailNtwProtection", Integer.valueOf(4));
		m_opsHash.put ( "performTrailNtwProtectionCommand", Integer.valueOf(5));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(6));
		m_opsHash.put ( "setOwner", Integer.valueOf(7));
		m_opsHash.put ( "createTrailNtwProtection", Integer.valueOf(8));
		m_opsHash.put ( "getAllTrailNtwProtections", Integer.valueOf(9));
		m_opsHash.put ( "deleteTrailNtwProtection", Integer.valueOf(10));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(__o);
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
			case 0: // setUserLabel
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
			case 1: // getTrailNtwProtection
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _arg1= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder();
				_out = handler.createReply();
				getTrailNtwProtection(_arg0,_arg1);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg1.value);
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
			case 3: // getCapabilities
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
			case 4: // modifyTrailNtwProtection
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T _arg1=mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.read(_input);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _arg2= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTrailNtwProtection(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg2.value);
				java.lang.String tmpResult734 = _arg3.value;
_out.write_string( tmpResult734 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // performTrailNtwProtectionCommand
			{
			try
			{
				mtnm.tmforum.org.protection.ProtectionCommand_T _arg0=mtnm.tmforum.org.protection.ProtectionCommand_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg1=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg3=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] _arg4=mtnm.tmforum.org.globaldefs.NamingAttributesMultipleList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg5=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				performTrailNtwProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 8: // createTrailNtwProtection
			{
			try
			{
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T _arg0=mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_THelper.read(_input);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _arg1= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createTrailNtwProtection(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult735 = _arg2.value;
_out.write_string( tmpResult735 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllTrailNtwProtections
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THolder _arg2= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THolder();
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHolder _arg3= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHolder();
				_out = handler.createReply();
				getAllTrailNtwProtections(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // deleteTrailNtwProtection
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg3= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				mtnm.tmforum.org.protection.ProtectionGroupList_THolder _arg4= new mtnm.tmforum.org.protection.ProtectionGroupList_THolder();
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _arg5= new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteTrailNtwProtection(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.protection.ProtectionGroupList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg5.value);
				java.lang.String tmpResult736 = _arg6.value;
_out.write_string( tmpResult736 );
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
