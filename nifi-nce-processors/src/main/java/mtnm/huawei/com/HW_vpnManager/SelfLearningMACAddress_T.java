package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "SelfLearningMACAddress_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SelfLearningMACAddress_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SelfLearningMACAddress_T(){}
	public java.lang.String macType = "";
	public java.lang.String macAddress = "";
	public java.lang.String peVID = "";
	public java.lang.String ceVID = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SelfLearningMACAddress_T(java.lang.String macType, java.lang.String macAddress, java.lang.String peVID, java.lang.String ceVID, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.macType = macType;
		this.macAddress = macAddress;
		this.peVID = peVID;
		this.ceVID = ceVID;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
