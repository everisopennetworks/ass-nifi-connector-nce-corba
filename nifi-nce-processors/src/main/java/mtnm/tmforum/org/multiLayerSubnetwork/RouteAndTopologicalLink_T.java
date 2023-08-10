package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL struct "RouteAndTopologicalLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteAndTopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RouteAndTopologicalLink_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName;
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route;
	public mtnm.tmforum.org.topologicalLink.TopologicalLink_T[] topologicalLinkList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteAndTopologicalLink_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route, mtnm.tmforum.org.topologicalLink.TopologicalLink_T[] topologicalLinkList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.route = route;
		this.topologicalLinkList = topologicalLinkList;
		this.additionalInfo = additionalInfo;
	}
}
