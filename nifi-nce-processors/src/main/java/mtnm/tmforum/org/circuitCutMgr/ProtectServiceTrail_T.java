package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ProtectServiceTrail_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectServiceTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ProtectServiceTrail_T(){}
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T aEndTP;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T zEndTP;
	public mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] route;
	public ProtectServiceTrail_T(mtnm.tmforum.org.circuitCutMgr.TPInfo_T aEndTP, mtnm.tmforum.org.circuitCutMgr.TPInfo_T zEndTP, mtnm.tmforum.org.circuitCutMgr.ServiceTrail_T[] route)
	{
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.route = route;
	}
}
