package mtnm.tmforum.org.flowDomainFragment_TI;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "MFDFrIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class MFDFrIterator_IPOATie
	extends MFDFrIterator_IPOA
{
	private MFDFrIterator_IOperations _delegate;

	private POA _poa;
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_I __r = mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_I __r = mtnm.tmforum.org.flowDomainFragment_TI.MFDFrIterator_IHelper.narrow(__o);
		return __r;
	}
	public MFDFrIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MFDFrIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THolder mfdfrList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdfrList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
