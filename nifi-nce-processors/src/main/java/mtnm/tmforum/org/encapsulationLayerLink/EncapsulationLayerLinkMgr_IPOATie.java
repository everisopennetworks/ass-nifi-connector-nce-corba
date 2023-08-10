package mtnm.tmforum.org.encapsulationLayerLink;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EncapsulationLayerLinkMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class EncapsulationLayerLinkMgr_IPOATie
	extends EncapsulationLayerLinkMgr_IPOA
{
	private EncapsulationLayerLinkMgr_IOperations _delegate;

	private POA _poa;
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I __r = mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_I __r = mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(__o);
		return __r;
	}
	public EncapsulationLayerLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EncapsulationLayerLinkMgr_IOperations delegate)
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
	public void deactivateELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateELLink(ellName,theELL,errorReason);
	}

	public void getAllELLinksWithMeOrFd(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder ells, mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinksWithMeOrFd(meOrFdName,how_many,ells,ellIt);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getServerSNCsAndTLs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder tlList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getServerSNCsAndTLs(ellName,sncList,tlList);
	}

	public void getConnectingELL(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getConnectingELL(tpName,ell);
	}

	public void getAllELLinks(int how_many, mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder ells, mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinks(how_many,ells,ellIt);
	}

	public void createELLink(mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T createData, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createELLink(createData,theELL,errorReason);
	}

	public void getELLinkWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithTP(tpName,ell);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getELLinkWithSncOrTl(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncOrTlName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithSncOrTl(sncOrTlName,ell);
	}

	public void decreaseBandwidthOfELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.decreaseBandwidthOfELLink(ellName,sncNames,numberOfSNCs,additionalModificationInfo,newELL);
	}

	public void modifyELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_T ellModifyData, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyELLink(ellName,ellModifyData,newELL,errorReason);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setELLinkLCASState(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setELLinkLCASState(ellName,enableState);
	}

	public void activateELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateELLink(ellName,theELL,errorReason);
	}

	public void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void increaseBandwidthOfELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, boolean automatic, mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.increaseBandwidthOfELLink(ellName,automatic,additionalSNCs,numberOfSNCs,transmissionParams,additionalModificationInfo,newELL);
	}

	public void getAllELLinkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinkNames(how_many,nameList,nameIt);
	}

	public void deleteELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteELLink(ellName);
	}

	public void getELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getELLink(ellName,ell);
	}

}
