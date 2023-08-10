package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL interface "FlowDomainMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface FlowDomainMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllFlowDomains(int how_many, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains, mtnm.tmforum.org.flowDomain.FDIterator_IHolder fdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllFlowDomainNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFlowDomainsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDfromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createFlowDomain(mtnm.tmforum.org.flowDomain.FDCreateData_T createData, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, mtnm.tmforum.org.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FDModifyData_T fdModifyData, mtnm.tmforum.org.flowDomain.FlowDomain_THolder newFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void associateMFDsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deAssociateMFDsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void associateCPTPsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deAssociateCPTPsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllMFDs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.flowDomain.MFDList_THolder mfds, mtnm.tmforum.org.flowDomain.MFDIterator_IHolder mfdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllMFDNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAssigningMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createMFD(mtnm.tmforum.org.flowDomain.MFDCreateData_T createData, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder theMFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MFDModifyData_T mfdModifyData, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalModificationInfo, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void assignCPTPsToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void unassignCPTPsFromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createFTP(mtnm.tmforum.org.flowDomain.FTPCreateData_T createData, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAssignableCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllFDFrNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFrsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, int how_many, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFrsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrs) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createFDFr(mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder endTPs, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void activateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void addFPsToFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void removeFPsFromFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalTPInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFrServerTrail(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder serverNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEthernetOAMPoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] Fdfrname, mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THolder oamPointList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void performEthernetOAMCommand(mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T operation, mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
