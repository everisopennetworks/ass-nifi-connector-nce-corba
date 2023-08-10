package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "CutAndPrefabSNCPair_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CutAndPrefabSNCPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CutAndPrefabSNCPair_T(){}
	public mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T cutSNC;
	public mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T prefabSNC;
	public CutAndPrefabSNCPair_T(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T cutSNC, mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_T prefabSNC)
	{
		this.cutSNC = cutSNC;
		this.prefabSNC = prefabSNC;
	}
}
