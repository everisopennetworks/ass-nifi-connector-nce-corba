package mtnm.tmforum.org.multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_ConjunctionSNCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_ConjunctionSNCIterator_IPOATie
	extends HW_ConjunctionSNCIterator_IPOA
{
	private HW_ConjunctionSNCIterator_IOperations _delegate;

	private POA _poa;
	public HW_ConjunctionSNCIterator_IPOATie(HW_ConjunctionSNCIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_ConjunctionSNCIterator_IPOATie(HW_ConjunctionSNCIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_I __r = mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_I __r = mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHelper.narrow(__o);
		return __r;
	}
	public HW_ConjunctionSNCIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_ConjunctionSNCIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder conjunctionSNCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,conjunctionSNCList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
