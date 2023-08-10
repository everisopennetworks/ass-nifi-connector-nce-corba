package mtnm.huawei.com.HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_RPRNodeIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_RPRNodeIterator_IPOATie
	extends HW_RPRNodeIterator_IPOA
{
	private HW_RPRNodeIterator_IOperations _delegate;

	private POA _poa;
	public HW_RPRNodeIterator_IPOATie(HW_RPRNodeIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_RPRNodeIterator_IPOATie(HW_RPRNodeIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_I __r = mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_I __r = mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHelper.narrow(__o);
		return __r;
	}
	public HW_RPRNodeIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_RPRNodeIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THolder rprNodeList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,rprNodeList);
	}

}
