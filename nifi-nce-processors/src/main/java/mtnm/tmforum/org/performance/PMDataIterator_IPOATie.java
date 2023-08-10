package mtnm.tmforum.org.performance;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "PMDataIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class PMDataIterator_IPOATie
	extends PMDataIterator_IPOA
{
	private PMDataIterator_IOperations _delegate;

	private POA _poa;
	public PMDataIterator_IPOATie(PMDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PMDataIterator_IPOATie(PMDataIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.performance.PMDataIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.performance.PMDataIterator_I __r = mtnm.tmforum.org.performance.PMDataIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.performance.PMDataIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.performance.PMDataIterator_I __r = mtnm.tmforum.org.performance.PMDataIterator_IHelper.narrow(__o);
		return __r;
	}
	public PMDataIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PMDataIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.performance.PMDataList_THolder pmDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pmDataList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
