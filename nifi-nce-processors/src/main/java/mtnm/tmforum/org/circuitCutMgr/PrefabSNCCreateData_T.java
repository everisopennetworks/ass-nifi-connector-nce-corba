package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "PrefabSNCCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PrefabSNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PrefabSNCCreateData_T(){}
	public mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction;
	public mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate;
	public mtnm.tmforum.org.circuitCutMgr.ServiceLimit_T[] serviceTrailInclusions;
	public int[] neInclusions;
	public int[] neExclusions;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T[] aEndList;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T[] zEndList;
	public PrefabSNCCreateData_T(mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.ServiceLimit_T[] serviceTrailInclusions, int[] neInclusions, int[] neExclusions, mtnm.tmforum.org.circuitCutMgr.TPInfo_T[] aEndList, mtnm.tmforum.org.circuitCutMgr.TPInfo_T[] zEndList)
	{
		this.direction = direction;
		this.rate = rate;
		this.serviceTrailInclusions = serviceTrailInclusions;
		this.neInclusions = neInclusions;
		this.neExclusions = neExclusions;
		this.aEndList = aEndList;
		this.zEndList = zEndList;
	}
}
