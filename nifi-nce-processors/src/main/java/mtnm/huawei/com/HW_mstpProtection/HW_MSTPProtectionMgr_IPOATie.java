package mtnm.huawei.com.HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_MSTPProtectionMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_MSTPProtectionMgr_IPOATie
	extends HW_MSTPProtectionMgr_IPOA
{
	private HW_MSTPProtectionMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I __r = mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_I __r = mtnm.huawei.com.HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_MSTPProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPProtectionMgr_IOperations delegate)
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
	public void retrieveRPRSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveRPRSwitchData(nodeName,switchData);
	}

	public void getAllRPRLinkInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRLinkInfo(meName,how_many,linkList,rprLinkIt);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void modifyRPRNodePara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprNodeParameters, mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder node) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyRPRNodePara(nodeName,rprNodeParameters,node);
	}

	public void retrieveAtmPGSwitchData(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.retrieveAtmPGSwitchData(atmpgName,switchData);
	}

	public void performRPRProtectionCommand(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_T switchPosition, mtnm.huawei.com.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performRPRProtectionCommand(nodeName,protectionCommand,switchPosition,switchData);
	}

	public void getAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAtmProtectGroup(atmpgName,atmPG);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void modifyRPRLinkPara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprLinkParameters, mtnm.huawei.com.HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyRPRLinkPara(nodeName,rprLinkParameters,linkInfo);
	}

	public void getRPRNode(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRNode_THolder node) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRPRNode(nodeName,node);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmProtectGroup(meName,how_many,atmPGList,pgIt);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getRPRTopoPara(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getRPRTopoPara(nodeName,topoInfo);
	}

	public void modifyAtmProtectGroup(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmPgName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmPGParameters, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyAtmProtectGroup(atmPgName,atmPGParameters,atmPG);
	}

	public void getAllRPRNode(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeList_THolder nodeList, mtnm.huawei.com.HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRNode(meName,how_many,nodeList,nodeIt);
	}

	public void performAtmPGProtectionCommand(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] atmpgName, mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performAtmPGProtectionCommand(atmpgName,protectionCommand,switchAction,switchDirect,switchData);
	}

}
