package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ServiceTrail_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceTrail_T(){}
	public int serviceTrailID;
	public java.lang.String serviceTrailName = "";
	public int[] usedTSList;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T aTP;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T zTP;
	public mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction;
	public int psnInId;
	public int psnOutId;
	public ServiceTrail_T(int serviceTrailID, java.lang.String serviceTrailName, int[] usedTSList, mtnm.tmforum.org.circuitCutMgr.TPInfo_T aTP, mtnm.tmforum.org.circuitCutMgr.TPInfo_T zTP, mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction, int psnInId, int psnOutId)
	{
		this.serviceTrailID = serviceTrailID;
		this.serviceTrailName = serviceTrailName;
		this.usedTSList = usedTSList;
		this.aTP = aTP;
		this.zTP = zTP;
		this.direction = direction;
		this.psnInId = psnInId;
		this.psnOutId = psnOutId;
	}
}
