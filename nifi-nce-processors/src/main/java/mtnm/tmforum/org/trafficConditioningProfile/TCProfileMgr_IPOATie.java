package mtnm.tmforum.org.trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TCProfileMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TCProfileMgr_IPOATie
	extends TCProfileMgr_IPOA
{
	private TCProfileMgr_IOperations _delegate;

	private POA _poa;
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileMgr_IPOATie(TCProfileMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I __r = mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_I __r = mtnm.tmforum.org.trafficConditioningProfile.TCProfileMgr_IHelper.narrow(__o);
		return __r;
	}
	public TCProfileMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileMgr_IOperations delegate)
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
	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void HW_createTCProfile(mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T newTCProfileCreateData, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder newTCProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void deleteTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteTCProfile(tcProfileName);
	}

	public void HW_getAllTCProfiles(int how_many, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileIterator_IHolder tcProfileIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

	public void assignTrafficConditioningProfile(mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] resourceList, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder failedResourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.assignTrafficConditioningProfile(resourceList,failedResourceList);
	}

	public void getTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder tcProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfile(tcProfileName,tcProfile);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getTCProfileAssociatedResouces(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder resourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedResouces(tcProfileName,resourceList);
	}

	public void getAllTCProfiles(int how_many, mtnm.tmforum.org.trafficConditioningProfile.TCProfileList_THolder tcProfileList, mtnm.tmforum.org.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTCProfiles(how_many,tcProfileList,tcProfileIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void createTCProfile(mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createTCProfile(newTCProfileCreateData,newTCProfile);
	}

	public void HW_modifyTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfileCreateData_T tcProfileModifyData, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_modifyTCProfile(tcProfileName,tcProfileModifyData,modifiedTCProfile,errorReason);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void HW_getTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.HW_TCProfile_THolder tcProfile) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getTCProfile(tcProfileName,tcProfile);
	}

	public void HW_getAllTCProfileNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTCProfileNames(how_many,nameList,nameIt);
	}

	public void modifyTCProfile(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, mtnm.tmforum.org.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyTCProfile(tcProfileName,tcProfileModifyData,tpsToModify,modifiedTCProfile,errorReason);
	}

	public void deassignTrafficConditioningProfile(mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] resourceList, mtnm.tmforum.org.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder failedResourceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deassignTrafficConditioningProfile(resourceList,failedResourceList);
	}

	public void getTCProfileAssociatedTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTCProfileAssociatedTPs(tcProfileName,how_many,tpList,tpIt);
	}

}
