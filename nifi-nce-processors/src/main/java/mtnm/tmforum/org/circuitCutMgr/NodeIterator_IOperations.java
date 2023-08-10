package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL interface "NodeIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface NodeIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, mtnm.tmforum.org.circuitCutMgr.NodeList_THolder nodeList) throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	int getLength() throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
	void destroy() throws mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException;
}
