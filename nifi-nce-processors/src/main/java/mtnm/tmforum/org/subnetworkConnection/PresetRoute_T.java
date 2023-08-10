package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "PresetRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PresetRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PresetRoute_T(){}
	public int presetRouteID;
	public int priority;
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route;
	public PresetRoute_T(int presetRouteID, int priority, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] route)
	{
		this.presetRouteID = presetRouteID;
		this.priority = priority;
		this.route = route;
	}
}
