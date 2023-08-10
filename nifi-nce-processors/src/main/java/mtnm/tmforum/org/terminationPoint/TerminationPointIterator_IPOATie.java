package mtnm.tmforum.org.terminationPoint;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TerminationPointIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TerminationPointIterator_IPOATie
	extends TerminationPointIterator_IPOA
{
	private TerminationPointIterator_IOperations _delegate;

	private POA _poa;
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TerminationPointIterator_IPOATie(TerminationPointIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public TerminationPointIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TerminationPointIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tpList);
	}

}
