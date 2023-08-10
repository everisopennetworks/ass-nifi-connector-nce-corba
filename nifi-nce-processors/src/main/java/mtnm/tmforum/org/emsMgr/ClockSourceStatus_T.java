package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "ClockSourceStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ClockSourceStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ClockSourceStatus_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String status = "";
	public java.lang.String timingMode = "";
	public java.lang.String quality = "";
	public java.lang.String workingMode = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ClockSourceStatus_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String status, java.lang.String timingMode, java.lang.String quality, java.lang.String workingMode, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.status = status;
		this.timingMode = timingMode;
		this.quality = quality;
		this.workingMode = workingMode;
		this.additionalInfo = additionalInfo;
	}
}
