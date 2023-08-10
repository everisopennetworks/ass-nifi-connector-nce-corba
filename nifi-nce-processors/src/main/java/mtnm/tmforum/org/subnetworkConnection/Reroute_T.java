package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "Reroute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Reroute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _RR_NA = 0;
	public static final Reroute_T RR_NA = new Reroute_T(_RR_NA);
	public static final int _RR_NO = 1;
	public static final Reroute_T RR_NO = new Reroute_T(_RR_NO);
	public static final int _RR_YES = 2;
	public static final Reroute_T RR_YES = new Reroute_T(_RR_YES);
	public int value()
	{
		return value;
	}
	public static Reroute_T from_int(int value)
	{
		switch (value) {
			case _RR_NA: return RR_NA;
			case _RR_NO: return RR_NO;
			case _RR_YES: return RR_YES;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _RR_NA: return "RR_NA";
			case _RR_NO: return "RR_NO";
			case _RR_YES: return "RR_YES";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Reroute_T(int i)
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
