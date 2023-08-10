package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_RPRSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_RPRSwitchData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName;
	public mtnm.tmforum.org.protection.SwitchReason_T switchReason;
	public mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T switchState;
	public mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_T switchPosition;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRSwitchData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.protection.SwitchReason_T switchReason, mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T switchState, mtnm.huawei.com.HW_mstpProtection.HW_SwitchPosition_T switchPosition, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] switchParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.switchPosition = switchPosition;
		this.switchParameters = switchParameters;
		this.additionalInfo = additionalInfo;
	}
}
