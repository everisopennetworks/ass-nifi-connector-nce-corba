package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "StaticMacAddress_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class StaticMacAddress_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StaticMacAddress_T(){}
	public java.lang.String staticMacType = "";
	public java.lang.String macAddress = "";
	public int peVID;
	public int ceVID;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public StaticMacAddress_T(java.lang.String staticMacType, java.lang.String macAddress, int peVID, int ceVID, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.staticMacType = staticMacType;
		this.macAddress = macAddress;
		this.peVID = peVID;
		this.ceVID = ceVID;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
