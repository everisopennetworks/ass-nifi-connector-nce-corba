package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "VRRPProtection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRRPProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public VRRPProtection_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short rate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vrrpParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRRPProtection_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short rate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] vrrpParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.rate = rate;
		this.tpList = tpList;
		this.vrrpParameters = vrrpParameters;
		this.additionalInfo = additionalInfo;
	}
}
