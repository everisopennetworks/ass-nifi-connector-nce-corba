package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "PRBSTestParameter_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PRBSTestParameter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PRBSTestParameter_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public mtnm.tmforum.org.maintenanceOps.TestDuration_T testDuration;
	public java.lang.String sampleGranularity = "";
	public java.lang.String testType = "";
	public boolean accumulatingIndicator;
	public PRBSTestParameter_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, mtnm.tmforum.org.maintenanceOps.TestDuration_T testDuration, java.lang.String sampleGranularity, java.lang.String testType, boolean accumulatingIndicator)
	{
		this.tpName = tpName;
		this.testDuration = testDuration;
		this.sampleGranularity = sampleGranularity;
		this.testType = testType;
		this.accumulatingIndicator = accumulatingIndicator;
	}
}
