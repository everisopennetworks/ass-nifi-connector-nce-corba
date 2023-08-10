package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmProtectGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmProtectGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmProtectGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGUseState_T useState;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T srcEndPara;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T snkEndPara;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T[] ppList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmProtectGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_T protectType, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGUseState_T useState, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T srcEndPara, mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T snkEndPara, mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T[] ppList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectType = protectType;
		this.switchDirect = switchDirect;
		this.useState = useState;
		this.srcEndPara = srcEndPara;
		this.snkEndPara = snkEndPara;
		this.ppList = ppList;
		this.additionalInfo = additionalInfo;
	}
}
