package mtnm.tmforum.org.TopoManagementManager;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TopoMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TopoMgr_IPOATie
	extends TopoMgr_IPOA
{
	private TopoMgr_IOperations _delegate;

	private POA _poa;
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.TopoManagementManager.TopoMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.TopoManagementManager.TopoMgr_I __r = mtnm.tmforum.org.TopoManagementManager.TopoMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.TopoManagementManager.TopoMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.TopoManagementManager.TopoMgr_I __r = mtnm.tmforum.org.TopoManagementManager.TopoMgr_IHelper.narrow(__o);
		return __r;
	}
	public TopoMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopoMgr_IOperations delegate)
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
	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllClockSourceViewlTopologicalLinks(int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllClockSourceViewlTopologicalLinks(how_many,topoList,topoIt);
	}

	public void getTopoSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getViewInfoByTopoSubnetwork(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoSubnetwork, int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getViewInfoByTopoSubnetwork(topoSubnetwork,how_many,nodeList,NodeIt);
	}

	public void getProtectSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getProtectSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void getClockSourceSubnetworkViewInfo(int how_many, mtnm.tmforum.org.TopoManagementManager.NodeList_THolder nodeList, mtnm.tmforum.org.TopoManagementManager.NodeIterator_IHolder NodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getClockSourceSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

}
