package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_EthService_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_EthService_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_EthService_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T serviceType;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public boolean activeState;
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T aEndPoint;
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T zEndPoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthService_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T serviceType, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, boolean activeState, mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T aEndPoint, mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T zEndPoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.serviceType = serviceType;
		this.direction = direction;
		this.activeState = activeState;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
