package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL struct "TrailNtwProtCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrailNtwProtCreateData_T(){}
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes;
	public TrailNtwProtCreateData_T(short rate, java.lang.String trailNtwProtectionType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][][] workerTrailList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] protectionTrail, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupAName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] protectionGroupZName, mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes)
	{
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.modifiableAttributes = modifiableAttributes;
	}
}
