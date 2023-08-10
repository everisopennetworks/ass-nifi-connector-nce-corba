package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PerformanceCreateInstance_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceCreateInstance_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PerformanceCreateInstance_T(){}
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public org.omg.CORBA.Any vendorExtensions;
	public int resType;
	public java.lang.String scheduleName = "";
	public java.lang.String startTime = "";
	public java.lang.String endTime = "";
	public mtnm.tmforum.org.performance.PerformanceCreateResource_T[] resource;
	public mtnm.tmforum.org.performance.PerformanceTemplate_T[] template;
	public PerformanceCreateInstance_T(java.lang.String userLabel, java.lang.String nativeEMSName, org.omg.CORBA.Any vendorExtensions, int resType, java.lang.String scheduleName, java.lang.String startTime, java.lang.String endTime, mtnm.tmforum.org.performance.PerformanceCreateResource_T[] resource, mtnm.tmforum.org.performance.PerformanceTemplate_T[] template)
	{
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.vendorExtensions = vendorExtensions;
		this.resType = resType;
		this.scheduleName = scheduleName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.resource = resource;
		this.template = template;
	}
}
