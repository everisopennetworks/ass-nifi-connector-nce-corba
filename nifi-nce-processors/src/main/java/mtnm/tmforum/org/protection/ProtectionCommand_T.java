package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionCommand_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionCommand_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _PC_CLEAR = 0;
	public static final ProtectionCommand_T PC_CLEAR = new ProtectionCommand_T(_PC_CLEAR);
	public static final int _PC_LOCKOUT = 1;
	public static final ProtectionCommand_T PC_LOCKOUT = new ProtectionCommand_T(_PC_LOCKOUT);
	public static final int _PC_FORCED_SWITCH = 2;
	public static final ProtectionCommand_T PC_FORCED_SWITCH = new ProtectionCommand_T(_PC_FORCED_SWITCH);
	public static final int _PC_MANUAL_SWITCH = 3;
	public static final ProtectionCommand_T PC_MANUAL_SWITCH = new ProtectionCommand_T(_PC_MANUAL_SWITCH);
	public static final int _PC_EXERCISER = 4;
	public static final ProtectionCommand_T PC_EXERCISER = new ProtectionCommand_T(_PC_EXERCISER);
	public int value()
	{
		return value;
	}
	public static ProtectionCommand_T from_int(int value)
	{
		switch (value) {
			case _PC_CLEAR: return PC_CLEAR;
			case _PC_LOCKOUT: return PC_LOCKOUT;
			case _PC_FORCED_SWITCH: return PC_FORCED_SWITCH;
			case _PC_MANUAL_SWITCH: return PC_MANUAL_SWITCH;
			case _PC_EXERCISER: return PC_EXERCISER;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PC_CLEAR: return "PC_CLEAR";
			case _PC_LOCKOUT: return "PC_LOCKOUT";
			case _PC_FORCED_SWITCH: return "PC_FORCED_SWITCH";
			case _PC_MANUAL_SWITCH: return "PC_MANUAL_SWITCH";
			case _PC_EXERCISER: return "PC_EXERCISER";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionCommand_T(int i)
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
