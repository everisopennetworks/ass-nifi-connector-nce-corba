package mtnm.tmforum.org.trafficDescriptor;


/**
 * Generated from IDL interface "TrafficDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface TrafficDescriptorMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrafficDescriptors(int how_many, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptors(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllTrafficDescriptorNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptorNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void activateTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAssociatedCTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createTrafficDescriptor(mtnm.tmforum.org.trafficDescriptor.TDCreateData_T newTDCreateData, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void HW_createTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.trafficDescriptor.TDCreateData_T newTDCreateData, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] descriptorName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
