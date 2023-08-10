package mtnm.tmforum.org.circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "NodeIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class NodeIterator_IPOATie
	extends NodeIterator_IPOA
{
	private NodeIterator_IOperations _delegate;

	private POA _poa;
	public NodeIterator_IPOATie(NodeIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public NodeIterator_IPOATie(NodeIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.circuitCutMgr.NodeIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.circuitCutMgr.NodeIterator_I __r = mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.circuitCutMgr.NodeIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.circuitCutMgr.NodeIterator_I __r = mtnm.tmforum.org.circuitCutMgr.NodeIterator_IHelper.narrow(__o);
		return __r;
	}
	public NodeIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NodeIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.circuitCutMgr.NodeList_THolder nodeList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
		return _delegate.next_n(how_many,nodeList);
	}

	public void destroy() throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException
	{
_delegate.destroy();
	}

}
