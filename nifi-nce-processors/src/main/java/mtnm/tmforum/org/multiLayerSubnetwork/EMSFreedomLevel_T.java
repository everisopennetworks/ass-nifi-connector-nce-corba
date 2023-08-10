package mtnm.tmforum.org.multiLayerSubnetwork;
/**
 * Generated from IDL enum "EMSFreedomLevel_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EMSFreedomLevel_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _EMSFL_CC_AT_SNC_LAYER = 0;
	public static final EMSFreedomLevel_T EMSFL_CC_AT_SNC_LAYER = new EMSFreedomLevel_T(_EMSFL_CC_AT_SNC_LAYER);
	public static final int _EMSFL_TERMINATE_AND_MAP = 1;
	public static final EMSFreedomLevel_T EMSFL_TERMINATE_AND_MAP = new EMSFreedomLevel_T(_EMSFL_TERMINATE_AND_MAP);
	public static final int _EMSFL_HIGHER_ORDER_SNCS = 2;
	public static final EMSFreedomLevel_T EMSFL_HIGHER_ORDER_SNCS = new EMSFreedomLevel_T(_EMSFL_HIGHER_ORDER_SNCS);
	public static final int _EMSFL_RECONFIGURATION = 3;
	public static final EMSFreedomLevel_T EMSFL_RECONFIGURATION = new EMSFreedomLevel_T(_EMSFL_RECONFIGURATION);
	public int value()
	{
		return value;
	}
	public static EMSFreedomLevel_T from_int(int value)
	{
		switch (value) {
			case _EMSFL_CC_AT_SNC_LAYER: return EMSFL_CC_AT_SNC_LAYER;
			case _EMSFL_TERMINATE_AND_MAP: return EMSFL_TERMINATE_AND_MAP;
			case _EMSFL_HIGHER_ORDER_SNCS: return EMSFL_HIGHER_ORDER_SNCS;
			case _EMSFL_RECONFIGURATION: return EMSFL_RECONFIGURATION;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EMSFL_CC_AT_SNC_LAYER: return "EMSFL_CC_AT_SNC_LAYER";
			case _EMSFL_TERMINATE_AND_MAP: return "EMSFL_TERMINATE_AND_MAP";
			case _EMSFL_HIGHER_ORDER_SNCS: return "EMSFL_HIGHER_ORDER_SNCS";
			case _EMSFL_RECONFIGURATION: return "EMSFL_RECONFIGURATION";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EMSFreedomLevel_T(int i)
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
