package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL struct "TrailNtwProtection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrailNtwProtection_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType;
	public mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgATPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgZTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtection_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType, mtnm.tmforum.org.protection.ProtectionSchemeState_T protectionSchemeState, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, short rate, java.lang.String trailNtwProtectionType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgATPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgZTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
}
