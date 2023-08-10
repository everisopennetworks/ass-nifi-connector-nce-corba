package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "SubnetworkConnection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SubnetworkConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SubnetworkConnection_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.subnetworkConnection.SNCState_T sncState;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed;
	public mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SubnetworkConnection_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.subnetworkConnection.SNCState_T sncState, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, short rate, mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, mtnm.tmforum.org.subnetworkConnection.SNCType_T sncType, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.subnetworkConnection.Reroute_T rerouteAllowed, mtnm.tmforum.org.subnetworkConnection.NetworkRouted_T networkRouted, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.sncState = sncState;
		this.direction = direction;
		this.rate = rate;
		this.staticProtectionLevel = staticProtectionLevel;
		this.sncType = sncType;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
