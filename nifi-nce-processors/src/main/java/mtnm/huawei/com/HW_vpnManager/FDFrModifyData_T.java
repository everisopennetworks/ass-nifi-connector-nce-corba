package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "FDFrModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.multipointServiceAttr = multipointServiceAttr;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
