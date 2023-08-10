package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMThresholdValue_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMThresholdValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMThresholdValue_T(){}
	public java.lang.String pmParameterName = "";
	public java.lang.String pmLocation = "";
	public mtnm.tmforum.org.performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThresholdValue_T(java.lang.String pmParameterName, java.lang.String pmLocation, mtnm.tmforum.org.performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
