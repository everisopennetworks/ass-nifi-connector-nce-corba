package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ReversionMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ReversionMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _RM_UNKNOWN = 0;
	public static final ReversionMode_T RM_UNKNOWN = new ReversionMode_T(_RM_UNKNOWN);
	public static final int _RM_NON_REVERTIVE = 1;
	public static final ReversionMode_T RM_NON_REVERTIVE = new ReversionMode_T(_RM_NON_REVERTIVE);
	public static final int _RM_REVERTIVE = 2;
	public static final ReversionMode_T RM_REVERTIVE = new ReversionMode_T(_RM_REVERTIVE);
	public int value()
	{
		return value;
	}
	public static ReversionMode_T from_int(int value)
	{
		switch (value) {
			case _RM_UNKNOWN: return RM_UNKNOWN;
			case _RM_NON_REVERTIVE: return RM_NON_REVERTIVE;
			case _RM_REVERTIVE: return RM_REVERTIVE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _RM_UNKNOWN: return "RM_UNKNOWN";
			case _RM_NON_REVERTIVE: return "RM_NON_REVERTIVE";
			case _RM_REVERTIVE: return "RM_REVERTIVE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ReversionMode_T(int i)
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
