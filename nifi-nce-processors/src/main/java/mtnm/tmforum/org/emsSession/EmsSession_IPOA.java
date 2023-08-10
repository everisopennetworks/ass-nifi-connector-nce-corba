package mtnm.tmforum.org.emsSession;


/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EmsSession_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.emsSession.EmsSession_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_associatedSession", Integer.valueOf(0));
		m_opsHash.put ( "ping", Integer.valueOf(1));
		m_opsHash.put ( "getEventChannel", Integer.valueOf(2));
		m_opsHash.put ( "getSupportedManagers", Integer.valueOf(3));
		m_opsHash.put ( "endSession", Integer.valueOf(4));
		m_opsHash.put ( "getManager", Integer.valueOf(5));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSession/EmsSession_I:1.0","IDL:mtnm.tmforum.org/session/Session_I:1.0"};
	public mtnm.tmforum.org.emsSession.EmsSession_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.emsSession.EmsSession_I __r = mtnm.tmforum.org.emsSession.EmsSession_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.emsSession.EmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.emsSession.EmsSession_I __r = mtnm.tmforum.org.emsSession.EmsSession_IHelper.narrow(__o);
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
			case 0: // _get_associatedSession
			{
			_out = handler.createReply();
			mtnm.tmforum.org.session.Session_IHelper.write(_out,associatedSession());
				break;
			}
			case 1: // ping
			{
				_out = handler.createReply();
				ping();
				break;
			}
			case 2: // getEventChannel
			{
			try
			{
				org.omg.CosNotifyChannelAdmin.EventChannelHolder _arg0= new org.omg.CosNotifyChannelAdmin.EventChannelHolder();
				_out = handler.createReply();
				getEventChannel(_arg0);
				org.omg.CosNotifyChannelAdmin.EventChannelHelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getSupportedManagers
			{
			try
			{
				mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THolder _arg0= new mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THolder();
				_out = handler.createReply();
				getSupportedManagers(_arg0);
				mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // endSession
			{
				_out = handler.createReply();
				endSession();
				break;
			}
			case 5: // getManager
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.common.Common_IHolder _arg1= new mtnm.tmforum.org.common.Common_IHolder();
				_out = handler.createReply();
				getManager(_arg0,_arg1);
				mtnm.tmforum.org.common.Common_IHelper.write(_out,_arg1.value);
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
