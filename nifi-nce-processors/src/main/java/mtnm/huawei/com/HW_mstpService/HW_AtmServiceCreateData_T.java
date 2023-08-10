package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_AtmServiceCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmServiceCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmServiceCreateData_T(){}
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T serviceType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceSpreadType_T spreadType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmProtectRole_T protectRole;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T aEndPoint;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T zEndPoint;
	public boolean active;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceCreateData_T(mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T serviceType, mtnm.huawei.com.HW_mstpService.HW_AtmServiceSpreadType_T spreadType, mtnm.huawei.com.HW_mstpService.HW_AtmProtectRole_T protectRole, mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T aEndPoint, mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T zEndPoint, boolean active, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectType = protectType;
		this.serviceType = serviceType;
		this.spreadType = spreadType;
		this.protectRole = protectRole;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.active = active;
		this.additionalInfo = additionalInfo;
	}
}
