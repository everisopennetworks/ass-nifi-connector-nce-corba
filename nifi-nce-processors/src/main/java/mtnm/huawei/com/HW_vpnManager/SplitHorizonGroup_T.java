package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "SplitHorizonGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SplitHorizonGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SplitHorizonGroup_T(){}
	public int shgID;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] shgMemberNameList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SplitHorizonGroup_T(int shgID, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] shgMemberNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.shgID = shgID;
		this.shgMemberNameList = shgMemberNameList;
		this.additionalInfo = additionalInfo;
	}
}
