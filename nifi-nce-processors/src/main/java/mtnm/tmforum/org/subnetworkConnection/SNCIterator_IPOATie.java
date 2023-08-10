package mtnm.tmforum.org.subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "SNCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class SNCIterator_IPOATie
	extends SNCIterator_IPOA
{
	private SNCIterator_IOperations _delegate;

	private POA _poa;
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public SNCIterator_IPOATie(SNCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.subnetworkConnection.SNCIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.subnetworkConnection.SNCIterator_I __r = mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.subnetworkConnection.SNCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.subnetworkConnection.SNCIterator_I __r = mtnm.tmforum.org.subnetworkConnection.SNCIterator_IHelper.narrow(__o);
		return __r;
	}
	public SNCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SNCIterator_IOperations delegate)
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
	public int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,sncList);
	}

}
