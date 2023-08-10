package mtnm.tmforum.org.flowDomain_cmcc;
/**
 * Generated from IDL enum "ConnectivityRequirement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectivityRequirement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _CR_IGNORE = 0;
	public static final ConnectivityRequirement_T CR_IGNORE = new ConnectivityRequirement_T(_CR_IGNORE);
	public static final int _CR_REJECT = 1;
	public static final ConnectivityRequirement_T CR_REJECT = new ConnectivityRequirement_T(_CR_REJECT);
	public int value()
	{
		return value;
	}
	public static ConnectivityRequirement_T from_int(int value)
	{
		switch (value) {
			case _CR_IGNORE: return CR_IGNORE;
			case _CR_REJECT: return CR_REJECT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _CR_IGNORE: return "CR_IGNORE";
			case _CR_REJECT: return "CR_REJECT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConnectivityRequirement_T(int i)
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
