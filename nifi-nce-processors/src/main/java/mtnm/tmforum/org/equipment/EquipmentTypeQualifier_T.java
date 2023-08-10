package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "EquipmentTypeQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EquipmentTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _EQT = 0;
	public static final EquipmentTypeQualifier_T EQT = new EquipmentTypeQualifier_T(_EQT);
	public static final int _EQT_HOLDER = 1;
	public static final EquipmentTypeQualifier_T EQT_HOLDER = new EquipmentTypeQualifier_T(_EQT_HOLDER);
	public int value()
	{
		return value;
	}
	public static EquipmentTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _EQT: return EQT;
			case _EQT_HOLDER: return EQT_HOLDER;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EQT: return "EQT";
			case _EQT_HOLDER: return "EQT_HOLDER";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EquipmentTypeQualifier_T(int i)
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
