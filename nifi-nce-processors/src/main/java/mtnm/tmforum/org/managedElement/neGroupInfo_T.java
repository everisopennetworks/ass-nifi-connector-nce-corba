package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "neGroupInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroupInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public neGroupInfo_T(){}
	public java.lang.String neGroupName = "";
	public java.lang.String remark = "";
	public neGroupInfo_T(java.lang.String neGroupName, java.lang.String remark)
	{
		this.neGroupName = neGroupName;
		this.remark = remark;
	}
}
