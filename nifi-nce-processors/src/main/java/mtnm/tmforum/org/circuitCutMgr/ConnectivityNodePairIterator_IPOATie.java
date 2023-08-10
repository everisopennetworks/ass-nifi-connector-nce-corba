package mtnm.tmforum.org.circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ConnectivityNodePairIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class ConnectivityNodePairIterator_IPOATie
	extends ConnectivityNodePairIterator_IPOA
{
	private ConnectivityNodePairIterator_IOperations _delegate;

	private POA _poa;
	public ConnectivityNodePairIterator_IPOATie(ConnectivityNodePairIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ConnectivityNodePairIterator_IPOATie(ConnectivityNodePairIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_I __r = mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_I __r = mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairIterator_IHelper.narrow(__o);
		return __r;
	}
	public ConnectivityNodePairIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConnectivityNodePairIterator_IOperations delegate)
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
	public int getLength() throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePairList_THolder meList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
		return _delegate.next_n(how_many,meList);
	}

}
