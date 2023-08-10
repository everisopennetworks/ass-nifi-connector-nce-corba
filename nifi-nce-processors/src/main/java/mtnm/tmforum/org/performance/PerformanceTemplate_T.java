package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PerformanceTemplate_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PerformanceTemplate_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PerformanceTemplate_T(){}
	public int id;
	public java.lang.String name = "";
	public mtnm.tmforum.org.performance.InstanceEnum_T type;
	public int period;
	public PerformanceTemplate_T(int id, java.lang.String name, mtnm.tmforum.org.performance.InstanceEnum_T type, int period)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.period = period;
	}
}
