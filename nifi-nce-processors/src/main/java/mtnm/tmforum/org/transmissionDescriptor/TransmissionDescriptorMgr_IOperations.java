package mtnm.tmforum.org.transmissionDescriptor;


/**
 * Generated from IDL interface "TransmissionDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface TransmissionDescriptorMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTransmissionDescriptors(int how_many, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTransmissionDescriptorNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAssociatedTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createTransmissionDescriptor(mtnm.tmforum.org.transmissionDescriptor.TMDCreateData_T newTMDCreateData, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyTransmissionDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TMDModifyData_T tmdModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedMEList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToObject(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalTPInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setTMDAssociation(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdName, mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
