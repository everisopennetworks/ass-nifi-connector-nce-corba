package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "SNCBasicInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCBasicInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SNCBasicInfo_T(){}
	public java.lang.String nativeEMSName = "";
	public mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T aEnd;
	public mtnm.tmforum.org.circuitCutMgr.TPInfo_T zEnd;
	public mtnm.tmforum.org.circuitCutMgr.SNCTypeQualifier_T SNCType;
	public mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction;
	public mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[] additionalInfo;
	public SNCBasicInfo_T(java.lang.String nativeEMSName, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate, mtnm.tmforum.org.circuitCutMgr.TPInfo_T aEnd, mtnm.tmforum.org.circuitCutMgr.TPInfo_T zEnd, mtnm.tmforum.org.circuitCutMgr.SNCTypeQualifier_T SNCType, mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_T direction, mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[] additionalInfo)
	{
		this.nativeEMSName = nativeEMSName;
		this.rate = rate;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.SNCType = SNCType;
		this.direction = direction;
		this.additionalInfo = additionalInfo;
	}
}
