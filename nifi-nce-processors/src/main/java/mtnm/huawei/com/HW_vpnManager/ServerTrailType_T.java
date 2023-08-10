package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "ServerTrailType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerTrailType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerTrailType_T(){}
	public mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T[] serverConnectionList;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public ServerTrailType_T(mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T[] serverConnectionList, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams)
	{
		this.serverConnectionList = serverConnectionList;
		this.transmissionParams = transmissionParams;
	}
}
