package mtnm.tmforum.org.trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TrailNtwProtMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TrailNtwProtMgr_IPOATie
	extends TrailNtwProtMgr_IPOA
{
	private TrailNtwProtMgr_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_I __r = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(__o);
		return __r;
	}
	public TrailNtwProtMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtMgr_IOperations delegate)
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

	public void getTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder _trailNtwProtection) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrailNtwProtection(tnpName,_trailNtwProtection);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void modifyTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T tnpModifyData, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder modifiedTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyTrailNtwProtection(tnpName,tnpModifyData,modifiedTNP,errorReason);
	}

	public void performTrailNtwProtectionCommand(mtnm.tmforum.org.protection.ProtectionCommand_T protectionCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performTrailNtwProtectionCommand(protectionCommand,tnpName,protectionGroupAName,protectionGroupZName,workerTrailList,protectionTrail);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void createTrailNtwProtection(mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T tnpCreateData, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder theTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createTrailNtwProtection(tnpCreateData,theTNP,errorReason);
	}

	public void getAllTrailNtwProtections(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName, int how_many, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionList_THolder tnpList, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtectionIterator_IHolder tnpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrailNtwProtections(resourceName,how_many,tnpList,tnpIt);
	}

	public void deleteTrailNtwProtection(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpName, boolean keepPGs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] swapTPname, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo, mtnm.tmforum.org.protection.ProtectionGroupList_THolder deletedPGList, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtection_THolder deletedTNP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrailNtwProtection(tnpName,keepPGs,swapTPname,additionalInfo,deletedPGList,deletedTNP,errorReason);
	}

}
