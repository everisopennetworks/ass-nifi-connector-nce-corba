package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "MulticastMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MulticastMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NEAREST_NA = 0;
	public static final MulticastMode_T NEAREST_NA = new MulticastMode_T(_NEAREST_NA);
	public static final int _NEAREST_BRIDGE = 1;
	public static final MulticastMode_T NEAREST_BRIDGE = new MulticastMode_T(_NEAREST_BRIDGE);
	public static final int _NEAREST_NON_TPMR_BRIDGE = 2;
	public static final MulticastMode_T NEAREST_NON_TPMR_BRIDGE = new MulticastMode_T(_NEAREST_NON_TPMR_BRIDGE);
	public static final int _NEAREST_CUSTOMER_BRIDGE = 3;
	public static final MulticastMode_T NEAREST_CUSTOMER_BRIDGE = new MulticastMode_T(_NEAREST_CUSTOMER_BRIDGE);
	public int value()
	{
		return value;
	}
	public static MulticastMode_T from_int(int value)
	{
		switch (value) {
			case _NEAREST_NA: return NEAREST_NA;
			case _NEAREST_BRIDGE: return NEAREST_BRIDGE;
			case _NEAREST_NON_TPMR_BRIDGE: return NEAREST_NON_TPMR_BRIDGE;
			case _NEAREST_CUSTOMER_BRIDGE: return NEAREST_CUSTOMER_BRIDGE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NEAREST_NA: return "NEAREST_NA";
			case _NEAREST_BRIDGE: return "NEAREST_BRIDGE";
			case _NEAREST_NON_TPMR_BRIDGE: return "NEAREST_NON_TPMR_BRIDGE";
			case _NEAREST_CUSTOMER_BRIDGE: return "NEAREST_CUSTOMER_BRIDGE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MulticastMode_T(int i)
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
