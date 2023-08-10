package mtnm.huawei.com.HW_controlPlane;

/**
 * Generated from IDL struct "HW_SnppLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_SnppLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_SnppLink_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndSnppName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndSnppName;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public short[] rateList;
	public short cost;
	public java.lang.String protectType = "";
	public mtnm.huawei.com.HW_controlPlane.HW_Capacity_T[] linkCapacity;
	public java.lang.String linkState = "";
	public int[] srlgIDList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_SnppLink_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndSnppName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndSnppName, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, short[] rateList, short cost, java.lang.String protectType, mtnm.huawei.com.HW_controlPlane.HW_Capacity_T[] linkCapacity, java.lang.String linkState, int[] srlgIDList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.aEndSnppName = aEndSnppName;
		this.zEndSnppName = zEndSnppName;
		this.direction = direction;
		this.rateList = rateList;
		this.cost = cost;
		this.protectType = protectType;
		this.linkCapacity = linkCapacity;
		this.linkState = linkState;
		this.srlgIDList = srlgIDList;
		this.additionalInfo = additionalInfo;
	}
}
