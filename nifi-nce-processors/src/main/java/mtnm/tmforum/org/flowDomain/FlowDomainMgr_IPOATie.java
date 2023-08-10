package mtnm.tmforum.org.flowDomain;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "FlowDomainMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class FlowDomainMgr_IPOATie
	extends FlowDomainMgr_IPOA
{
	private FlowDomainMgr_IOperations _delegate;

	private POA _poa;
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FlowDomainMgr_IPOATie(FlowDomainMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.flowDomain.FlowDomainMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain.FlowDomainMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain.FlowDomainMgr_IHelper.narrow(__o);
		return __r;
	}
	public FlowDomainMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FlowDomainMgr_IOperations delegate)
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
	public void getFDFrsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, int how_many, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(tpName,how_many,fdfrList,fdfrIt);
	}

	public void associateCPTPsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.associateCPTPsWithFlowDomain(fdName,tpNames);
	}

	public void createFDFr(mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder endTPs, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void createMFD(mtnm.tmforum.org.flowDomain.MFDCreateData_T createData, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder theMFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createMFD(createData,theMFD);
	}

	public void unassignCPTPsFromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.unassignCPTPsFromMFD(mfdName,tpNames);
	}

	public void activateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void deleteMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFD(mfdName);
	}

	public void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void addFPsToFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.addFPsToFDFr(fdfrName,connectivityRequirement,tpNames,internalTpNames,tpsToModify,errorReason);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getFDfromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDfromMFD(mfdName,_flowDomain);
	}

	public void getAssigningMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssigningMFD(cptpName,mfd);
	}

	public void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void deactivateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void getAssignableCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssignableCPTPs(mfdName,how_many,tpList,tpIt);
	}

	public void deAssociateCPTPsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateCPTPsFromFlowDomain(fdName,tpNames);
	}

	public void createFlowDomain(mtnm.tmforum.org.flowDomain.FDCreateData_T createData, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, mtnm.tmforum.org.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFlowDomain(createData,fdEdgeCPTPs,theFD,errorReason);
	}

	public void deAssociateMFDsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deAssociateMFDsFromFlowDomain(fdName,mfdNames);
	}

	public void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName);
	}

	public void deleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void createFTP(mtnm.tmforum.org.flowDomain.FTPCreateData_T createData, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,theFTP);
	}

	public void modifyFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FDModifyData_T fdModifyData, mtnm.tmforum.org.flowDomain.FlowDomain_THolder newFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFlowDomain(fdName,fdModifyData,newFD);
	}

	public void getAllCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllCPTPs(fdOrMfdName,how_many,tpList,tpIt);
	}

	public void deleteFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlowDomain(fdName);
	}

	public void getAllMFDNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDNames(holderName,how_many,nameList,nameIt);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void performEthernetOAMCommand(mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T operation, mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.performEthernetOAMCommand(operation,ltTestResult);
	}

	public void modifyMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MFDModifyData_T mfdModifyData, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalModificationInfo, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFD(mfdName,mfdModifyData,transmissionDescriptorName,transmissionParams,additionalModificationInfo,newMFD,errorReason);
	}

	public void getAllFDFrNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectivityRateList,nameList,nameIt);
	}

	public void removeFPsFromFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.removeFPsFromFDFr(fdfrName,tpNames,errorReason);
	}

	public void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomainsByUserLabel(userLabel,flowDomains);
	}

	public void getAllEthernetOAMPoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] Fdfrname, mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THolder oamPointList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEthernetOAMPoint(Fdfrname,oamPointList);
	}

	public void getFDFrServerTrail(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder serverNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void getAllFlowDomainNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomainNames(how_many,nameList,nameIt);
	}

	public void assignCPTPsToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.assignCPTPsToMFD(mfdName,tpNames);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrs) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrs);
	}

	public void getAllFlowDomains(int how_many, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains, mtnm.tmforum.org.flowDomain.FDIterator_IHolder fdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowDomains(how_many,flowDomains,fdIt);
	}

	public void associateMFDsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.associateMFDsWithFlowDomain(fdName,mfdNames);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

	public void getMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getMFD(mfdName,mfd);
	}

	public void validateTMDAssignmentToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalTPInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToMFD(mfdName,tmdAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void getFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFlowDomain(fdName,_flowDomain);
	}

	public void getAllMFDs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.flowDomain.MFDList_THolder mfds, mtnm.tmforum.org.flowDomain.MFDIterator_IHolder mfdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDs(holderName,how_many,mfds,mfdIt);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
