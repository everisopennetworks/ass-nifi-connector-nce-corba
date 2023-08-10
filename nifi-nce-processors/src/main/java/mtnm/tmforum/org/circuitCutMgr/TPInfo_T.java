package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "TPInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TPInfo_T(){}
	public int NEID;
	public mtnm.tmforum.org.circuitCutMgr.PortInfo_T portInfo;
	public mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T tsInfo;
	public TPInfo_T(int NEID, mtnm.tmforum.org.circuitCutMgr.PortInfo_T portInfo, mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T tsInfo)
	{
		this.NEID = NEID;
		this.portInfo = portInfo;
		this.tsInfo = tsInfo;
	}
}
