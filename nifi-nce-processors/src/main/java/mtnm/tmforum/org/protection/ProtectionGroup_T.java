package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "ProtectionGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ProtectionGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType;
	public mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public short rate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProtectionGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType, mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, short rate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
