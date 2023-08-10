package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PmMonitorConditioning_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PmMonitorConditioning_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PmMonitorConditioning_T(){}
	public java.lang.String granularity = "";
	public java.lang.String startTime = "";
	public java.lang.String endTime = "";
	public java.lang.String pmScheduleName = "";
	public java.lang.String templateID = "";
	public java.lang.String templateName = "";
	public mtnm.tmforum.org.performance.PerformanceTemplate_T template;
	public mtnm.tmforum.org.performance.InstanceEnum_T intanceType;
	public PmMonitorConditioning_T(java.lang.String granularity, java.lang.String startTime, java.lang.String endTime, java.lang.String pmScheduleName, java.lang.String templateID, java.lang.String templateName, mtnm.tmforum.org.performance.PerformanceTemplate_T template, mtnm.tmforum.org.performance.InstanceEnum_T intanceType)
	{
		this.granularity = granularity;
		this.startTime = startTime;
		this.endTime = endTime;
		this.pmScheduleName = pmScheduleName;
		this.templateID = templateID;
		this.templateName = templateName;
		this.template = template;
		this.intanceType = intanceType;
	}
}
