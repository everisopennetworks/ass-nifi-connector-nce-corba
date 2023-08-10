package mtnm.tmforum.org.maintenanceOps;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_MaintenanceDomainIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_MaintenanceDomainIterator_IPOATie
	extends HW_MaintenanceDomainIterator_IPOA
{
	private HW_MaintenanceDomainIterator_IOperations _delegate;

	private POA _poa;
	public HW_MaintenanceDomainIterator_IPOATie(HW_MaintenanceDomainIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MaintenanceDomainIterator_IPOATie(HW_MaintenanceDomainIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_I __r = mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_I __r = mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHelper.narrow(__o);
		return __r;
	}
	public HW_MaintenanceDomainIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MaintenanceDomainIterator_IOperations delegate)
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

	public boolean next_n(int how_many, mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THolder mdList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mdList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
