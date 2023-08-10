package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmProtectType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmProtectType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_APT_NA = 0;
	public static final HW_AtmProtectType_T HW_APT_NA = new HW_AtmProtectType_T(_HW_APT_NA);
	public static final int _HW_APT_NONE = 1;
	public static final HW_AtmProtectType_T HW_APT_NONE = new HW_AtmProtectType_T(_HW_APT_NONE);
	public static final int _HW_APT_1PLUS1 = 2;
	public static final HW_AtmProtectType_T HW_APT_1PLUS1 = new HW_AtmProtectType_T(_HW_APT_1PLUS1);
	public static final int _HW_APT_1V1 = 3;
	public static final HW_AtmProtectType_T HW_APT_1V1 = new HW_AtmProtectType_T(_HW_APT_1V1);
	public int value()
	{
		return value;
	}
	public static HW_AtmProtectType_T from_int(int value)
	{
		switch (value) {
			case _HW_APT_NA: return HW_APT_NA;
			case _HW_APT_NONE: return HW_APT_NONE;
			case _HW_APT_1PLUS1: return HW_APT_1PLUS1;
			case _HW_APT_1V1: return HW_APT_1V1;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_APT_NA: return "HW_APT_NA";
			case _HW_APT_NONE: return "HW_APT_NONE";
			case _HW_APT_1PLUS1: return "HW_APT_1PLUS1";
			case _HW_APT_1V1: return "HW_APT_1V1";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmProtectType_T(int i)
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
