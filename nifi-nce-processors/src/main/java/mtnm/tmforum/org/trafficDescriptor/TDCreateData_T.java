package mtnm.tmforum.org.trafficDescriptor;

/**
 * Generated from IDL struct "TDCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TDCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public mtnm.tmforum.org.trafficDescriptor.ServiceCategory_T serviceCategory;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public boolean activeState;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TDCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, mtnm.tmforum.org.trafficDescriptor.ServiceCategory_T serviceCategory, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, boolean activeState, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.activeState = activeState;
		this.additionalInfo = additionalInfo;
	}
}
