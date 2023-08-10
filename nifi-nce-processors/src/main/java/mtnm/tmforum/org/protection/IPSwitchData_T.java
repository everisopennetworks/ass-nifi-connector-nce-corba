package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "IPSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IPSwitchData_T(){}
	public java.lang.String protectionType = "";
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public short layerRate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] switchToList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPSwitchData_T(java.lang.String protectionType, mtnm.tmforum.org.protection.SwitchReason_T switchReason, short layerRate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] groupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] switchToList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedList = protectedList;
		this.switchToList = switchToList;
		this.additionalInfo = additionalInfo;
	}
}
