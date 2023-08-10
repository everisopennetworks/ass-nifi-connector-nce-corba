package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "HW_MaintenancePointCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MaintenancePointCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_MaintenancePointCreateData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdOrMaName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenancePointCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mdOrMaName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.mdOrMaName = mdOrMaName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
