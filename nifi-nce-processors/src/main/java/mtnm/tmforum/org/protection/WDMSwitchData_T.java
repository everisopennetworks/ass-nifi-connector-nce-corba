package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "WDMSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class WDMSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public WDMSwitchData_T(){}
	public java.lang.String protectionType = "";
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wPGPName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMSwitchData_T(java.lang.String protectionType, mtnm.tmforum.org.protection.SwitchReason_T switchReason, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] wPGPName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.wPGPName = wPGPName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
}
