package mtnm.huawei.com.HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "IPCrossConnectionIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class IPCrossConnectionIterator_IPOATie
	extends IPCrossConnectionIterator_IPOA
{
	private IPCrossConnectionIterator_IOperations _delegate;

	private POA _poa;
	public IPCrossConnectionIterator_IPOATie(IPCrossConnectionIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public IPCrossConnectionIterator_IPOATie(IPCrossConnectionIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_I __r = mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_I __r = mtnm.huawei.com.HW_vpnManager.IPCrossConnectionIterator_IHelper.narrow(__o);
		return __r;
	}
	public IPCrossConnectionIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPCrossConnectionIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.huawei.com.HW_vpnManager.IPCrossConnectionList_THolder ipCCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ipCCList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
