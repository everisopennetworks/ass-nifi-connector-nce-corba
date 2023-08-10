package mtnm.tmforum.org.flowDomain_TI;


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
	void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment_TI.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment_TI.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createAndActivateFDFr(mtnm.tmforum.org.flowDomainFragment_TI.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder theFDFr, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateAndDeleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_TI.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createFTP(mtnm.tmforum.org.flowDomain_TI.FTPCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
