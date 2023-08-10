package mtnm.huawei.com.HW_mstpService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_EthServiceIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_EthServiceIterator_IPOATie
	extends HW_EthServiceIterator_IPOA
{
	private HW_EthServiceIterator_IOperations _delegate;

	private POA _poa;
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_I __r = mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_I __r = mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHelper.narrow(__o);
		return __r;
	}
	public HW_EthServiceIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_EthServiceIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder serviceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,serviceList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
