package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "WDMProtectionGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class WDMProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public WDMProtectionGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionGroupType = "";
	public mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public WDMProtectionGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionGroupType, mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
