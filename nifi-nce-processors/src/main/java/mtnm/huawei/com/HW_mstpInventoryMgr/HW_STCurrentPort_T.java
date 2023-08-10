package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_STCurrentPort_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_STCurrentPort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_STCurrentPort_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] portName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_STCurrentPort_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] portName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.portName = portName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.additionalInfo = additionalInfo;
	}
}
