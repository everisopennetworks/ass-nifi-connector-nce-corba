package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ErrorReason_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ErrorReason_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ErrorReason_T(){}
	public java.lang.String strObjName = "";
	public int errorReason;
	public java.lang.String strOperDesc = "";
	public ErrorReason_T(java.lang.String strObjName, int errorReason, java.lang.String strOperDesc)
	{
		this.strObjName = strObjName;
		this.errorReason = errorReason;
		this.strOperDesc = strOperDesc;
	}
}
