package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "EProtectionGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EProtectionGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String eProtectionGroupType = "";
	public mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectingList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePgpParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EProtectionGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String eProtectionGroupType, mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectedList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectingList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ePgpParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.eProtectionGroupType = eProtectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.ePgpParameters = ePgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
