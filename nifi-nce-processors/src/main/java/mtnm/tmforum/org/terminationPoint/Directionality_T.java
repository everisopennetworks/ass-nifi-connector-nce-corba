package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "Directionality_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Directionality_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _D_NA = 0;
	public static final Directionality_T D_NA = new Directionality_T(_D_NA);
	public static final int _D_BIDIRECTIONAL = 1;
	public static final Directionality_T D_BIDIRECTIONAL = new Directionality_T(_D_BIDIRECTIONAL);
	public static final int _D_SOURCE = 2;
	public static final Directionality_T D_SOURCE = new Directionality_T(_D_SOURCE);
	public static final int _D_SINK = 3;
	public static final Directionality_T D_SINK = new Directionality_T(_D_SINK);
	public int value()
	{
		return value;
	}
	public static Directionality_T from_int(int value)
	{
		switch (value) {
			case _D_NA: return D_NA;
			case _D_BIDIRECTIONAL: return D_BIDIRECTIONAL;
			case _D_SOURCE: return D_SOURCE;
			case _D_SINK: return D_SINK;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _D_NA: return "D_NA";
			case _D_BIDIRECTIONAL: return "D_BIDIRECTIONAL";
			case _D_SOURCE: return "D_SOURCE";
			case _D_SINK: return "D_SINK";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Directionality_T(int i)
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
