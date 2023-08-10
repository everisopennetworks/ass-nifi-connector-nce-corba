package mtnm.tmforum.org.terminationPoint;


/**
 * Generated from IDL interface "TerminationPointIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TerminationPointIterator_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getLength", Integer.valueOf(0));
		m_opsHash.put ( "destroy", Integer.valueOf(1));
		m_opsHash.put ( "next_n", Integer.valueOf(2));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/terminationPoint/TerminationPointIterator_I:1.0"};
	public mtnm.tmforum.org.terminationPoint.TerminationPointIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.terminationPoint.TerminationPointIterator_I __r = mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.terminationPoint.TerminationPointIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.terminationPoint.TerminationPointIterator_I __r = mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.narrow(__o);
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
			case 0: // getLength
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(getLength());
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // destroy
			{
			try
			{
				_out = handler.createReply();
				destroy();
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // next_n
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder _arg1= new mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				_out.write_boolean(next_n(_arg0,_arg1));
				mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
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
