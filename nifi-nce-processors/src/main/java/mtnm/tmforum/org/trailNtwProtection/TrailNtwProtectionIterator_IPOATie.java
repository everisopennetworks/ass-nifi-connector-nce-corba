package mtnm.tmforum.org.trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TrailNtwProtectionIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TrailNtwProtectionIterator_IPOATie
	extends TrailNtwProtectionIterator_IPOA
{
	private TrailNtwProtectionIterator_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(__o);
		return __r;
	}
	public TrailNtwProtectionIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtectionIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tnpList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
