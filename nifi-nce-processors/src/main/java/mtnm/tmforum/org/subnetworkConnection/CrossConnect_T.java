package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "CrossConnect_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CrossConnect_T(){}
	public boolean active;
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.subnetworkConnection.SNCType_T ccType;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEndNameList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEndNameList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.subnetworkConnection.SNCType_T ccType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEndNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEndNameList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
}
