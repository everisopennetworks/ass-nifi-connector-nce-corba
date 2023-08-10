package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "SNCState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _SNCS_NONEXISTENT = 0;
	public static final SNCState_T SNCS_NONEXISTENT = new SNCState_T(_SNCS_NONEXISTENT);
	public static final int _SNCS_PENDING = 1;
	public static final SNCState_T SNCS_PENDING = new SNCState_T(_SNCS_PENDING);
	public static final int _SNCS_ACTIVE = 2;
	public static final SNCState_T SNCS_ACTIVE = new SNCState_T(_SNCS_ACTIVE);
	public static final int _SNCS_PARTIAL = 3;
	public static final SNCState_T SNCS_PARTIAL = new SNCState_T(_SNCS_PARTIAL);
	public int value()
	{
		return value;
	}
	public static SNCState_T from_int(int value)
	{
		switch (value) {
			case _SNCS_NONEXISTENT: return SNCS_NONEXISTENT;
			case _SNCS_PENDING: return SNCS_PENDING;
			case _SNCS_ACTIVE: return SNCS_ACTIVE;
			case _SNCS_PARTIAL: return SNCS_PARTIAL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SNCS_NONEXISTENT: return "SNCS_NONEXISTENT";
			case _SNCS_PENDING: return "SNCS_PENDING";
			case _SNCS_ACTIVE: return "SNCS_ACTIVE";
			case _SNCS_PARTIAL: return "SNCS_PARTIAL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SNCState_T(int i)
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
