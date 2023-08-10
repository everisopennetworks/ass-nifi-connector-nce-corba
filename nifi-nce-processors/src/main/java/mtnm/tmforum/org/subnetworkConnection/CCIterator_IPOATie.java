package mtnm.tmforum.org.subnetworkConnection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class CCIterator_IPOATie
	extends CCIterator_IPOA
{
	private CCIterator_IOperations _delegate;

	private POA _poa;
	public CCIterator_IPOATie(CCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CCIterator_IPOATie(CCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.subnetworkConnection.CCIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.subnetworkConnection.CCIterator_I __r = mtnm.tmforum.org.subnetworkConnection.CCIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.subnetworkConnection.CCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.subnetworkConnection.CCIterator_I __r = mtnm.tmforum.org.subnetworkConnection.CCIterator_IHelper.narrow(__o);
		return __r;
	}
	public CCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CCIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THolder ccList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ccList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
