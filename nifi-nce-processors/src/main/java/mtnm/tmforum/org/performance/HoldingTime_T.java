package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "HoldingTime_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HoldingTime_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HoldingTime_T(){}
	public short storeTime24hr;
	public short storeTime15min;
	public HoldingTime_T(short storeTime24hr, short storeTime15min)
	{
		this.storeTime24hr = storeTime24hr;
		this.storeTime15min = storeTime15min;
	}
}
