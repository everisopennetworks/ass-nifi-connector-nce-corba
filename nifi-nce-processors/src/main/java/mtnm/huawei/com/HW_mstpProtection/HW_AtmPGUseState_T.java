package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmPGUseState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGUseState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_AUS_NA = 0;
	public static final HW_AtmPGUseState_T HW_AUS_NA = new HW_AtmPGUseState_T(_HW_AUS_NA);
	public static final int _HW_AUS_USED = 1;
	public static final HW_AtmPGUseState_T HW_AUS_USED = new HW_AtmPGUseState_T(_HW_AUS_USED);
	public static final int _HW_AUS_UNUSED = 2;
	public static final HW_AtmPGUseState_T HW_AUS_UNUSED = new HW_AtmPGUseState_T(_HW_AUS_UNUSED);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGUseState_T from_int(int value)
	{
		switch (value) {
			case _HW_AUS_NA: return HW_AUS_NA;
			case _HW_AUS_USED: return HW_AUS_USED;
			case _HW_AUS_UNUSED: return HW_AUS_UNUSED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_AUS_NA: return "HW_AUS_NA";
			case _HW_AUS_USED: return "HW_AUS_USED";
			case _HW_AUS_UNUSED: return "HW_AUS_UNUSED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGUseState_T(int i)
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
