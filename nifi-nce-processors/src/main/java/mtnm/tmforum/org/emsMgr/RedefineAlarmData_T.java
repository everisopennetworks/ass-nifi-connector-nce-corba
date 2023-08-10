package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "RedefineAlarmData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RedefineAlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RedefineAlarmData_T(){}
	public int ruleID;
	public int groupID;
	public int alarmID;
	public mtnm.tmforum.org.notifications.PerceivedSeverity_T redefinedSeverity;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] objectList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] redefineInfo;
	public RedefineAlarmData_T(int ruleID, int groupID, int alarmID, mtnm.tmforum.org.notifications.PerceivedSeverity_T redefinedSeverity, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] objectList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] redefineInfo)
	{
		this.ruleID = ruleID;
		this.groupID = groupID;
		this.alarmID = alarmID;
		this.redefinedSeverity = redefinedSeverity;
		this.objectList = objectList;
		this.redefineInfo = redefineInfo;
	}
}
