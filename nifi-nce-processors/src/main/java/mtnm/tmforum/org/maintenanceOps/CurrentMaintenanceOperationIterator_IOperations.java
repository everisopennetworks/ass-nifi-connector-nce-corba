package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL interface "CurrentMaintenanceOperationIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface CurrentMaintenanceOperationIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder cMOList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
