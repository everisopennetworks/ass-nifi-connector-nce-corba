package mtnm.tmforum.org.flowDomainFragment;
/**
 * Generated from IDL enum "FDFrType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _FDFRT_POINT_TO_POINT = 0;
	public static final FDFrType_T FDFRT_POINT_TO_POINT = new FDFrType_T(_FDFRT_POINT_TO_POINT);
	public static final int _FDFRT_POINT_TO_MULTIPOINT = 1;
	public static final FDFrType_T FDFRT_POINT_TO_MULTIPOINT = new FDFrType_T(_FDFRT_POINT_TO_MULTIPOINT);
	public static final int _FDFRT_MULTIPOINT = 2;
	public static final FDFrType_T FDFRT_MULTIPOINT = new FDFrType_T(_FDFRT_MULTIPOINT);
	public int value()
	{
		return value;
	}
	public static FDFrType_T from_int(int value)
	{
		switch (value) {
			case _FDFRT_POINT_TO_POINT: return FDFRT_POINT_TO_POINT;
			case _FDFRT_POINT_TO_MULTIPOINT: return FDFRT_POINT_TO_MULTIPOINT;
			case _FDFRT_MULTIPOINT: return FDFRT_MULTIPOINT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _FDFRT_POINT_TO_POINT: return "FDFRT_POINT_TO_POINT";
			case _FDFRT_POINT_TO_MULTIPOINT: return "FDFRT_POINT_TO_MULTIPOINT";
			case _FDFRT_MULTIPOINT: return "FDFRT_MULTIPOINT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FDFrType_T(int i)
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
