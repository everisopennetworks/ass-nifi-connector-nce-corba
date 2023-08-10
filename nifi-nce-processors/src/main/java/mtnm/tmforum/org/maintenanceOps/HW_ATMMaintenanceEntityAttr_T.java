package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "HW_ATMMaintenanceEntityAttr_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ATMMaintenanceEntityAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_ATMMaintenanceEntityAttr_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ATMMaintenanceEntityAttr_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.aEndName = aEndName;
		this.zEndName = zEndName;
		this.serviceName = serviceName;
		this.additionalInfo = additionalInfo;
	}
}
