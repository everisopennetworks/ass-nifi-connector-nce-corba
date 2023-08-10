package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "TrafficTrunkModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficTrunkModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrafficTrunkModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed;
	public mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute;
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] removedRoute;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunkModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed, mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] addedOrNewRoute, mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] removedRoute, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.transmissionParams = transmissionParams;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
