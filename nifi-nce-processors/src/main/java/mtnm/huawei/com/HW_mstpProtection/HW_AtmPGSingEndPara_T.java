package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmPGSingEndPara_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSingEndPara_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmPGSingEndPara_T(){}
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_T switchType;
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public int holdOffTime;
	public int wtrTime;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSingEndPara_T(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_T switchType, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, int holdOffTime, int wtrTime, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.switchType = switchType;
		this.reversionMode = reversionMode;
		this.holdOffTime = holdOffTime;
		this.wtrTime = wtrTime;
		this.additionalInfo = additionalInfo;
	}
}
