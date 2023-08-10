package mtnm.tmforum.org.multiLayerSubnetwork;
/**
 * Generated from IDL enum "Topology_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Topology_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TOPO_SINGLETON = 0;
	public static final Topology_T TOPO_SINGLETON = new Topology_T(_TOPO_SINGLETON);
	public static final int _TOPO_CHAIN = 1;
	public static final Topology_T TOPO_CHAIN = new Topology_T(_TOPO_CHAIN);
	public static final int _TOPO_PSR = 2;
	public static final Topology_T TOPO_PSR = new Topology_T(_TOPO_PSR);
	public static final int _TOPO_OPEN_PSR = 3;
	public static final Topology_T TOPO_OPEN_PSR = new Topology_T(_TOPO_OPEN_PSR);
	public static final int _TOPO_SPRING = 4;
	public static final Topology_T TOPO_SPRING = new Topology_T(_TOPO_SPRING);
	public static final int _TOPO_OPEN_SPRING = 5;
	public static final Topology_T TOPO_OPEN_SPRING = new Topology_T(_TOPO_OPEN_SPRING);
	public static final int _TOPO_MESH = 6;
	public static final Topology_T TOPO_MESH = new Topology_T(_TOPO_MESH);
	public int value()
	{
		return value;
	}
	public static Topology_T from_int(int value)
	{
		switch (value) {
			case _TOPO_SINGLETON: return TOPO_SINGLETON;
			case _TOPO_CHAIN: return TOPO_CHAIN;
			case _TOPO_PSR: return TOPO_PSR;
			case _TOPO_OPEN_PSR: return TOPO_OPEN_PSR;
			case _TOPO_SPRING: return TOPO_SPRING;
			case _TOPO_OPEN_SPRING: return TOPO_OPEN_SPRING;
			case _TOPO_MESH: return TOPO_MESH;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TOPO_SINGLETON: return "TOPO_SINGLETON";
			case _TOPO_CHAIN: return "TOPO_CHAIN";
			case _TOPO_PSR: return "TOPO_PSR";
			case _TOPO_OPEN_PSR: return "TOPO_OPEN_PSR";
			case _TOPO_SPRING: return "TOPO_SPRING";
			case _TOPO_OPEN_SPRING: return "TOPO_OPEN_SPRING";
			case _TOPO_MESH: return "TOPO_MESH";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Topology_T(int i)
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
