package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmPGSingleEndSwitchPara_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSingleEndSwitchPara_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmPGSingleEndSwitchPara_T(){}
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T switchState;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSingleEndSwitchPara_T(mtnm.tmforum.org.protection.SwitchReason_T switchReason, mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T switchState, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.additionalInfo = additionalInfo;
	}
}
