package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "NeighboringNodeType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NeighboringNodeType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _NODE_TYPE_NA = 0;
	public static final NeighboringNodeType_T NODE_TYPE_NA = new NeighboringNodeType_T(_NODE_TYPE_NA);
	public static final int _NODE_TYPE_CHASSIS_ID = 1;
	public static final NeighboringNodeType_T NODE_TYPE_CHASSIS_ID = new NeighboringNodeType_T(_NODE_TYPE_CHASSIS_ID);
	public static final int _NODE_TYPE_PORT_ID = 2;
	public static final NeighboringNodeType_T NODE_TYPE_PORT_ID = new NeighboringNodeType_T(_NODE_TYPE_PORT_ID);
	public static final int _NODE_TYPE_TIME_TO_LIVE = 3;
	public static final NeighboringNodeType_T NODE_TYPE_TIME_TO_LIVE = new NeighboringNodeType_T(_NODE_TYPE_TIME_TO_LIVE);
	public static final int _NODE_TYPE_PORT_DESCRIPTION = 4;
	public static final NeighboringNodeType_T NODE_TYPE_PORT_DESCRIPTION = new NeighboringNodeType_T(_NODE_TYPE_PORT_DESCRIPTION);
	public static final int _NODE_TYPE_SYSTEM_NAME = 5;
	public static final NeighboringNodeType_T NODE_TYPE_SYSTEM_NAME = new NeighboringNodeType_T(_NODE_TYPE_SYSTEM_NAME);
	public static final int _NODE_TYPE_SYSTEM_DESCRIPTION = 6;
	public static final NeighboringNodeType_T NODE_TYPE_SYSTEM_DESCRIPTION = new NeighboringNodeType_T(_NODE_TYPE_SYSTEM_DESCRIPTION);
	public static final int _NODE_TYPE_SYSTEM_CAPABILITIES = 7;
	public static final NeighboringNodeType_T NODE_TYPE_SYSTEM_CAPABILITIES = new NeighboringNodeType_T(_NODE_TYPE_SYSTEM_CAPABILITIES);
	public static final int _NODE_TYPE_MANAGEMENT_ADDRESS = 8;
	public static final NeighboringNodeType_T NODE_TYPE_MANAGEMENT_ADDRESS = new NeighboringNodeType_T(_NODE_TYPE_MANAGEMENT_ADDRESS);
	public static final int _NODE_TYPE_ORGANIZATIONALLY_SPECIFIC = 9;
	public static final NeighboringNodeType_T NODE_TYPE_ORGANIZATIONALLY_SPECIFIC = new NeighboringNodeType_T(_NODE_TYPE_ORGANIZATIONALLY_SPECIFIC);
	public int value()
	{
		return value;
	}
	public static NeighboringNodeType_T from_int(int value)
	{
		switch (value) {
			case _NODE_TYPE_NA: return NODE_TYPE_NA;
			case _NODE_TYPE_CHASSIS_ID: return NODE_TYPE_CHASSIS_ID;
			case _NODE_TYPE_PORT_ID: return NODE_TYPE_PORT_ID;
			case _NODE_TYPE_TIME_TO_LIVE: return NODE_TYPE_TIME_TO_LIVE;
			case _NODE_TYPE_PORT_DESCRIPTION: return NODE_TYPE_PORT_DESCRIPTION;
			case _NODE_TYPE_SYSTEM_NAME: return NODE_TYPE_SYSTEM_NAME;
			case _NODE_TYPE_SYSTEM_DESCRIPTION: return NODE_TYPE_SYSTEM_DESCRIPTION;
			case _NODE_TYPE_SYSTEM_CAPABILITIES: return NODE_TYPE_SYSTEM_CAPABILITIES;
			case _NODE_TYPE_MANAGEMENT_ADDRESS: return NODE_TYPE_MANAGEMENT_ADDRESS;
			case _NODE_TYPE_ORGANIZATIONALLY_SPECIFIC: return NODE_TYPE_ORGANIZATIONALLY_SPECIFIC;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NODE_TYPE_NA: return "NODE_TYPE_NA";
			case _NODE_TYPE_CHASSIS_ID: return "NODE_TYPE_CHASSIS_ID";
			case _NODE_TYPE_PORT_ID: return "NODE_TYPE_PORT_ID";
			case _NODE_TYPE_TIME_TO_LIVE: return "NODE_TYPE_TIME_TO_LIVE";
			case _NODE_TYPE_PORT_DESCRIPTION: return "NODE_TYPE_PORT_DESCRIPTION";
			case _NODE_TYPE_SYSTEM_NAME: return "NODE_TYPE_SYSTEM_NAME";
			case _NODE_TYPE_SYSTEM_DESCRIPTION: return "NODE_TYPE_SYSTEM_DESCRIPTION";
			case _NODE_TYPE_SYSTEM_CAPABILITIES: return "NODE_TYPE_SYSTEM_CAPABILITIES";
			case _NODE_TYPE_MANAGEMENT_ADDRESS: return "NODE_TYPE_MANAGEMENT_ADDRESS";
			case _NODE_TYPE_ORGANIZATIONALLY_SPECIFIC: return "NODE_TYPE_ORGANIZATIONALLY_SPECIFIC";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NeighboringNodeType_T(int i)
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
