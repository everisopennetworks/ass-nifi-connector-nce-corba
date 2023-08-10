package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "TPData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TPData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public TPData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.terminationPoint.TerminationMode_T tpMappingMode, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName)
	{
		this.tpName = tpName;
		this.tpMappingMode = tpMappingMode;
		this.transmissionParams = transmissionParams;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
	}
}
