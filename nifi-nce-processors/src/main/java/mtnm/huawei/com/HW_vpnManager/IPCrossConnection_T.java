package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "IPCrossConnection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPCrossConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IPCrossConnection_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String userLabel = "";
	public mtnm.tmforum.org.subnetworkConnection.SNCState_T activeState;
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.subnetworkConnection.SNCType_T ccType;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEndList;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEndList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public IPCrossConnection_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String userLabel, mtnm.tmforum.org.subnetworkConnection.SNCState_T activeState, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.subnetworkConnection.SNCType_T ccType, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEndList, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEndList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.userLabel = userLabel;
		this.activeState = activeState;
		this.administrativeState = administrativeState;
		this.direction = direction;
		this.ccType = ccType;
		this.transmissionParams = transmissionParams;
		this.aEndList = aEndList;
		this.zEndList = zEndList;
		this.additionalInfo = additionalInfo;
	}
}
