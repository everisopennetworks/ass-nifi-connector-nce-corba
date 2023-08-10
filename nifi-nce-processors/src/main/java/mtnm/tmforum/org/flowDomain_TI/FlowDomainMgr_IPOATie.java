package mtnm.tmforum.org.flowDomain_TI;

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
	public mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_I __r = mtnm.tmforum.org.flowDomain_TI.FlowDomainMgr_IHelper.narrow(__o);
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
	public void createAndActivateFDFr(mtnm.tmforum.org.flowDomainFragment_TI.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder theFDFr, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void deactivateAndDeleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment_TI.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment_TI.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
	}

	public void createFTP(mtnm.tmforum.org.flowDomain_TI.FTPCreateData_T createData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP,errorReason);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName,tpsToModify,errorReason);
	}

	public void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_TI.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.flowDomain_TI.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder failedTPList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
	}

	public void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment_TI.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,fdfr);
	}

}
