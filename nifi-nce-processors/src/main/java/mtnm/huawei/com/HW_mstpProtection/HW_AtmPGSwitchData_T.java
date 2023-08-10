package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmPGSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmPGSwitchData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSwitchData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgName, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T srcEndSwitchPara, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_T snkEndSwitchPara, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pgName = pgName;
		this.protectType = protectType;
		this.srcEndSwitchPara = srcEndSwitchPara;
		this.snkEndSwitchPara = snkEndSwitchPara;
		this.additionalInfo = additionalInfo;
	}
}
