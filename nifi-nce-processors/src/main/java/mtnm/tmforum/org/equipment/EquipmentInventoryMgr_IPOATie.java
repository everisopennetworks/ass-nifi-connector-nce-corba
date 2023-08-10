package mtnm.tmforum.org.equipment;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EquipmentInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class EquipmentInventoryMgr_IPOATie
	extends EquipmentInventoryMgr_IPOA
{
	private EquipmentInventoryMgr_IOperations _delegate;

	private POA _poa;
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentInventoryMgr_IPOATie(EquipmentInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I __r = mtnm.tmforum.org.equipment.EquipmentInventoryMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.equipment.EquipmentInventoryMgr_I __r = mtnm.tmforum.org.equipment.EquipmentInventoryMgr_IHelper.narrow(__o);
		return __r;
	}
	public EquipmentInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentInventoryMgr_IOperations delegate)
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
	public void provisionEquipment(mtnm.tmforum.org.equipment.EQTCreateData_T equipmentCreateData, mtnm.tmforum.org.equipment.Equipment_THolder createdEquipment) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.provisionEquipment(equipmentCreateData,createdEquipment);
	}

	public void getEquipmentStaticInfo(java.lang.String[] typeList, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder staticInfoList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEquipmentStaticInfo(typeList,how_many,staticInfoList,staticInfoIt);
	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void unprovisionEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.unprovisionEquipment(equipmentName);
	}

	public void setAlarmSeverityList(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.Severity_T[] severityList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void setAlarmReportingOff(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(equipmentOrHolderName);
	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllEquipmentNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentNames(meOrHolderName,how_many,nameList,nameIt);
	}

	public void getAllSupportedPTPNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPNames(equipmentName,how_many,nameList,nameIt);
	}

	public void getAllEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, int how_many, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder eqList, mtnm.tmforum.org.equipment.EquipmentOrHolderIterator_IHolder eqIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipment(meOrHolderName,how_many,eqList,eqIt);
	}

	public void getContainedEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentHolderName, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getContainedEquipment(equipmentHolderName,equipmentOrHolderList);
	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.EquipmentOrHolder_THolder equip) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getEquipment(equipmentOrHolderName,equip);
	}

	public void getAllSupportedPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportedPTPs(equipmentName,how_many,tpList,tpIt);
	}

	public void getAllSupportingEquipmentNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ptpName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipmentNames(ptpName,nameList);
	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllEquipmentAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meOrHolderName, mtnm.tmforum.org.equipment.ObjectAdditionalInfoList_THolder additionalInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentAdditionalInfo(meOrHolderName,additionalInfoList);
	}

	public void setAlarmReportingOn(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(equipmentOrHolderName);
	}

	public void getPhysicalLocationInfo(mtnm.tmforum.org.equipment.PhysicalLocationInfoList_THolder phyLocationInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getPhysicalLocationInfo(phyLocationInfoList);
	}

	public void getAlarmSeverityList(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentOrHolderName, mtnm.tmforum.org.equipment.SeverityList_THolder severityList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAlarmSeverityList(equipmentOrHolderName,severityList);
	}

	public void getAllSupportingEquipment(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ptpName, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder eqList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.getAllSupportingEquipment(ptpName,eqList);
	}

}
