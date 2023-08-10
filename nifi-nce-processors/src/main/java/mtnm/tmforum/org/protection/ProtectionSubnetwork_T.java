package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "ProtectionSubnetwork_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionSubnetwork_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ProtectionSubnetwork_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short layerRate;
	public mtnm.tmforum.org.protection.ProtectionSubnetworkType_T psnType;
	public int[] neIDList;
	public mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] psnLinks;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProtectionSubnetwork_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short layerRate, mtnm.tmforum.org.protection.ProtectionSubnetworkType_T psnType, int[] neIDList, mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] psnLinks, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.layerRate = layerRate;
		this.psnType = psnType;
		this.neIDList = neIDList;
		this.psnLinks = psnLinks;
		this.additionalInfo = additionalInfo;
	}
}
