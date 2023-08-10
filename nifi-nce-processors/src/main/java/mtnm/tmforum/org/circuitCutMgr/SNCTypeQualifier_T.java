package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "SNCTypeQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _SNC = 0;
	public static final SNCTypeQualifier_T SNC = new SNCTypeQualifier_T(_SNC);
	public static final int _PREFAB_SNC = 1;
	public static final SNCTypeQualifier_T PREFAB_SNC = new SNCTypeQualifier_T(_PREFAB_SNC);
	public int value()
	{
		return value;
	}
	public static SNCTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _SNC: return SNC;
			case _PREFAB_SNC: return PREFAB_SNC;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SNC: return "SNC";
			case _PREFAB_SNC: return "PREFAB_SNC";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SNCTypeQualifier_T(int i)
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
