package mtnm.huawei.com.HW_vpnManager;

/**
 * Generated from IDL struct "RouteConstraint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class RouteConstraint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public RouteConstraint_T(){}
	public java.lang.String ipAddress = "";
	public java.lang.String routingStytle = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteConstraint_T(java.lang.String ipAddress, java.lang.String routingStytle, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.ipAddress = ipAddress;
		this.routingStytle = routingStytle;
		this.additionalInfo = additionalInfo;
	}
}
