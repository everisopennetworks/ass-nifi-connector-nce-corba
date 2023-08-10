package mtnm.huawei.com.HW_controlPlane;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_controlPlaneMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_controlPlaneMgr_IPOATie
	extends HW_controlPlaneMgr_IPOA
{
	private HW_controlPlaneMgr_IOperations _delegate;

	private POA _poa;
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_I __r = mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_I __r = mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_controlPlaneMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_controlPlaneMgr_IOperations delegate)
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

	public void getAllSnppLinks(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, mtnm.huawei.com.HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, mtnm.huawei.com.HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppLinks(routingAreaName,how_many,snppLinkList,snppLinkIt);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllRoutingAreaNames(mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingAreaNames(nameList);
	}

	public void getMENameByNodeID(java.lang.String nodeID, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMENameByNodeID(nodeID,meOrHolderNameList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllRoutingNodeNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nodeNameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingNodeNames(routingAreaName,how_many,nodeNameList,nodeIt);
	}

	public void getAllSnppNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppNames(routingNodeName,how_many,nameList,nameIt);
	}

	public void getAllContainedSnpNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] snppName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedSnpNames(snppName,how_many,nameList,nameIt);
	}

	public void getNodeIDByMEName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, mtnm.huawei.com.HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getNodeIDByMEName(meOrHolderName,nodeID);
	}

	public void setSRLG(int srlgID, boolean addOrRemove, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder snppLinkNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setSRLG(srlgID,addOrRemove,snppLinkNameList);
	}

	public void getSnppLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] snppLinkName, mtnm.huawei.com.HW_controlPlane.HW_SnppLink_THolder snppLink) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getSnppLink(snppLinkName,snppLink);
	}

}
