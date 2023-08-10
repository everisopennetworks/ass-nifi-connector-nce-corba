package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "MultipointServiceAttr_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MultipointServiceAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MultipointServiceAttr_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList;
	public mtnm.huawei.com.HW_vpnManager.StaticMacAddress_T[] staticMacList;
	public mtnm.huawei.com.HW_vpnManager.SplitHorizonGroup_T[] shgList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultipointServiceAttr_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.huawei.com.HW_vpnManager.StaticMacAddress_T[] staticMacList, mtnm.huawei.com.HW_vpnManager.SplitHorizonGroup_T[] shgList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.paraList = paraList;
		this.staticMacList = staticMacList;
		this.shgList = shgList;
		this.additionalInfo = additionalInfo;
	}
}
