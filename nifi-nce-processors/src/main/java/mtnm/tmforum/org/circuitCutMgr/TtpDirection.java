package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "TtpDirection".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TtpDirection
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _AEND = 0;
	public static final TtpDirection AEND = new TtpDirection(_AEND);
	public static final int _ZEND = 1;
	public static final TtpDirection ZEND = new TtpDirection(_ZEND);
	public static final int _BI = 2;
	public static final TtpDirection BI = new TtpDirection(_BI);
	public int value()
	{
		return value;
	}
	public static TtpDirection from_int(int value)
	{
		switch (value) {
			case _AEND: return AEND;
			case _ZEND: return ZEND;
			case _BI: return BI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _AEND: return "AEND";
			case _ZEND: return "ZEND";
			case _BI: return "BI";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TtpDirection(int i)
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
