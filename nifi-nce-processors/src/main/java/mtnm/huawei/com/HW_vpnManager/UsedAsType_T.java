package mtnm.huawei.com.HW_vpnManager;
/**
 * Generated from IDL enum "UsedAsType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class UsedAsType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _UA_WORKING = 0;
	public static final UsedAsType_T UA_WORKING = new UsedAsType_T(_UA_WORKING);
	public static final int _UA_PROTECTION = 1;
	public static final UsedAsType_T UA_PROTECTION = new UsedAsType_T(_UA_PROTECTION);
	public static final int _UA_DNI = 2;
	public static final UsedAsType_T UA_DNI = new UsedAsType_T(_UA_DNI);
	public int value()
	{
		return value;
	}
	public static UsedAsType_T from_int(int value)
	{
		switch (value) {
			case _UA_WORKING: return UA_WORKING;
			case _UA_PROTECTION: return UA_PROTECTION;
			case _UA_DNI: return UA_DNI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _UA_WORKING: return "UA_WORKING";
			case _UA_PROTECTION: return "UA_PROTECTION";
			case _UA_DNI: return "UA_DNI";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected UsedAsType_T(int i)
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
