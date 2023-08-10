package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "QueryRedefineAlarmData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class QueryRedefineAlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public QueryRedefineAlarmData_T(){}
	public int ruleID;
	public int groupID;
	public int alarmID;
	public QueryRedefineAlarmData_T(int ruleID, int groupID, int alarmID)
	{
		this.ruleID = ruleID;
		this.groupID = groupID;
		this.alarmID = alarmID;
	}
}
