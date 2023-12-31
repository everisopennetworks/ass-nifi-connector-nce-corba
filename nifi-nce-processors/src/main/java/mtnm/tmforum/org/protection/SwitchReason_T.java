package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "SwitchReason_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SwitchReason_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _SR_NA = 0;
	public static final SwitchReason_T SR_NA = new SwitchReason_T(_SR_NA);
	public static final int _SR_RESTORED = 1;
	public static final SwitchReason_T SR_RESTORED = new SwitchReason_T(_SR_RESTORED);
	public static final int _SR_SIGNAL_FAIL = 2;
	public static final SwitchReason_T SR_SIGNAL_FAIL = new SwitchReason_T(_SR_SIGNAL_FAIL);
	public static final int _SR_SIGNAL_MISMATCH = 3;
	public static final SwitchReason_T SR_SIGNAL_MISMATCH = new SwitchReason_T(_SR_SIGNAL_MISMATCH);
	public static final int _SR_SIGNAL_DEGRADE = 4;
	public static final SwitchReason_T SR_SIGNAL_DEGRADE = new SwitchReason_T(_SR_SIGNAL_DEGRADE);
	public static final int _SR_AUTOMATIC_SWITCH = 5;
	public static final SwitchReason_T SR_AUTOMATIC_SWITCH = new SwitchReason_T(_SR_AUTOMATIC_SWITCH);
	public static final int _SR_MANUAL = 6;
	public static final SwitchReason_T SR_MANUAL = new SwitchReason_T(_SR_MANUAL);
	public int value()
	{
		return value;
	}
	public static SwitchReason_T from_int(int value)
	{
		switch (value) {
			case _SR_NA: return SR_NA;
			case _SR_RESTORED: return SR_RESTORED;
			case _SR_SIGNAL_FAIL: return SR_SIGNAL_FAIL;
			case _SR_SIGNAL_MISMATCH: return SR_SIGNAL_MISMATCH;
			case _SR_SIGNAL_DEGRADE: return SR_SIGNAL_DEGRADE;
			case _SR_AUTOMATIC_SWITCH: return SR_AUTOMATIC_SWITCH;
			case _SR_MANUAL: return SR_MANUAL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SR_NA: return "SR_NA";
			case _SR_RESTORED: return "SR_RESTORED";
			case _SR_SIGNAL_FAIL: return "SR_SIGNAL_FAIL";
			case _SR_SIGNAL_MISMATCH: return "SR_SIGNAL_MISMATCH";
			case _SR_SIGNAL_DEGRADE: return "SR_SIGNAL_DEGRADE";
			case _SR_AUTOMATIC_SWITCH: return "SR_AUTOMATIC_SWITCH";
			case _SR_MANUAL: return "SR_MANUAL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SwitchReason_T(int i)
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
