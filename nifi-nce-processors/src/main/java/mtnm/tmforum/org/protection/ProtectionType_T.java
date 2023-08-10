package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _PT_MSP_APS = 0;
	public static final ProtectionType_T PT_MSP_APS = new ProtectionType_T(_PT_MSP_APS);
	public static final int _PT_SNCP = 1;
	public static final ProtectionType_T PT_SNCP = new ProtectionType_T(_PT_SNCP);
	public int value()
	{
		return value;
	}
	public static ProtectionType_T from_int(int value)
	{
		switch (value) {
			case _PT_MSP_APS: return PT_MSP_APS;
			case _PT_SNCP: return PT_SNCP;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PT_MSP_APS: return "PT_MSP_APS";
			case _PT_SNCP: return "PT_SNCP";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionType_T(int i)
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
