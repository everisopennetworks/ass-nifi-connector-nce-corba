package mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage;

/**
 * Generated from IDL struct "OAMParametersData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class OAMParametersData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OAMParametersData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public OAMParametersData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams)
	{
		this.objectName = objectName;
		this.transmissionParams = transmissionParams;
	}
}
