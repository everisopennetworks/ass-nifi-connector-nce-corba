package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "ServerConnectionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerConnectionType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerConnectionType_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList;
	public java.lang.String channel = "";
	public mtnm.huawei.com.HW_vpnManager.UsedAsType_T usedAs;
	public ServerConnectionType_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String channel, mtnm.huawei.com.HW_vpnManager.UsedAsType_T usedAs)
	{
		this.nameList = nameList;
		this.channel = channel;
		this.usedAs = usedAs;
	}
}
