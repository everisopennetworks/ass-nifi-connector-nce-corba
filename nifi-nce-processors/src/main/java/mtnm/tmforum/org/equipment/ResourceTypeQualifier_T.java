package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "ResourceTypeQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ResourceTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _EQTROOM = 0;
	public static final ResourceTypeQualifier_T EQTROOM = new ResourceTypeQualifier_T(_EQTROOM);
	public static final int _CABINET = 1;
	public static final ResourceTypeQualifier_T CABINET = new ResourceTypeQualifier_T(_CABINET);
	public static final int _SHELF = 2;
	public static final ResourceTypeQualifier_T SHELF = new ResourceTypeQualifier_T(_SHELF);
	public int value()
	{
		return value;
	}
	public static ResourceTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _EQTROOM: return EQTROOM;
			case _CABINET: return CABINET;
			case _SHELF: return SHELF;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EQTROOM: return "EQTROOM";
			case _CABINET: return "CABINET";
			case _SHELF: return "SHELF";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ResourceTypeQualifier_T(int i)
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
