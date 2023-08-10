package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL enum "TPorMFDorFDFrQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPorMFDorFDFrQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _aTP = 0;
	public static final TPorMFDorFDFrQualifier_T aTP = new TPorMFDorFDFrQualifier_T(_aTP);
	public static final int _aMFD = 1;
	public static final TPorMFDorFDFrQualifier_T aMFD = new TPorMFDorFDFrQualifier_T(_aMFD);
	public static final int _aFDFr = 2;
	public static final TPorMFDorFDFrQualifier_T aFDFr = new TPorMFDorFDFrQualifier_T(_aFDFr);
	public int value()
	{
		return value;
	}
	public static TPorMFDorFDFrQualifier_T from_int(int value)
	{
		switch (value) {
			case _aTP: return aTP;
			case _aMFD: return aMFD;
			case _aFDFr: return aFDFr;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _aTP: return "aTP";
			case _aMFD: return "aMFD";
			case _aFDFr: return "aFDFr";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPorMFDorFDFrQualifier_T(int i)
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
