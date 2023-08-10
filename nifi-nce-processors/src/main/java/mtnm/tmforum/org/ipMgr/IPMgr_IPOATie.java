package mtnm.tmforum.org.ipMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "IPMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class IPMgr_IPOATie
	extends IPMgr_IPOA
{
	private IPMgr_IOperations _delegate;

	private POA _poa;
	public IPMgr_IPOATie(IPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public IPMgr_IPOATie(IPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.ipMgr.IPMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.ipMgr.IPMgr_I __r = mtnm.tmforum.org.ipMgr.IPMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.ipMgr.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.ipMgr.IPMgr_I __r = mtnm.tmforum.org.ipMgr.IPMgr_IHelper.narrow(__o);
		return __r;
	}
	public IPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPMgr_IOperations delegate)
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
	public void getFDFrVRFs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, int how_many, mtnm.tmforum.org.ipMgr.VRFList_THolder vrfList, mtnm.tmforum.org.ipMgr.VRFIterator_IHolder vrfIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrVRFs(fdfrName,how_many,vrfList,vrfIt);
	}

	public void getAllStaticRoutings(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.StaticRoutingList_THolder srList, mtnm.tmforum.org.ipMgr.StaticRoutingIterator_IHolder srIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllStaticRoutings(managedElementName,how_many,srList,srIt);
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

	public void getAllFRRs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.FRRList_THolder frrList, mtnm.tmforum.org.ipMgr.FRRIterator_IHolder frrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFRRs(managedElementName,how_many,frrList,frrIt);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllBridges(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.BridgeList_THolder bridgeList, mtnm.tmforum.org.ipMgr.BridgeIterator_IHolder bridgeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllBridges(managedElementName,how_many,bridgeList,bridgeIt);
	}

	public void getAllVRRPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.VRRPList_THolder vrrpList, mtnm.tmforum.org.ipMgr.VRRPIterator_IHolder vrrpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVRRPs(managedElementName,how_many,vrrpList,vrrpIt);
	}

	public void getAllVRFs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, mtnm.tmforum.org.ipMgr.VRFList_THolder vrfList, mtnm.tmforum.org.ipMgr.VRFIterator_IHolder vrfIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllVRFs(managedElementName,how_many,vrfList,vrfIt);
	}

}
