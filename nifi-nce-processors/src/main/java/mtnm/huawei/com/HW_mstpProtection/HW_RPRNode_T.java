package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_RPRNode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRNode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_RPRNode_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short nodeNo;
	public boolean protocolEnabled;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRNode_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short nodeNo, boolean protocolEnabled, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.nodeNo = nodeNo;
		this.protocolEnabled = protocolEnabled;
		this.nodeParameters = nodeParameters;
		this.additionalInfo = additionalInfo;
	}
}
