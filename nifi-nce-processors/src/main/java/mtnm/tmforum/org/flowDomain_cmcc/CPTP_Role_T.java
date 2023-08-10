package mtnm.tmforum.org.flowDomain_cmcc;
/**
 * Generated from IDL enum "CPTP_Role_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CPTP_Role_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _CPTPR_FD_EDGE = 0;
	public static final CPTP_Role_T CPTPR_FD_EDGE = new CPTP_Role_T(_CPTPR_FD_EDGE);
	public static final int _CPTPR_FD_INTERNAL = 1;
	public static final CPTP_Role_T CPTPR_FD_INTERNAL = new CPTP_Role_T(_CPTPR_FD_INTERNAL);
	public static final int _CPTPR_ALL = 2;
	public static final CPTP_Role_T CPTPR_ALL = new CPTP_Role_T(_CPTPR_ALL);
	public int value()
	{
		return value;
	}
	public static CPTP_Role_T from_int(int value)
	{
		switch (value) {
			case _CPTPR_FD_EDGE: return CPTPR_FD_EDGE;
			case _CPTPR_FD_INTERNAL: return CPTPR_FD_INTERNAL;
			case _CPTPR_ALL: return CPTPR_ALL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _CPTPR_FD_EDGE: return "CPTPR_FD_EDGE";
			case _CPTPR_FD_INTERNAL: return "CPTPR_FD_INTERNAL";
			case _CPTPR_ALL: return "CPTPR_ALL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected CPTP_Role_T(int i)
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
