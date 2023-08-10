package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "CreateSharedRouteData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CreateSharedRouteData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CreateSharedRouteData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName;
	public int sharedRouteID;
	public int priority;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CreateSharedRouteData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID, int priority, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpInclusions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] neTpSncExclusions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.sharedRouteID = sharedRouteID;
		this.priority = priority;
		this.neTpInclusions = neTpInclusions;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalInfo = additionalInfo;
	}
}
