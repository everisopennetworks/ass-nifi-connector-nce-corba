package mtnm.tmforum.org.ipMgr;


/**
 * Generated from IDL interface "FRRIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface FRRIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.tmforum.org.ipMgr.FRRList_THolder frrList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
