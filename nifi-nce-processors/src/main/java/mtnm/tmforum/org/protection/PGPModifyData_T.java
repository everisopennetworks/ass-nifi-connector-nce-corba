package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "PGPModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PGPModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PGPModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.tmforum.org.protection.ReversionMode_T reversionMode;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PGPModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.tmforum.org.protection.ReversionMode_T reversionMode, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] pgpTPList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] pgpParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.reversionMode = reversionMode;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
}
