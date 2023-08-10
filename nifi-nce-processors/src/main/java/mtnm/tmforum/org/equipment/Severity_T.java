package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "Severity_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Severity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Severity_T(){}
	public java.lang.String probableCause = "";
	public mtnm.tmforum.org.notifications.PerceivedSeverity_T currentSeverity;
	public int alarmID;
	public int eqtType;
	public Severity_T(java.lang.String probableCause, mtnm.tmforum.org.notifications.PerceivedSeverity_T currentSeverity, int alarmID, int eqtType)
	{
		this.probableCause = probableCause;
		this.currentSeverity = currentSeverity;
		this.alarmID = alarmID;
		this.eqtType = eqtType;
	}
}
