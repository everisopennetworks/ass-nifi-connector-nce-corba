package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "ConnectionDirection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectionDirection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _CD_UNI = 0;
	public static final ConnectionDirection_T CD_UNI = new ConnectionDirection_T(_CD_UNI);
	public static final int _CD_BI = 1;
	public static final ConnectionDirection_T CD_BI = new ConnectionDirection_T(_CD_BI);
	public int value()
	{
		return value;
	}
	public static ConnectionDirection_T from_int(int value)
	{
		switch (value) {
			case _CD_UNI: return CD_UNI;
			case _CD_BI: return CD_BI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _CD_UNI: return "CD_UNI";
			case _CD_BI: return "CD_BI";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConnectionDirection_T(int i)
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
