package mtnm.huawei.com.HW_mstpInventoryMgr;
/**
 * Generated from IDL enum "HW_QosType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_QosType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_QT_NA = 0;
	public static final HW_QosType_T HW_QT_NA = new HW_QosType_T(_HW_QT_NA);
	public static final int _HW_QT_CAR = 1;
	public static final HW_QosType_T HW_QT_CAR = new HW_QosType_T(_HW_QT_CAR);
	public static final int _HW_QT_COS = 2;
	public static final HW_QosType_T HW_QT_COS = new HW_QosType_T(_HW_QT_COS);
	public int value()
	{
		return value;
	}
	public static HW_QosType_T from_int(int value)
	{
		switch (value) {
			case _HW_QT_NA: return HW_QT_NA;
			case _HW_QT_CAR: return HW_QT_CAR;
			case _HW_QT_COS: return HW_QT_COS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_QT_NA: return "HW_QT_NA";
			case _HW_QT_CAR: return "HW_QT_CAR";
			case _HW_QT_COS: return "HW_QT_COS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_QosType_T(int i)
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
