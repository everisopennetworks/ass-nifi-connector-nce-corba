package mtnm.tmforum.org.TopoManagementManager;
/**
 * Generated from IDL enum "NodeType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NodeType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NODETYPE_ME = 0;
	public static final NodeType_T NODETYPE_ME = new NodeType_T(_NODETYPE_ME);
	public static final int _NODETYPE_TOPO_SN = 1;
	public static final NodeType_T NODETYPE_TOPO_SN = new NodeType_T(_NODETYPE_TOPO_SN);
	public int value()
	{
		return value;
	}
	public static NodeType_T from_int(int value)
	{
		switch (value) {
			case _NODETYPE_ME: return NODETYPE_ME;
			case _NODETYPE_TOPO_SN: return NODETYPE_TOPO_SN;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NODETYPE_ME: return "NODETYPE_ME";
			case _NODETYPE_TOPO_SN: return "NODETYPE_TOPO_SN";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NodeType_T(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
