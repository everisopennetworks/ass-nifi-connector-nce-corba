package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "RouteDescriptor_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RouteDescriptor_T(){}
	public java.lang.String id = "";
	public java.lang.String intended = "";
	public java.lang.String actualState = "";
	public java.lang.String administrativeState = "";
	public java.lang.String inUseBy = "";
	public java.lang.String exclusive = "";
	public mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] routeXCs;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteDescriptor_T(java.lang.String id, java.lang.String intended, java.lang.String actualState, java.lang.String administrativeState, java.lang.String inUseBy, java.lang.String exclusive, mtnm.tmforum.org.subnetworkConnection.CrossConnect_T[] routeXCs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.id = id;
		this.intended = intended;
		this.actualState = actualState;
		this.administrativeState = administrativeState;
		this.inUseBy = inUseBy;
		this.exclusive = exclusive;
		this.routeXCs = routeXCs;
		this.additionalInfo = additionalInfo;
	}
}
