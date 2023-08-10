package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "SwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SwitchData_T(){}
	public mtnm.tmforum.org.protection.ProtectionType_T protectionType;
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public short layerRate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SwitchData_T(mtnm.tmforum.org.protection.ProtectionType_T protectionType, mtnm.tmforum.org.protection.SwitchReason_T switchReason, short layerRate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
