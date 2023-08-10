package mtnm.huawei.com.HW_controlPlane;


/**
 * Generated from IDL interface "HW_SnppLinkIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_SnppLinkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.huawei.com.HW_controlPlane.HW_SnppLinkList_THolder snppLinkList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
