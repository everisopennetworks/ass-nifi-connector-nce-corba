package mtnm.tmforum.org.protection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "ProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class ProtectionMgr_IPOATie
	extends ProtectionMgr_IPOA
{
	private ProtectionMgr_IOperations _delegate;

	private POA _poa;
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.protection.ProtectionMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.protection.ProtectionMgr_I __r = mtnm.tmforum.org.protection.ProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.protection.ProtectionMgr_I __r = mtnm.tmforum.org.protection.ProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public ProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionMgr_IOperations delegate)
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
	public void getAdjacentTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAdjacentTPs(tpName,tpNameList);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void performWDMProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fromTp, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] toTp, mtnm.tmforum.org.protection.WDMSwitchData_THolder wSwitchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performWDMProtectionCommand(protectionCommand,wpgpName,fromTp,toTp,wSwitchData);
	}

	public void getIPProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.IPProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getIPProtectionGroup(pgName,protectionGroup);
	}

	public void HW_getXPICGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] xpicGroupName, mtnm.tmforum.org.protection.HW_XPICGroup_THolder xpicGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getXPICGroup(xpicGroupName,xpicGroup);
	}

	public void retrieveIFSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.IFSwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveIFSwitchData(pgName,switchData);
	}

	public void getEProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPname, mtnm.tmforum.org.protection.EProtectionGroup_THolder eProtectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEProtectionGroup(ePGPname,eProtectionGroup);
	}

	public void getWDMProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.protection.WDMProtectionGroup_THolder wProtectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getWDMProtectionGroup(wpgpName,wProtectionGroup);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.protection.ProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setProtectionGroup(pgName,paraList,protectionGroup);
	}

	public void getAllNUTTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
	}

	public void HW_getAllXPICGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.HW_XPICGroupList_THolder xpicList, mtnm.tmforum.org.protection.HW_XPICGroupIterator_IHolder xpicIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllXPICGroups(meName,how_many,xpicList,xpicIt);
	}

	public void getAllEProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.EProtectionGroupList_THolder epgpList, mtnm.tmforum.org.protection.EProtectionGroupIterator_IHolder epgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void retrieveSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.protection.SwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void retrieveWDMSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wpgpName, mtnm.tmforum.org.protection.WDMSwitchDataList_THolder wSwitchDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveWDMSwitchData(wpgpName,wSwitchDataList);
	}

	public void performProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fromTp, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] toTp, mtnm.tmforum.org.protection.SwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void getAllProtectionSubnetworks(int how_many, mtnm.tmforum.org.protection.ProtectionSubnetworkList_THolder psnList, mtnm.tmforum.org.protection.ProtectionSubnetworkIterator_IHolder psnIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionSubnetworks(how_many,psnList,psnIt);
	}

	public void retrieveIPSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, mtnm.tmforum.org.protection.IPSwitchDataList_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveIPSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllPreemptibleTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void HW_getERPSProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getERPSProtectionGroup(pgName,protectionGroup);
	}

	public void createProtectionGroup(mtnm.tmforum.org.protection.PGPCreateData_T pgpCreateData, mtnm.tmforum.org.protection.ProtectionGroup_THolder thePGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createProtectionGroup(pgpCreateData,thePGP);
	}

	public void getAllProtectedTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
	}

	public void modifyProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpName, mtnm.tmforum.org.protection.PGPModifyData_T pgpModifyData, mtnm.tmforum.org.protection.ProtectionGroup_THolder modifiedPGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyProtectionGroup(pgpName,pgpModifyData,modifiedPGP);
	}

	public void deleteProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] swapTPName, mtnm.tmforum.org.protection.ProtectionGroup_THolder deletedPGP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteProtectionGroup(pgpName,swapTPName,deletedPGP);
	}

	public void HW_getIFProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.HW_IFProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getIFProtectionGroup(pgName,protectionGroup);
	}

	public void getAllIPProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.IPProtectionGroupList_THolder pgList, mtnm.tmforum.org.protection.IPProtectionGroupIterator_IHolder pgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void retrieveESwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPName, mtnm.tmforum.org.protection.ESwitchDataList_THolder eSwitchDataList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveESwitchData(ePGPName,eSwitchDataList);
	}

	public void HW_getAllIFProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THolder pgList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllIFProtectionGroups(meName,pgList);
	}

	public void getProtectionGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.tmforum.org.protection.ProtectionGroup_THolder protectionGroup) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getProtectionGroup(pgName,protectionGroup);
	}

	public void HW_getAllERPSProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.protection.HW_ERPSProtectionGroupList_THolder pgList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllERPSProtectionGroups(meName,pgList);
	}

	public void getAllWDMProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.WDMProtectionGroupList_THolder wpgpList, mtnm.tmforum.org.protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllWDMProtectionGroups(meName,how_many,wpgpList,wpgpIt);
	}

	public void getAllProtectionGroups(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.protection.ProtectionGroupList_THolder pgList, mtnm.tmforum.org.protection.ProtectionGroupIterator_IHolder pgpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
	}

}
