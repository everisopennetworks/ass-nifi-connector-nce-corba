package mtnm.tmforum.org.multiLayerSubnetwork;


/**
 * Generated from IDL interface "HW_ConjunctionSNCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_ConjunctionSNCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.tmforum.org.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder conjunctionSNCList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
