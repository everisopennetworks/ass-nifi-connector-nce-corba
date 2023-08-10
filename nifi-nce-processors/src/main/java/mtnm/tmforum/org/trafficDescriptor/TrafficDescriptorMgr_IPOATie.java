package mtnm.tmforum.org.trafficDescriptor;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "TrafficDescriptorMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class TrafficDescriptorMgr_IPOATie
	extends TrafficDescriptorMgr_IPOA
{
	private TrafficDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I __r = mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_I __r = mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(__o);
		return __r;
	}
	public TrafficDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrafficDescriptorMgr_IOperations delegate)
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
	public void deleteTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] descriptorName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficDescriptor(descriptorName);
	}

	public void HW_getAllTrafficDescriptors(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptors(meName,how_many,trafficDescList,trafficDescIt);
	}

	public void HW_getAllTrafficDescriptorNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptorNames(meName,how_many,nameList,nameIt);
	}

	public void getAllTrafficDescriptorNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptorNames(how_many,nameList,nameIt);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void activateTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficDescriptor(tdName,td);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createTrafficDescriptor(mtnm.tmforum.org.trafficDescriptor.TDCreateData_T newTDCreateData, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.createTrafficDescriptor(newTDCreateData,newTrafficDescriptor);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void deactivateTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficDescriptor(tdName,td);
	}

	public void getAllTrafficDescriptors(int how_many, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptors(how_many,trafficDescList,trafficDescIt);
	}

	public void getTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tdName, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder td) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficDescriptor(tdName,td);
	}

	public void HW_createTrafficDescriptor(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.tmforum.org.trafficDescriptor.TDCreateData_T newTDCreateData, mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.HW_createTrafficDescriptor(meName,newTDCreateData,newTrafficDescriptor);
	}

	public void getAssociatedCTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedCTPs(trafficDescriptorName,how_many,tpList,tpIt);
	}

}
