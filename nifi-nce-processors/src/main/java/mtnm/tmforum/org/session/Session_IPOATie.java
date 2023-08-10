package mtnm.tmforum.org.session;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Session_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class Session_IPOATie
	extends Session_IPOA
{
	private Session_IOperations _delegate;

	private POA _poa;
	public Session_IPOATie(Session_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Session_IPOATie(Session_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.session.Session_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.session.Session_I __r = mtnm.tmforum.org.session.Session_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.session.Session_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.session.Session_I __r = mtnm.tmforum.org.session.Session_IHelper.narrow(__o);
		return __r;
	}
	public Session_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Session_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public mtnm.tmforum.org.session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void ping()
	{
_delegate.ping();
	}

	public void endSession()
	{
_delegate.endSession();
	}

}
