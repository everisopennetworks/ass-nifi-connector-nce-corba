package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_AtmPGSwitchDirect_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSwitchDirect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _HW_ASD_NA = 0;
	public static final HW_AtmPGSwitchDirect_T HW_ASD_NA = new HW_AtmPGSwitchDirect_T(_HW_ASD_NA);
	public static final int _HW_ASD_SRC = 1;
	public static final HW_AtmPGSwitchDirect_T HW_ASD_SRC = new HW_AtmPGSwitchDirect_T(_HW_ASD_SRC);
	public static final int _HW_ASD_SNK = 2;
	public static final HW_AtmPGSwitchDirect_T HW_ASD_SNK = new HW_AtmPGSwitchDirect_T(_HW_ASD_SNK);
	public static final int _HW_ASD_BI = 3;
	public static final HW_AtmPGSwitchDirect_T HW_ASD_BI = new HW_AtmPGSwitchDirect_T(_HW_ASD_BI);
	public int value()
	{
		return value;
	}
	public static HW_AtmPGSwitchDirect_T from_int(int value)
	{
		switch (value) {
			case _HW_ASD_NA: return HW_ASD_NA;
			case _HW_ASD_SRC: return HW_ASD_SRC;
			case _HW_ASD_SNK: return HW_ASD_SNK;
			case _HW_ASD_BI: return HW_ASD_BI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _HW_ASD_NA: return "HW_ASD_NA";
			case _HW_ASD_SRC: return "HW_ASD_SRC";
			case _HW_ASD_SNK: return "HW_ASD_SNK";
			case _HW_ASD_BI: return "HW_ASD_BI";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HW_AtmPGSwitchDirect_T(int i)
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
