package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "Equipment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Equipment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Equipment_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public mtnm.tmforum.org.equipment.ServiceState_T serviceState;
	public java.lang.String expectedEquipmentObjectType = "";
	public java.lang.String installedEquipmentObjectType = "";
	public java.lang.String installedPartNumber = "";
	public java.lang.String installedVersion = "";
	public java.lang.String installedSerialNumber = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public Equipment_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, mtnm.tmforum.org.equipment.ServiceState_T serviceState, java.lang.String expectedEquipmentObjectType, java.lang.String installedEquipmentObjectType, java.lang.String installedPartNumber, java.lang.String installedVersion, java.lang.String installedSerialNumber, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.serviceState = serviceState;
		this.expectedEquipmentObjectType = expectedEquipmentObjectType;
		this.installedEquipmentObjectType = installedEquipmentObjectType;
		this.installedPartNumber = installedPartNumber;
		this.installedVersion = installedVersion;
		this.installedSerialNumber = installedSerialNumber;
		this.additionalInfo = additionalInfo;
	}
}
