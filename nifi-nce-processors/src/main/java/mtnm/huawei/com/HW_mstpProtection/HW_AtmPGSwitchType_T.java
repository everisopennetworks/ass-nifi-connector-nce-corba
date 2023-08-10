package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmPGSwitchType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSwitchType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_AST_NA = 0;
	public static final HW_AtmPGSwitchType_T HW_AST_NA = new HW_AtmPGSwitchType_T(_HW_AST_NA);
	public static final int _HW_AST_SINGLE_END = 1;
	public static final HW_AtmPGSwitchType_T HW_AST_SINGLE_END = new HW_AtmPGSwitchType_T(_HW_AST_SINGLE_END);
	public static final int _HW_AST_BI_END = 2;
	public static final HW_AtmPGSwitchType_T HW_AST_BI_END = new HW_AtmPGSwitchType_T(_HW_AST_BI_END);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGSwitchType_T from_int(int value)
	{
		switch (value) {
			case _HW_AST_NA: return HW_AST_NA;
			case _HW_AST_SINGLE_END: return HW_AST_SINGLE_END;
			case _HW_AST_BI_END: return HW_AST_BI_END;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_AST_NA: return "HW_AST_NA";
			case _HW_AST_SINGLE_END: return "HW_AST_SINGLE_END";
			case _HW_AST_BI_END: return "HW_AST_BI_END";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGSwitchType_T(int i)
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
