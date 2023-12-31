package mtnm.huawei.com.HW_mstpInventoryMgr;
/**
 * Generated from IDL enum "HW_MSTPEndPointType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MSTPEndPointType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_MEPT_NA = 0;
	public static final HW_MSTPEndPointType_T HW_MEPT_NA = new HW_MSTPEndPointType_T(_HW_MEPT_NA);
	public static final int _HW_MEPT_ATM = 1;
	public static final HW_MSTPEndPointType_T HW_MEPT_ATM = new HW_MSTPEndPointType_T(_HW_MEPT_ATM);
	public static final int _HW_MEPT_ATMTRUNK = 2;
	public static final HW_MSTPEndPointType_T HW_MEPT_ATMTRUNK = new HW_MSTPEndPointType_T(_HW_MEPT_ATMTRUNK);
	public static final int _HW_MEPT_ETH = 3;
	public static final HW_MSTPEndPointType_T HW_MEPT_ETH = new HW_MSTPEndPointType_T(_HW_MEPT_ETH);
	public static final int _HW_MEPT_ETHTRUNK = 4;
	public static final HW_MSTPEndPointType_T HW_MEPT_ETHTRUNK = new HW_MSTPEndPointType_T(_HW_MEPT_ETHTRUNK);
	public static final int _HW_MEPT_LP = 5;
	public static final HW_MSTPEndPointType_T HW_MEPT_LP = new HW_MSTPEndPointType_T(_HW_MEPT_LP);
	public static final int _HW_MEPT_RPR = 6;
	public static final HW_MSTPEndPointType_T HW_MEPT_RPR = new HW_MSTPEndPointType_T(_HW_MEPT_RPR);
	public int value()
	{
		return value;
	}
	public static HW_MSTPEndPointType_T from_int(int value)
	{
		switch (value) {
			case _HW_MEPT_NA: return HW_MEPT_NA;
			case _HW_MEPT_ATM: return HW_MEPT_ATM;
			case _HW_MEPT_ATMTRUNK: return HW_MEPT_ATMTRUNK;
			case _HW_MEPT_ETH: return HW_MEPT_ETH;
			case _HW_MEPT_ETHTRUNK: return HW_MEPT_ETHTRUNK;
			case _HW_MEPT_LP: return HW_MEPT_LP;
			case _HW_MEPT_RPR: return HW_MEPT_RPR;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_MEPT_NA: return "HW_MEPT_NA";
			case _HW_MEPT_ATM: return "HW_MEPT_ATM";
			case _HW_MEPT_ATMTRUNK: return "HW_MEPT_ATMTRUNK";
			case _HW_MEPT_ETH: return "HW_MEPT_ETH";
			case _HW_MEPT_ETHTRUNK: return "HW_MEPT_ETHTRUNK";
			case _HW_MEPT_LP: return "HW_MEPT_LP";
			case _HW_MEPT_RPR: return "HW_MEPT_RPR";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_MSTPEndPointType_T(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
