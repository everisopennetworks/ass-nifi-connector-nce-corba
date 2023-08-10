package mtnm.huawei.com.HW_controlPlane;

/**
 * Generated from IDL struct "HW_Capacity_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_Capacity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_Capacity_T(){}
	public short unit;
	public int Bandwidth;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_Capacity_T(short unit, int Bandwidth, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.unit = unit;
		this.Bandwidth = Bandwidth;
		this.additionalInfo = additionalInfo;
	}
}
