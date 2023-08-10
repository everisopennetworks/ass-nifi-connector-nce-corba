package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "SampleResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SampleResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SampleResult_T(){}
	public java.lang.String sampleTime = "";
	public int value;
	public SampleResult_T(java.lang.String sampleTime, int value)
	{
		this.sampleTime = sampleTime;
		this.value = value;
	}
}
