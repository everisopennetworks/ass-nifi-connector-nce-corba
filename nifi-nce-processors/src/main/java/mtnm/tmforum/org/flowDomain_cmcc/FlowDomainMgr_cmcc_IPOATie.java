package mtnm.tmforum.org.flowDomain_cmcc;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "FlowDomainMgr_cmcc_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class FlowDomainMgr_cmcc_IPOATie
	extends FlowDomainMgr_cmcc_IPOA
{
	private FlowDomainMgr_cmcc_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_cmcc_IPOATie(FlowDomainMgr_cmcc_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_cmcc_IPOATie(FlowDomainMgr_cmcc_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I __r = mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_I __r = mtnm.tmforum.org.flowDomain_cmcc.FlowDomainMgr_cmcc_IHelper.narrow(__o);
		return __r;
	}
	public FlowDomainMgr_cmcc_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_cmcc_IOperations delegate)
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
	public void createMFD(mtnm.tmforum.org.flowDomain_cmcc.MFDCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,tpsToModify,theMFD,errorReason);
	}

	public void getMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void modifyFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain_cmcc.FDModifyData_T fdModifyData, mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
	}

	public void unassignCPTPsFromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void associateCPTPsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] cptpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
	}

	public void associateMFDsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder flowDomains) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void createAndActivateFDFr(mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void getAllAssociatedMFDs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder mfds, mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
	}

	public void assignCPTPsToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
	}

	public void getAllAssignableCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder cptpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
	}

	public void getAllCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain_cmcc.CPTP_Role_T cptpRole, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder cptpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
	}

	public void getFDFrsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, int how_many, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void getAllTopologicalLinksOfFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder topoList, mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
	}

	public void getAssigningMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void deleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName);
	}

	public void createFlowDomain(mtnm.tmforum.org.flowDomain_cmcc.FDCreateData_T createData, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder assignedCPTPs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
	}

	public void createFTP(mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP,errorReason);
	}

	public void getAllAssignedCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder cptpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAssociatingFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatingFD(mfdName,flowDomain);
	}

	public void activateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void getFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,flowDomain);
	}

	public void deAssociateCPTPsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
	}

	public void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void deleteMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName,tpsToModify,errorReason);
	}

	public void getAllSupportedMFDs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.flowDomain_cmcc.MFDList_THolder mfds, mtnm.tmforum.org.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder fdfrs) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void deactivateAndDeleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName,tpsToModify,errorReason);
	}

	public void getAllFlowDomains(int how_many, mtnm.tmforum.org.flowDomain_cmcc.FDList_THolder flowDomains, mtnm.tmforum.org.flowDomain_cmcc.FDIterator_IHolder fdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void modifyMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain_cmcc.MFDModifyData_T mfdModifyData, mtnm.tmforum.org.flowDomain_cmcc.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
	}

	public void createFDFr(mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void deAssociateMFDsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void deactivateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void deleteFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName,tpsToModify,errorReason);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getFDFrRoute(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrRoute_THolder route) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,route);
	}

}
