package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL interface "EquipmentOrHolderIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface EquipmentOrHolderIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.tmforum.org.equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
