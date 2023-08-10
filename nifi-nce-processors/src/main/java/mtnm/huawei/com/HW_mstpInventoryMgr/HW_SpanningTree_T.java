package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_SpanningTree_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_SpanningTree_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_SpanningTree_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] STInfo;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] STCurrentBridge;
	public mtnm.huawei.com.HW_mstpInventoryMgr.HW_STCurrentPort_T[] STCurrentPort;
	public HW_SpanningTree_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] STInfo, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] STCurrentBridge, mtnm.huawei.com.HW_mstpInventoryMgr.HW_STCurrentPort_T[] STCurrentPort)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.STInfo = STInfo;
		this.STCurrentBridge = STCurrentBridge;
		this.STCurrentPort = STCurrentPort;
	}
}
