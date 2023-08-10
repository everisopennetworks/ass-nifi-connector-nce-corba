package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_RPRLinkInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRLinkInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_RPRLinkInfo_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public short nodeNo;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprLinkParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRLinkInfo_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, short nodeNo, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] rprLinkParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nodeNo = nodeNo;
		this.rprLinkParameters = rprLinkParameters;
		this.additionalInfo = additionalInfo;
	}
}
