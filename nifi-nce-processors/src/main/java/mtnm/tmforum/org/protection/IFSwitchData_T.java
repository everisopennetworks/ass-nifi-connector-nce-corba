package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "IFSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IFSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IFSwitchData_T(){}
	public mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType;
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public short layerRate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] switchToTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IFSwitchData_T(mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType, mtnm.tmforum.org.protection.SwitchReason_T switchReason, short layerRate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] switchToTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionGroupType = protectionGroupType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTPList = protectedTPList;
		this.switchToTPList = switchToTPList;
		this.additionalInfo = additionalInfo;
	}
}
