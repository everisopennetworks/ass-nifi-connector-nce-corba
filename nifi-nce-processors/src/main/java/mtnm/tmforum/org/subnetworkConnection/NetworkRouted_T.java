package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "NetworkRouted_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NetworkRouted_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NR_NA = 0;
	public static final NetworkRouted_T NR_NA = new NetworkRouted_T(_NR_NA);
	public static final int _NR_NO = 1;
	public static final NetworkRouted_T NR_NO = new NetworkRouted_T(_NR_NO);
	public static final int _NR_YES = 2;
	public static final NetworkRouted_T NR_YES = new NetworkRouted_T(_NR_YES);
	public int value()
	{
		return value;
	}
	public static NetworkRouted_T from_int(int value)
	{
		switch (value) {
			case _NR_NA: return NR_NA;
			case _NR_NO: return NR_NO;
			case _NR_YES: return NR_YES;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NR_NA: return "NR_NA";
			case _NR_NO: return "NR_NO";
			case _NR_YES: return "NR_YES";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NetworkRouted_T(int i)
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
