package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "MatrixFlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MatrixFlowDomainFragment_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public mtnm.tmforum.org.subnetworkConnection.SNCState_T fdfrState;
	public mtnm.tmforum.org.performance.AdministrativeState_T administrativeState;
	public boolean flexible;
	public java.lang.String mfdfrType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.subnetworkConnection.SNCState_T fdfrState, mtnm.tmforum.org.performance.AdministrativeState_T administrativeState, boolean flexible, java.lang.String mfdfrType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.multipointServiceAttr = multipointServiceAttr;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.fdfrState = fdfrState;
		this.administrativeState = administrativeState;
		this.flexible = flexible;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
