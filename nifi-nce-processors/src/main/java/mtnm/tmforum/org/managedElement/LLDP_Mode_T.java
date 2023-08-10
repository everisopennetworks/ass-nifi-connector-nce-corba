package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "LLDP_Mode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LLDP_Mode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _LLDP_DISABLE = 0;
	public static final LLDP_Mode_T LLDP_DISABLE = new LLDP_Mode_T(_LLDP_DISABLE);
	public static final int _LLDP_TRANSMIT = 1;
	public static final LLDP_Mode_T LLDP_TRANSMIT = new LLDP_Mode_T(_LLDP_TRANSMIT);
	public static final int _LLDP_RECEIVE = 2;
	public static final LLDP_Mode_T LLDP_RECEIVE = new LLDP_Mode_T(_LLDP_RECEIVE);
	public static final int _LLDP_RECEIVE_AND_TRANSMIT = 3;
	public static final LLDP_Mode_T LLDP_RECEIVE_AND_TRANSMIT = new LLDP_Mode_T(_LLDP_RECEIVE_AND_TRANSMIT);
	public int value()
	{
		return value;
	}
	public static LLDP_Mode_T from_int(int value)
	{
		switch (value) {
			case _LLDP_DISABLE: return LLDP_DISABLE;
			case _LLDP_TRANSMIT: return LLDP_TRANSMIT;
			case _LLDP_RECEIVE: return LLDP_RECEIVE;
			case _LLDP_RECEIVE_AND_TRANSMIT: return LLDP_RECEIVE_AND_TRANSMIT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _LLDP_DISABLE: return "LLDP_DISABLE";
			case _LLDP_TRANSMIT: return "LLDP_TRANSMIT";
			case _LLDP_RECEIVE: return "LLDP_RECEIVE";
			case _LLDP_RECEIVE_AND_TRANSMIT: return "LLDP_RECEIVE_AND_TRANSMIT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected LLDP_Mode_T(int i)
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
