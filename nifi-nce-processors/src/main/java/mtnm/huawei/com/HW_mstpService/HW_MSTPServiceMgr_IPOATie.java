package mtnm.huawei.com.HW_mstpService;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "HW_MSTPServiceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class HW_MSTPServiceMgr_IPOATie
	extends HW_MSTPServiceMgr_IPOA
{
	private HW_MSTPServiceMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I __r = mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_I __r = mtnm.huawei.com.HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(__o);
		return __r;
	}
	public HW_MSTPServiceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPServiceMgr_IOperations delegate)
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
	public void deleteEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteEthService(serviceName);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void createEthService(mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T createData, mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createEthService(createData,ethServiceList);
	}

	public void getAllAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, mtnm.huawei.com.HW_mstpService.HW_AtmServiceList_THolder serviceList, mtnm.huawei.com.HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmService(meName,typeList,how_many,serviceList,serviceIt);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void deleteAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteAtmService(serviceName);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createAtmService(mtnm.huawei.com.HW_mstpService.HW_AtmServiceCreateData_T createData, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createAtmService(createData,atmService);
	}

	public void activateAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateAtmService(serviceName,atmService);
	}

	public void getAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAtmService(serviceName,atmService);
	}

	public void getEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_EthService_THolder ethService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEthService(serviceName,ethService);
	}

	public void deactivateAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAtmService(serviceName,atmService);
	}

	public void getAllEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder serviceList, mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEthService(meName,typeList,how_many,serviceList,serviceIt);
	}

}
