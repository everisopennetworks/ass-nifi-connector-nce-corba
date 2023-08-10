package mtnm.tmforum.org.TopoManagementManager;

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
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public mtnm.tmforum.org.TopoManagementManager.NodeType_T nodeType;
	public mtnm.tmforum.org.TopoManagementManager.Position_T position;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] parent;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public Node_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, mtnm.tmforum.org.TopoManagementManager.NodeType_T nodeType, mtnm.tmforum.org.TopoManagementManager.Position_T position, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] parent, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.nodeType = nodeType;
		this.position = position;
		this.parent = parent;
		this.additionalInfo = additionalInfo;
	}
}
