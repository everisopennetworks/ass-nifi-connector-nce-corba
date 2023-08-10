package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "TimeSlotInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TimeSlotInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TimeSlotInfo_T(){}
	public int vc4No;
	public int[] timeslots;
	public TimeSlotInfo_T(int vc4No, int[] timeslots)
	{
		this.vc4No = vc4No;
		this.timeslots = timeslots;
	}
}
