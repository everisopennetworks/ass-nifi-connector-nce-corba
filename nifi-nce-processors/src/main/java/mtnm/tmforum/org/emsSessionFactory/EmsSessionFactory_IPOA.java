package mtnm.tmforum.org.emsSessionFactory;


/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EmsSessionFactory_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getVersion", Integer.valueOf(0));
		m_opsHash.put ( "getEmsSession", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSessionFactory/EmsSessionFactory_I:1.0","IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0"};
	public mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_I __r = mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_I __r = mtnm.tmforum.org.emsSessionFactory.EmsSessionFactory_IHelper.narrow(__o);
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
			case 0: // getVersion
			{
				_out = handler.createReply();
				java.lang.String tmpResult63 = getVersion();
_out.write_string( tmpResult63 );
				break;
			}
			case 1: // getEmsSession
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.nmsSession.NmsSession_I _arg2=mtnm.tmforum.org.nmsSession.NmsSession_IHelper.read(_input);
				mtnm.tmforum.org.emsSession.EmsSession_IHolder _arg3= new mtnm.tmforum.org.emsSession.EmsSession_IHolder();
				_out = handler.createReply();
				getEmsSession(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.emsSession.EmsSession_IHelper.write(_out,_arg3.value);
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
