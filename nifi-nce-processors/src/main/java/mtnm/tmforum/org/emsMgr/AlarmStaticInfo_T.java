package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "AlarmStaticInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class AlarmStaticInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlarmStaticInfo_T(){}
	public int groupID;
	public int alarmID;
	public java.lang.String nativeProbableCause = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmStaticInfo_T(int groupID, int alarmID, java.lang.String nativeProbableCause, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.groupID = groupID;
		this.alarmID = alarmID;
		this.nativeProbableCause = nativeProbableCause;
		this.additionalInfo = additionalInfo;
	}
}
