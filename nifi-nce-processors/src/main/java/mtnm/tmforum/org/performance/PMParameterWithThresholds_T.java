package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMParameterWithThresholds_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMParameterWithThresholds_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMParameterWithThresholds_T(){}
	public java.lang.String pmParameterName = "";
	public mtnm.tmforum.org.performance.PMThreshold_T[] pmThresholdList;
	public PMParameterWithThresholds_T(java.lang.String pmParameterName, mtnm.tmforum.org.performance.PMThreshold_T[] pmThresholdList)
	{
		this.pmParameterName = pmParameterName;
		this.pmThresholdList = pmThresholdList;
	}
}
