package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmServiceProtectPair_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmServiceProtectPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmServiceProtectPair_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] workServiceName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectServiceName;
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceProtectPair_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] workServiceName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectServiceName, mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_T monitorFlag, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.workServiceName = workServiceName;
		this.protectServiceName = protectServiceName;
		this.monitorFlag = monitorFlag;
		this.additionalInfo = additionalInfo;
	}
}
