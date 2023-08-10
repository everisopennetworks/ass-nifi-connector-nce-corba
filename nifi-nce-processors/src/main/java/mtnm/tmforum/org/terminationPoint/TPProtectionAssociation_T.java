package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "TPProtectionAssociation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPProtectionAssociation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TPPA_NA = 0;
	public static final TPProtectionAssociation_T TPPA_NA = new TPProtectionAssociation_T(_TPPA_NA);
	public static final int _TPPA_PSR_RELATED = 1;
	public static final TPProtectionAssociation_T TPPA_PSR_RELATED = new TPProtectionAssociation_T(_TPPA_PSR_RELATED);
	public int value()
	{
		return value;
	}
	public static TPProtectionAssociation_T from_int(int value)
	{
		switch (value) {
			case _TPPA_NA: return TPPA_NA;
			case _TPPA_PSR_RELATED: return TPPA_PSR_RELATED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TPPA_NA: return "TPPA_NA";
			case _TPPA_PSR_RELATED: return "TPPA_PSR_RELATED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPProtectionAssociation_T(int i)
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
