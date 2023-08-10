package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "EquipmentHolder_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EquipmentHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EquipmentHolder_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public java.lang.String holderType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment;
	public java.lang.String[] acceptableEquipmentTypeList;
	public mtnm.tmforum.org.equipment.HolderState_T holderState;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentHolder_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, java.lang.String holderType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment, java.lang.String[] acceptableEquipmentTypeList, mtnm.tmforum.org.equipment.HolderState_T holderState, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.holderType = holderType;
		this.expectedOrInstalledEquipment = expectedOrInstalledEquipment;
		this.acceptableEquipmentTypeList = acceptableEquipmentTypeList;
		this.holderState = holderState;
		this.additionalInfo = additionalInfo;
	}
}
