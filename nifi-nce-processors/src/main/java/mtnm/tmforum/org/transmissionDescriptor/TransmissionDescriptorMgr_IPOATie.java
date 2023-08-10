package mtnm.tmforum.org.transmissionDescriptor;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TransmissionDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TransmissionDescriptorMgr_IPOATie
	extends TransmissionDescriptorMgr_IPOA
{
	private TransmissionDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I __r = mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_I __r = mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public TransmissionDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionDescriptorMgr_IOperations delegate)
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
	public void createTransmissionDescriptor(mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_T newTMDCreateData, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createTransmissionDescriptor(newTMDCreateData,newTransmissionDescriptor);
	}

	public void deleteTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteTransmissionDescriptor(transmissionDescriptorName);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void validateTMDAssignmentToObject(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalTPInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToObject(objectName,objectAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setTMDAssociation(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setTMDAssociation(tmdName,tPorMFDorFDFr);
	}

	public void getTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionDescriptor(tmdName,tmd);
	}

	public void getAllTransmissionDescriptors(int how_many, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptors(how_many,transmissionDescList,transmissionDescIt);
	}

	public void getAllTransmissionDescriptorNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptorNames(how_many,nameList,nameIt);
	}

	public void modifyTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_T tmdModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedMEList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyTransmissionDescriptor(tmdName,tmdModifyData,tpsToModify,modifiedTransmissionDescriptor,failedMEList,failedTPsMFDsList,errorReason);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAssociatedTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTPs(transmissionDescriptorName,how_many,tpList,tpIt);
	}

}
