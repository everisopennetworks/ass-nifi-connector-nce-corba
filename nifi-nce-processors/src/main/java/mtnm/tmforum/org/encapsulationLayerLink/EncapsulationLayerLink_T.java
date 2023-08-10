package mtnm.tmforum.org.encapsulationLayerLink;

/**
 * Generated from IDL struct "EncapsulationLayerLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EncapsulationLayerLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EncapsulationLayerLink_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.encapsulationLayerLink.LinkType_T type;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public short rate;
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] route;
	public boolean segment;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] routeGroups;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EncapsulationLayerLink_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.encapsulationLayerLink.LinkType_T type, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, short rate, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] endTPs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] route, boolean segment, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] routeGroups, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.type = type;
		this.transmissionParams = transmissionParams;
		this.rate = rate;
		this.networkAccessDomain = networkAccessDomain;
		this.endTPs = endTPs;
		this.route = route;
		this.segment = segment;
		this.routeGroups = routeGroups;
		this.additionalInfo = additionalInfo;
	}
}
