package mtnm.tmforum.org.emsSessionFactory;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class EmsSessionFactory_IPOATie
	extends EmsSessionFactory_IPOA
{
	private EmsSessionFactory_IOperations _delegate;

	private POA _poa;
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public EmsSessionFactory_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSessionFactory_IOperations delegate)
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
	public java.lang.String getVersion()
	{
		return _delegate.getVersion();
	}

	public void getEmsSession(java.lang.String user, java.lang.String password, mtnm.tmforum.org.nmsSession.NmsSession_I client, mtnm.tmforum.org.emsSession.EmsSession_IHolder emsSessionInterface) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEmsSession(user,password,client,emsSessionInterface);
	}

}
