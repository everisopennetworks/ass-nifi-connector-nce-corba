package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PerformanceCreateResource_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceCreateResource_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PerformanceCreateResource_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceSLA;
	public PerformanceCreateResource_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceSLA)
	{
		this.resourceRef = resourceRef;
		this.resourceSLA = resourceSLA;
	}
}
