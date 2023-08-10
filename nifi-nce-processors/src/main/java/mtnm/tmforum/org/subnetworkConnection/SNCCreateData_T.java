package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "SNCCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SNCCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed;
	public mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted;
	public mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccInclusions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T protectionEffort, mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed, mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted, mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType, short layerRate, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] ccInclusions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
