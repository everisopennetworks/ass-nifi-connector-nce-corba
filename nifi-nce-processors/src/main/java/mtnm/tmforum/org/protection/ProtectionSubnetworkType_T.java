package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionSubnetworkType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetworkType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _PSNT_MSP_1_PLUS_1 = 0;
	public static final ProtectionSubnetworkType_T PSNT_MSP_1_PLUS_1 = new ProtectionSubnetworkType_T(_PSNT_MSP_1_PLUS_1);
	public static final int _PSNT_MSP_M_FOR_N = 1;
	public static final ProtectionSubnetworkType_T PSNT_MSP_M_FOR_N = new ProtectionSubnetworkType_T(_PSNT_MSP_M_FOR_N);
	public static final int _PSNT_2_FIBER_ULSR = 2;
	public static final ProtectionSubnetworkType_T PSNT_2_FIBER_ULSR = new ProtectionSubnetworkType_T(_PSNT_2_FIBER_ULSR);
	public static final int _PSNT_2_FIBER_BLSR = 3;
	public static final ProtectionSubnetworkType_T PSNT_2_FIBER_BLSR = new ProtectionSubnetworkType_T(_PSNT_2_FIBER_BLSR);
	public static final int _PSNT_4_FIBER_BLSR = 4;
	public static final ProtectionSubnetworkType_T PSNT_4_FIBER_BLSR = new ProtectionSubnetworkType_T(_PSNT_4_FIBER_BLSR);
	public static final int _PSNT_USNCP = 5;
	public static final ProtectionSubnetworkType_T PSNT_USNCP = new ProtectionSubnetworkType_T(_PSNT_USNCP);
	public static final int _PSNT_BSNCP = 6;
	public static final ProtectionSubnetworkType_T PSNT_BSNCP = new ProtectionSubnetworkType_T(_PSNT_BSNCP);
	public static final int _PSNT_UPP = 7;
	public static final ProtectionSubnetworkType_T PSNT_UPP = new ProtectionSubnetworkType_T(_PSNT_UPP);
	public static final int _PSNT_BPP = 8;
	public static final ProtectionSubnetworkType_T PSNT_BPP = new ProtectionSubnetworkType_T(_PSNT_BPP);
	public static final int _PSNT_NP = 9;
	public static final ProtectionSubnetworkType_T PSNT_NP = new ProtectionSubnetworkType_T(_PSNT_NP);
	public static final int _PSNT_SNC_NODE = 10;
	public static final ProtectionSubnetworkType_T PSNT_SNC_NODE = new ProtectionSubnetworkType_T(_PSNT_SNC_NODE);
	public static final int _PSNT_NPL = 11;
	public static final ProtectionSubnetworkType_T PSNT_NPL = new ProtectionSubnetworkType_T(_PSNT_NPL);
	public static final int _PSNT_NPR = 12;
	public static final ProtectionSubnetworkType_T PSNT_NPR = new ProtectionSubnetworkType_T(_PSNT_NPR);
	public int value()
	{
		return value;
	}
	public static ProtectionSubnetworkType_T from_int(int value)
	{
		switch (value) {
			case _PSNT_MSP_1_PLUS_1: return PSNT_MSP_1_PLUS_1;
			case _PSNT_MSP_M_FOR_N: return PSNT_MSP_M_FOR_N;
			case _PSNT_2_FIBER_ULSR: return PSNT_2_FIBER_ULSR;
			case _PSNT_2_FIBER_BLSR: return PSNT_2_FIBER_BLSR;
			case _PSNT_4_FIBER_BLSR: return PSNT_4_FIBER_BLSR;
			case _PSNT_USNCP: return PSNT_USNCP;
			case _PSNT_BSNCP: return PSNT_BSNCP;
			case _PSNT_UPP: return PSNT_UPP;
			case _PSNT_BPP: return PSNT_BPP;
			case _PSNT_NP: return PSNT_NP;
			case _PSNT_SNC_NODE: return PSNT_SNC_NODE;
			case _PSNT_NPL: return PSNT_NPL;
			case _PSNT_NPR: return PSNT_NPR;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PSNT_MSP_1_PLUS_1: return "PSNT_MSP_1_PLUS_1";
			case _PSNT_MSP_M_FOR_N: return "PSNT_MSP_M_FOR_N";
			case _PSNT_2_FIBER_ULSR: return "PSNT_2_FIBER_ULSR";
			case _PSNT_2_FIBER_BLSR: return "PSNT_2_FIBER_BLSR";
			case _PSNT_4_FIBER_BLSR: return "PSNT_4_FIBER_BLSR";
			case _PSNT_USNCP: return "PSNT_USNCP";
			case _PSNT_BSNCP: return "PSNT_BSNCP";
			case _PSNT_UPP: return "PSNT_UPP";
			case _PSNT_BPP: return "PSNT_BPP";
			case _PSNT_NP: return "PSNT_NP";
			case _PSNT_SNC_NODE: return "PSNT_SNC_NODE";
			case _PSNT_NPL: return "PSNT_NPL";
			case _PSNT_NPR: return "PSNT_NPR";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionSubnetworkType_T(int i)
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
