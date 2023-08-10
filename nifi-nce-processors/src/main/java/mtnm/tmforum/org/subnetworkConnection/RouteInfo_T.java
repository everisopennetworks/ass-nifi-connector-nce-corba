package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "RouteInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RouteInfo_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName;
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route;
	public RouteInfo_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route)
	{
		this.sncName = sncName;
		this.route = route;
	}
}
