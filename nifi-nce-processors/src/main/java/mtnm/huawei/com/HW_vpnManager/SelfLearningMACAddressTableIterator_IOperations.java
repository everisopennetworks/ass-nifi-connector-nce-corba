package mtnm.huawei.com.HW_vpnManager;


/**
 * Generated from IDL interface "SelfLearningMACAddressTableIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface SelfLearningMACAddressTableIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableList_THolder tableList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
