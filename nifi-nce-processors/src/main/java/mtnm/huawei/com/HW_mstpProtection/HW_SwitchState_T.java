package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_SwitchState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_SwitchState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_SS_NA = 0;
	public static final HW_SwitchState_T HW_SS_NA = new HW_SwitchState_T(_HW_SS_NA);
	public static final int _HW_SS_IDLE = 1;
	public static final HW_SwitchState_T HW_SS_IDLE = new HW_SwitchState_T(_HW_SS_IDLE);
	public static final int _HW_SS_SWITCH = 2;
	public static final HW_SwitchState_T HW_SS_SWITCH = new HW_SwitchState_T(_HW_SS_SWITCH);
	public static final int _HW_SS_PASS_THROUGH = 3;
	public static final HW_SwitchState_T HW_SS_PASS_THROUGH = new HW_SwitchState_T(_HW_SS_PASS_THROUGH);
	public int value()
	{
		return value;
	}
	public static HW_SwitchState_T from_int(int value)
	{
		switch (value) {
			case _HW_SS_NA: return HW_SS_NA;
			case _HW_SS_IDLE: return HW_SS_IDLE;
			case _HW_SS_SWITCH: return HW_SS_SWITCH;
			case _HW_SS_PASS_THROUGH: return HW_SS_PASS_THROUGH;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_SS_NA: return "HW_SS_NA";
			case _HW_SS_IDLE: return "HW_SS_IDLE";
			case _HW_SS_SWITCH: return "HW_SS_SWITCH";
			case _HW_SS_PASS_THROUGH: return "HW_SS_PASS_THROUGH";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_SwitchState_T(int i)
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
