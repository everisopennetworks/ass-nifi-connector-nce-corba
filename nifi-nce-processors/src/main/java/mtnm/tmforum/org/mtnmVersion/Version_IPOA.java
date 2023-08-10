package mtnm.tmforum.org.mtnmVersion;


/**
 * Generated from IDL interface "Version_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Version_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.mtnmVersion.Version_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getVersion", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0"};
	public mtnm.tmforum.org.mtnmVersion.Version_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.mtnmVersion.Version_I __r = mtnm.tmforum.org.mtnmVersion.Version_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.mtnmVersion.Version_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.mtnmVersion.Version_I __r = mtnm.tmforum.org.mtnmVersion.Version_IHelper.narrow(__o);
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
				java.lang.String tmpResult506 = getVersion();
_out.write_string( tmpResult506 );
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
