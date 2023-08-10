package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "TrafficTrunk_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficTrunk_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrafficTrunk_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.subnetworkConnection.SNCState_T activeState;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed;
	public mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficTrunk_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.subnetworkConnection.SNCState_T activeState, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed, mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.activeState = activeState;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.administrativeState = administrativeState;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
