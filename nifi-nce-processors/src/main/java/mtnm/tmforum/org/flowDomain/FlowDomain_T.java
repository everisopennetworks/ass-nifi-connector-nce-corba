package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "FlowDomain_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomain_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FlowDomain_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String networkAccessDomain = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfds;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] fdEdgeCPTPs;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] fdInternalCPTPs;
	public mtnm.tmforum.org.flowDomain.ConnectivityState_T fDConnectivityState;
	public java.lang.String fdType = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomain_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String networkAccessDomain, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfds, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] fdEdgeCPTPs, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] fdInternalCPTPs, mtnm.tmforum.org.flowDomain.ConnectivityState_T fDConnectivityState, java.lang.String fdType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.networkAccessDomain = networkAccessDomain;
		this.mfds = mfds;
		this.fdEdgeCPTPs = fdEdgeCPTPs;
		this.fdInternalCPTPs = fdInternalCPTPs;
		this.fDConnectivityState = fDConnectivityState;
		this.fdType = fdType;
		this.additionalInfo = additionalInfo;
	}
}
