package mtnm.tmforum.org.performance;
/**
 * Generated from IDL enum "PMThresholdType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMThresholdType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TWM_HIGHEST = 0;
	public static final PMThresholdType_T TWM_HIGHEST = new PMThresholdType_T(_TWM_HIGHEST);
	public static final int _TWM_HIGH = 1;
	public static final PMThresholdType_T TWM_HIGH = new PMThresholdType_T(_TWM_HIGH);
	public static final int _TWM_LOW = 2;
	public static final PMThresholdType_T TWM_LOW = new PMThresholdType_T(_TWM_LOW);
	public static final int _TWM_LOWEST = 3;
	public static final PMThresholdType_T TWM_LOWEST = new PMThresholdType_T(_TWM_LOWEST);
	public int value()
	{
		return value;
	}
	public static PMThresholdType_T from_int(int value)
	{
		switch (value) {
			case _TWM_HIGHEST: return TWM_HIGHEST;
			case _TWM_HIGH: return TWM_HIGH;
			case _TWM_LOW: return TWM_LOW;
			case _TWM_LOWEST: return TWM_LOWEST;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TWM_HIGHEST: return "TWM_HIGHEST";
			case _TWM_HIGH: return "TWM_HIGH";
			case _TWM_LOW: return "TWM_LOW";
			case _TWM_LOWEST: return "TWM_LOWEST";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PMThresholdType_T(int i)
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
