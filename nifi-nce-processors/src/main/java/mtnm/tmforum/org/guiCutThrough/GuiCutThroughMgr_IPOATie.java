package mtnm.tmforum.org.guiCutThrough;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "GuiCutThroughMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class GuiCutThroughMgr_IPOATie
	extends GuiCutThroughMgr_IPOA
{
	private GuiCutThroughMgr_IOperations _delegate;

	private POA _poa;
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_I __r = mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_I __r = mtnm.tmforum.org.guiCutThrough.GuiCutThroughMgr_IHelper.narrow(__o);
		return __r;
	}
	public GuiCutThroughMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuiCutThroughMgr_IOperations delegate)
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
	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getGCTProfileInfo(mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getGCTProfileInfo(gctProfileInfo);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void launchGCT(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalOutputInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.launchGCT(objectName,gctContext,userInfo,displayAddress,additionalInputInfo,closingEnabled,additionalOutputInfo);
	}

	public void destroyGCT(java.lang.String displayAddress) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroyGCT(displayAddress);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

}
