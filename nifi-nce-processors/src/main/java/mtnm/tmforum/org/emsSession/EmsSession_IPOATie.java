package mtnm.tmforum.org.emsSession;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class EmsSession_IPOATie
	extends EmsSession_IPOA
{
	private EmsSession_IOperations _delegate;

	private POA _poa;
	public EmsSession_IPOATie(EmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSession_IPOATie(EmsSession_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public EmsSession_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSession_IOperations delegate)
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

	public void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder event) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEventChannel(event);
	}

	public void getSupportedManagers(mtnm.tmforum.org.emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSupportedManagers(supportedManagerList);
	}

	public void endSession()
	{
_delegate.endSession();
	}

	public void getManager(java.lang.String managerName, mtnm.tmforum.org.common.Common_IHolder managerInterface) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getManager(managerName,managerInterface);
	}

}
