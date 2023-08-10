package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL struct "TrailNtwProtModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrailNtwProtModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgATPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgZTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgATPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgZTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.reversionMode = reversionMode;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
}
