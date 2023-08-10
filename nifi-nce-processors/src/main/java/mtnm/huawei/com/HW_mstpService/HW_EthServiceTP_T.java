package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL struct "HW_EthServiceTP_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_EthServiceTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_EthServiceTP_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public short vlanID;
	public int tunnel;
	public int vc;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthServiceTP_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, short vlanID, int tunnel, int vc, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.vlanID = vlanID;
		this.tunnel = tunnel;
		this.vc = vc;
		this.additionalInfo = additionalInfo;
	}
}
