package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_AtmService_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmService_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmService_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T serviceType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceSpreadType_T spreadType;
	public mtnm.huawei.com.HW_mstpService.HW_AtmProtectRole_T protectRole;
	public boolean activeState;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T aEndPoint;
	public mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T zEndPoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmService_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T serviceType, mtnm.huawei.com.HW_mstpService.HW_AtmServiceSpreadType_T spreadType, mtnm.huawei.com.HW_mstpService.HW_AtmProtectRole_T protectRole, boolean activeState, mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T aEndPoint, mtnm.huawei.com.HW_mstpService.HW_AtmServiceTP_T zEndPoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectType = protectType;
		this.serviceType = serviceType;
		this.spreadType = spreadType;
		this.protectRole = protectRole;
		this.activeState = activeState;
		this.aEndPoint = aEndPoint;
		this.zEndPoint = zEndPoint;
		this.additionalInfo = additionalInfo;
	}
}
