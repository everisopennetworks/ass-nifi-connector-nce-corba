package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PerformanceMonitoringInstance_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceMonitoringInstance_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PerformanceMonitoringInstance_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public org.omg.CORBA.Any vendorExtensions;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef;
	public mtnm.tmforum.org.performance.PmMonitorConditioning_T pmmc;
	public mtnm.tmforum.org.performance.ActivityStatusEnum_T status;
	public PerformanceMonitoringInstance_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, org.omg.CORBA.Any vendorExtensions, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] resourceRef, mtnm.tmforum.org.performance.PmMonitorConditioning_T pmmc, mtnm.tmforum.org.performance.ActivityStatusEnum_T status)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.vendorExtensions = vendorExtensions;
		this.resourceRef = resourceRef;
		this.pmmc = pmmc;
		this.status = status;
	}
}
