package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_EthServiceCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_EthServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_EthServiceCreateData_T(){}
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T serviceType;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T aEndPoint;
	public mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T zEndPoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthServiceCreateData_T(mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T serviceType, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T aEndPoint, mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_T zEndPoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.serviceType = serviceType;
		this.direction = direction;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
