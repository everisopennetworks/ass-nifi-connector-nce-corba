package mtnm.tmforum.org.protection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_XPICGroupIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_XPICGroupIterator_IPOATie
	extends HW_XPICGroupIterator_IPOA
{
	private HW_XPICGroupIterator_IOperations _delegate;

	private POA _poa;
	public HW_XPICGroupIterator_IPOATie(HW_XPICGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_XPICGroupIterator_IPOATie(HW_XPICGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.protection.HW_XPICGroupIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.protection.HW_XPICGroupIterator_I __r = mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.protection.HW_XPICGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.protection.HW_XPICGroupIterator_I __r = mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHelper.narrow(__o);
		return __r;
	}
	public HW_XPICGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_XPICGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.protection.HW_XPICGroupList_THolder xpicGroupList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,xpicGroupList);
	}

}
