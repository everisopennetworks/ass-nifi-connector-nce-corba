package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "SNCServiceRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCServiceRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SNCServiceRoute_T(){}
	public mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] positiveRouteWork;
	public mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] oppositeRouteWork;
	public mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T[] positiveRouteProtection;
	public mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T[] oppositeRouteProtection;
	public SNCServiceRoute_T(mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] positiveRouteWork, mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] oppositeRouteWork, mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T[] positiveRouteProtection, mtnm.tmforum.org.circuitCutMgr.ProtectServiceTrail_T[] oppositeRouteProtection)
	{
		this.positiveRouteWork = positiveRouteWork;
		this.oppositeRouteWork = oppositeRouteWork;
		this.positiveRouteProtection = positiveRouteProtection;
		this.oppositeRouteProtection = oppositeRouteProtection;
	}
}
