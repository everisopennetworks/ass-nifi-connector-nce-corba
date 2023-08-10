package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_RPRTopoInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRTopoInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_RPRTopoInfo_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRTopoInfo_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] nodeName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] topoParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.topoParameters = topoParameters;
		this.additionalInfo = additionalInfo;
	}
}
