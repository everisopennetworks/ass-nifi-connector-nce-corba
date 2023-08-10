package mtnm.tmforum.org.encapsulationLayerLink;


/**
 * Generated from IDL interface "EncapsulationLayerLinkMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EncapsulationLayerLinkMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllELLinks(int how_many, mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder ells, mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllELLinkNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getELLinkWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getConnectingELL(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getELLinkWithSncOrTl(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncOrTlName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllELLinksWithMeOrFd(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, mtnm.tmforum.org.encapsulationLayerLink.ELLinkList_THolder ells, mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getServerSNCsAndTLs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.subnetworkConnection.SubnetworkConnectionList_THolder sncList, mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder tlList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createELLink(mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T createData, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void activateELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void modifyELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_T ellModifyData, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void increaseBandwidthOfELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, boolean automatic, mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void decreaseBandwidthOfELLink(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalModificationInfo, mtnm.tmforum.org.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void setELLinkLCASState(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
