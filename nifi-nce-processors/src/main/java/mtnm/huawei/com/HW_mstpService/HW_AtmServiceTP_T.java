package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_AtmServiceTP_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmServiceTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_AtmServiceTP_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficDescriptorName;
	public boolean bPC;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmServiceTP_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficDescriptorName, boolean bPC, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.trafficDescriptorName = trafficDescriptorName;
		this.bPC = bPC;
		this.additionalInfo = additionalInfo;
	}
}
