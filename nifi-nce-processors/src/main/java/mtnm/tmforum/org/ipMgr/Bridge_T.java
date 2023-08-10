package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "Bridge_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Bridge_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Bridge_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public Bridge_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
