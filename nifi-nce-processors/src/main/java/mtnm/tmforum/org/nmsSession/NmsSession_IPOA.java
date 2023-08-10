package mtnm.tmforum.org.nmsSession;


/**
 * Generated from IDL interface "NmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NmsSession_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.nmsSession.NmsSession_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_associatedSession", Integer.valueOf(0));
		m_opsHash.put ( "eventLossOccurred", Integer.valueOf(1));
		m_opsHash.put ( "ping", Integer.valueOf(2));
		m_opsHash.put ( "eventLossCleared", Integer.valueOf(3));
		m_opsHash.put ( "endSession", Integer.valueOf(4));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/nmsSession/NmsSession_I:1.0","IDL:mtnm.tmforum.org/session/Session_I:1.0"};
	public mtnm.tmforum.org.nmsSession.NmsSession_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.nmsSession.NmsSession_I __r = mtnm.tmforum.org.nmsSession.NmsSession_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.nmsSession.NmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.nmsSession.NmsSession_I __r = mtnm.tmforum.org.nmsSession.NmsSession_IHelper.narrow(__o);
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
			case 1: // eventLossOccurred
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				eventLossOccurred(_arg0,_arg1);
				break;
			}
			case 2: // ping
			{
				_out = handler.createReply();
				ping();
				break;
			}
			case 3: // eventLossCleared
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				eventLossCleared(_arg0);
				break;
			}
			case 4: // endSession
			{
				_out = handler.createReply();
				endSession();
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
