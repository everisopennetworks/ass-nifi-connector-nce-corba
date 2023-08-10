package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "HW_XPICGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_XPICGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_XPICGroup_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String vLinkID = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vTPName;
	public java.lang.String hLinkID = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] hTPName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_XPICGroup_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String vLinkID, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vTPName, java.lang.String hLinkID, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] hTPName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.vLinkID = vLinkID;
		this.vTPName = vTPName;
		this.hLinkID = hLinkID;
		this.hTPName = hTPName;
		this.additionalInfo = additionalInfo;
	}
}
