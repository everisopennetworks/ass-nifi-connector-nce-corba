package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "ESwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ESwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ESwitchData_T(){}
	public java.lang.String eProtectionGroupType = "";
	public java.lang.String eSwitchReason = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedE;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToE;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ESwitchData_T(java.lang.String eProtectionGroupType, java.lang.String eSwitchReason, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePGPName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectedE, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchToE, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eProtectionGroupType = eProtectionGroupType;
		this.eSwitchReason = eSwitchReason;
		this.ePGPName = ePGPName;
		this.protectedE = protectedE;
		this.switchToE = switchToE;
		this.additionalInfo = additionalInfo;
	}
}
