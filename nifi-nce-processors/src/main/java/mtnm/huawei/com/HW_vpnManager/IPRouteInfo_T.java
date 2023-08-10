package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "IPRouteInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPRouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IPRouteInfo_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName;
	public mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] route;
	public IPRouteInfo_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficTrunkName, mtnm.huawei.com.HW_vpnManager.IPCrossConnection_T[] route)
	{
		this.trafficTrunkName = trafficTrunkName;
		this.route = route;
	}
}
