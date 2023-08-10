package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "PRBSTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PRBSTestResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PRBSTestResult_T(){}
	public mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T testPara;
	public java.lang.String startTime = "";
	public mtnm.tmforum.org.maintenanceOps.SampleResult_T[] sampleResultList;
	public int totalBitError;
	public mtnm.tmforum.org.maintenanceOps.TestDuration_T realDuration;
	public PRBSTestResult_T(mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T testPara, java.lang.String startTime, mtnm.tmforum.org.maintenanceOps.SampleResult_T[] sampleResultList, int totalBitError, mtnm.tmforum.org.maintenanceOps.TestDuration_T realDuration)
	{
		this.testPara = testPara;
		this.startTime = startTime;
		this.sampleResultList = sampleResultList;
		this.totalBitError = totalBitError;
		this.realDuration = realDuration;
	}
}
