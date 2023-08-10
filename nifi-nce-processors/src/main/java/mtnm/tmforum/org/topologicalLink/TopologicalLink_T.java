package mtnm.tmforum.org.topologicalLink;

/**
 * Generated from IDL struct "TopologicalLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TopologicalLink_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public short rate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndTP;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, short rate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] aEndTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] zEndTP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
}
