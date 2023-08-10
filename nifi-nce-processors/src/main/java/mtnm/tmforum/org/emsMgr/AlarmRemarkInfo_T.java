package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "AlarmRemarkInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class AlarmRemarkInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlarmRemarkInfo_T(){}
	public java.lang.String[] alarmSerialNoList;
	public java.lang.String remark = "";
	public AlarmRemarkInfo_T(java.lang.String[] alarmSerialNoList, java.lang.String remark)
	{
		this.alarmSerialNoList = alarmSerialNoList;
		this.remark = remark;
	}
}
