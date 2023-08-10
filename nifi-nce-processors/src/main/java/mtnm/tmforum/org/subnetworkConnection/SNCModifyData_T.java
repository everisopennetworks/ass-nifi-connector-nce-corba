package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "SNCModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SNCModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public java.lang.String modifyType = "";
	public boolean retainOldSNC;
	public boolean modifyServers_allowed;
	public mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T protectionEffort;
	public mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed;
	public mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted;
	public mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute;
	public mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] removedRoute;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, java.lang.String modifyType, boolean retainOldSNC, boolean modifyServers_allowed, mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_T protectionEffort, mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed, mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted, mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType, short layerRate, mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute, mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T[] removedRoute, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.modifyType = modifyType;
		this.retainOldSNC = retainOldSNC;
		this.modifyServers_allowed = modifyServers_allowed;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
