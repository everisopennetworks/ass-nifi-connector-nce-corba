package mtnm.tmforum.org.trafficConditioningProfile;

/**
 * Generated from IDL struct "TrafficConditioningProfileAssign_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficConditioningProfileAssign_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TrafficConditioningProfileAssign_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcpRef;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName;
	public mtnm.tmforum.org.terminationPoint.Directionality_T direction;
	public short layerRate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficConditioningProfileAssign_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tcpRef, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceName, mtnm.tmforum.org.terminationPoint.Directionality_T direction, short layerRate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tcpRef = tcpRef;
		this.resourceName = resourceName;
		this.direction = direction;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
