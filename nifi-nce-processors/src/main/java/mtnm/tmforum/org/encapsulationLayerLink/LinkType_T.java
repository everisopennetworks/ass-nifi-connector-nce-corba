package mtnm.tmforum.org.encapsulationLayerLink;
/**
 * Generated from IDL enum "LinkType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LinkType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _LT_POINT_TO_POINT = 0;
	public static final LinkType_T LT_POINT_TO_POINT = new LinkType_T(_LT_POINT_TO_POINT);
	public static final int _LT_POINT_TO_MULTIPOINT = 1;
	public static final LinkType_T LT_POINT_TO_MULTIPOINT = new LinkType_T(_LT_POINT_TO_MULTIPOINT);
	public static final int _LT_MULTIPOINT = 2;
	public static final LinkType_T LT_MULTIPOINT = new LinkType_T(_LT_MULTIPOINT);
	public int value()
	{
		return value;
	}
	public static LinkType_T from_int(int value)
	{
		switch (value) {
			case _LT_POINT_TO_POINT: return LT_POINT_TO_POINT;
			case _LT_POINT_TO_MULTIPOINT: return LT_POINT_TO_MULTIPOINT;
			case _LT_MULTIPOINT: return LT_MULTIPOINT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _LT_POINT_TO_POINT: return "LT_POINT_TO_POINT";
			case _LT_POINT_TO_MULTIPOINT: return "LT_POINT_TO_MULTIPOINT";
			case _LT_MULTIPOINT: return "LT_MULTIPOINT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LinkType_T(int i)
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
