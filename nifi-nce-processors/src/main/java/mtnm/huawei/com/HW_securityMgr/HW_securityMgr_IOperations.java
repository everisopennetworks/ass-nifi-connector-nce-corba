package mtnm.huawei.com.HW_securityMgr;


/**
 * Generated from IDL interface "HW_securityMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_securityMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void modifyPassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
