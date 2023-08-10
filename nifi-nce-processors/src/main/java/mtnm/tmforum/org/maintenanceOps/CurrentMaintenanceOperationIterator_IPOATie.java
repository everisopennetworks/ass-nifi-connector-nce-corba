package mtnm.tmforum.org.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CurrentMaintenanceOperationIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class CurrentMaintenanceOperationIterator_IPOATie
	extends CurrentMaintenanceOperationIterator_IPOA
{
	private CurrentMaintenanceOperationIterator_IOperations _delegate;

	private POA _poa;
	public CurrentMaintenanceOperationIterator_IPOATie(CurrentMaintenanceOperationIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CurrentMaintenanceOperationIterator_IPOATie(CurrentMaintenanceOperationIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_I __r = mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_I __r = mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.narrow(__o);
		return __r;
	}
	public CurrentMaintenanceOperationIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CurrentMaintenanceOperationIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,cMOList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
