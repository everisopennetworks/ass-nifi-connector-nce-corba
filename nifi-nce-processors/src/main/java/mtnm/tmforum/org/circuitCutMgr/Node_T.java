package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "Node_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Node_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Node_T(){}
	public int nodeID;
	public java.lang.String nativeEMSName = "";
	public mtnm.tmforum.org.circuitCutMgr.NodeType_T nodeType;
	public mtnm.tmforum.org.circuitCutMgr.Position_T position;
	public int parent;
	public mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[] additionalInfo;
	public Node_T(int nodeID, java.lang.String nativeEMSName, mtnm.tmforum.org.circuitCutMgr.NodeType_T nodeType, mtnm.tmforum.org.circuitCutMgr.Position_T position, int parent, mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeID = nodeID;
		this.nativeEMSName = nativeEMSName;
		this.nodeType = nodeType;
		this.position = position;
		this.parent = parent;
		this.additionalInfo = additionalInfo;
	}
}
