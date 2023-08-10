package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_LAGBranchPort_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_LAGBranchPort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_LAGBranchPort_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] branchPortName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] branchPortParaList;
	public HW_LAGBranchPort_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] branchPortName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] branchPortParaList)
	{
		this.branchPortName = branchPortName;
		this.branchPortParaList = branchPortParaList;
	}
}
