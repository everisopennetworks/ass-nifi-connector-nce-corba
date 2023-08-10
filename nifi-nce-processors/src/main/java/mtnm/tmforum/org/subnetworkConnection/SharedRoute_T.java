package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "SharedRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SharedRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SharedRoute_T(){}
	public int sharedRouteID;
	public int priority;
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route;
	public SharedRoute_T(int sharedRouteID, int priority, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route)
	{
		this.sharedRouteID = sharedRouteID;
		this.priority = priority;
		this.route = route;
	}
}
