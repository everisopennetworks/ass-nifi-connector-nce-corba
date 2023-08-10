package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMEventState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMEventState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMEventState_T(){}
	public java.lang.String pmParameterName = "";
	public java.lang.String pmLocation = "";
	public boolean bEnableMonitor;
	public boolean bAutoReport;
	public PMEventState_T(java.lang.String pmParameterName, java.lang.String pmLocation, boolean bEnableMonitor, boolean bAutoReport)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.bEnableMonitor = bEnableMonitor;
		this.bAutoReport = bAutoReport;
	}
}
