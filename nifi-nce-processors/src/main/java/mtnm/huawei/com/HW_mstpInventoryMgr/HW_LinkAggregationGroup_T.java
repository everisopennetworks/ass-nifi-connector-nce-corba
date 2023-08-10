package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_LinkAggregationGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_LinkAggregationGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_LinkAggregationGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mainPortName;
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_LAGBranchPort_T[] branchPortList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_LinkAggregationGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mainPortName, mtnm.huawei.com.HW_mstpInventoryMgr.HW_LAGBranchPort_T[] branchPortList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.paraList = paraList;
		this.mainPortName = mainPortName;
		this.branchPortList = branchPortList;
		this.additionalInfo = additionalInfo;
	}
}
