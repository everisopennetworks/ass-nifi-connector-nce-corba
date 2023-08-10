package mtnm.tmforum.org.performance;
/**
 * Generated from IDL enum "ActivityStatusEnum_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ActivityStatusEnum_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NOT_STARTED = 0;
	public static final ActivityStatusEnum_T NOT_STARTED = new ActivityStatusEnum_T(_NOT_STARTED);
	public static final int _ACTIVE = 1;
	public static final ActivityStatusEnum_T ACTIVE = new ActivityStatusEnum_T(_ACTIVE);
	public static final int _SUSPENDED = 2;
	public static final ActivityStatusEnum_T SUSPENDED = new ActivityStatusEnum_T(_SUSPENDED);
	public int value()
	{
		return value;
	}
	public static ActivityStatusEnum_T from_int(int value)
	{
		switch (value) {
			case _NOT_STARTED: return NOT_STARTED;
			case _ACTIVE: return ACTIVE;
			case _SUSPENDED: return SUSPENDED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NOT_STARTED: return "NOT_STARTED";
			case _ACTIVE: return "ACTIVE";
			case _SUSPENDED: return "SUSPENDED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ActivityStatusEnum_T(int i)
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
