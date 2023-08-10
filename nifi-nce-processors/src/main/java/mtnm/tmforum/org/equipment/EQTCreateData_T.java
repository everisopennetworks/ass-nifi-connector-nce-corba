package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "EQTCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EQTCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EQTCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String expectedEquipmentObjectType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentHolderName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EQTCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String expectedEquipmentObjectType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] equipmentHolderName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.expectedEquipmentObjectType = expectedEquipmentObjectType;
		this.equipmentHolderName = equipmentHolderName;
		this.additionalInfo = additionalInfo;
	}
}
