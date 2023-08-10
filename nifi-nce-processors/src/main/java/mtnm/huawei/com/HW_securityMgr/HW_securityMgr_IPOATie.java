package mtnm.huawei.com.HW_securityMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_securityMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_securityMgr_IPOATie
	extends HW_securityMgr_IPOA
{
	private HW_securityMgr_IOperations _delegate;

	private POA _poa;
	public HW_securityMgr_IPOATie(HW_securityMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_securityMgr_IPOATie(HW_securityMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_securityMgr.HW_securityMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_securityMgr.HW_securityMgr_I __r = mtnm.huawei.com.HW_securityMgr.HW_securityMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_securityMgr.HW_securityMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_securityMgr.HW_securityMgr_I __r = mtnm.huawei.com.HW_securityMgr.HW_securityMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_securityMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_securityMgr_IOperations delegate)
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

	public void modifyPassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyPassword(userName,oldPassword,newPassword);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
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
