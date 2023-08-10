package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "TerminationMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TerminationMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TM_NA = 0;
	public static final TerminationMode_T TM_NA = new TerminationMode_T(_TM_NA);
	public static final int _TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING = 1;
	public static final TerminationMode_T TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING = new TerminationMode_T(_TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING);
	public static final int _TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING = 2;
	public static final TerminationMode_T TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING = new TerminationMode_T(_TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING);
	public int value()
	{
		return value;
	}
	public static TerminationMode_T from_int(int value)
	{
		switch (value) {
			case _TM_NA: return TM_NA;
			case _TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING: return TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING;
			case _TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING: return TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TM_NA: return "TM_NA";
			case _TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING: return "TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING";
			case _TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING: return "TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TerminationMode_T(int i)
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
