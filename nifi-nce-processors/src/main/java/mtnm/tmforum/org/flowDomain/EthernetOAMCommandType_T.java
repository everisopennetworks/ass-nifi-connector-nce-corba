package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "EthernetOAMCommandType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMCommandType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _EOCT_CC = 0;
	public static final EthernetOAMCommandType_T EOCT_CC = new EthernetOAMCommandType_T(_EOCT_CC);
	public static final int _EOCT_LB = 1;
	public static final EthernetOAMCommandType_T EOCT_LB = new EthernetOAMCommandType_T(_EOCT_LB);
	public static final int _EOCT_LT = 2;
	public static final EthernetOAMCommandType_T EOCT_LT = new EthernetOAMCommandType_T(_EOCT_LT);
	public int value()
	{
		return value;
	}
	public static EthernetOAMCommandType_T from_int(int value)
	{
		switch (value) {
			case _EOCT_CC: return EOCT_CC;
			case _EOCT_LB: return EOCT_LB;
			case _EOCT_LT: return EOCT_LT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EOCT_CC: return "EOCT_CC";
			case _EOCT_LB: return "EOCT_LB";
			case _EOCT_LT: return "EOCT_LT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetOAMCommandType_T(int i)
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
