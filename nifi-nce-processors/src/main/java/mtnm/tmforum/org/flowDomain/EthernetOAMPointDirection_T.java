package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "EthernetOAMPointDirection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMPointDirection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _EOPD_BI = 0;
	public static final EthernetOAMPointDirection_T EOPD_BI = new EthernetOAMPointDirection_T(_EOPD_BI);
	public static final int _EOPD_INGRESS = 1;
	public static final EthernetOAMPointDirection_T EOPD_INGRESS = new EthernetOAMPointDirection_T(_EOPD_INGRESS);
	public static final int _EOPD_EGRESS = 2;
	public static final EthernetOAMPointDirection_T EOPD_EGRESS = new EthernetOAMPointDirection_T(_EOPD_EGRESS);
	public int value()
	{
		return value;
	}
	public static EthernetOAMPointDirection_T from_int(int value)
	{
		switch (value) {
			case _EOPD_BI: return EOPD_BI;
			case _EOPD_INGRESS: return EOPD_INGRESS;
			case _EOPD_EGRESS: return EOPD_EGRESS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EOPD_BI: return "EOPD_BI";
			case _EOPD_INGRESS: return "EOPD_INGRESS";
			case _EOPD_EGRESS: return "EOPD_EGRESS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetOAMPointDirection_T(int i)
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
