package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "SNCType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _ST_SIMPLE = 0;
	public static final SNCType_T ST_SIMPLE = new SNCType_T(_ST_SIMPLE);
	public static final int _ST_ADD_DROP_A = 1;
	public static final SNCType_T ST_ADD_DROP_A = new SNCType_T(_ST_ADD_DROP_A);
	public static final int _ST_ADD_DROP_Z = 2;
	public static final SNCType_T ST_ADD_DROP_Z = new SNCType_T(_ST_ADD_DROP_Z);
	public static final int _ST_INTERCONNECT = 3;
	public static final SNCType_T ST_INTERCONNECT = new SNCType_T(_ST_INTERCONNECT);
	public static final int _ST_DOUBLE_INTERCONNECT = 4;
	public static final SNCType_T ST_DOUBLE_INTERCONNECT = new SNCType_T(_ST_DOUBLE_INTERCONNECT);
	public static final int _ST_DOUBLE_ADD_DROP = 5;
	public static final SNCType_T ST_DOUBLE_ADD_DROP = new SNCType_T(_ST_DOUBLE_ADD_DROP);
	public static final int _ST_OPEN_ADD_DROP = 6;
	public static final SNCType_T ST_OPEN_ADD_DROP = new SNCType_T(_ST_OPEN_ADD_DROP);
	public static final int _ST_EXPLICIT = 7;
	public static final SNCType_T ST_EXPLICIT = new SNCType_T(_ST_EXPLICIT);
	public int value()
	{
		return value;
	}
	public static SNCType_T from_int(int value)
	{
		switch (value) {
			case _ST_SIMPLE: return ST_SIMPLE;
			case _ST_ADD_DROP_A: return ST_ADD_DROP_A;
			case _ST_ADD_DROP_Z: return ST_ADD_DROP_Z;
			case _ST_INTERCONNECT: return ST_INTERCONNECT;
			case _ST_DOUBLE_INTERCONNECT: return ST_DOUBLE_INTERCONNECT;
			case _ST_DOUBLE_ADD_DROP: return ST_DOUBLE_ADD_DROP;
			case _ST_OPEN_ADD_DROP: return ST_OPEN_ADD_DROP;
			case _ST_EXPLICIT: return ST_EXPLICIT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ST_SIMPLE: return "ST_SIMPLE";
			case _ST_ADD_DROP_A: return "ST_ADD_DROP_A";
			case _ST_ADD_DROP_Z: return "ST_ADD_DROP_Z";
			case _ST_INTERCONNECT: return "ST_INTERCONNECT";
			case _ST_DOUBLE_INTERCONNECT: return "ST_DOUBLE_INTERCONNECT";
			case _ST_DOUBLE_ADD_DROP: return "ST_DOUBLE_ADD_DROP";
			case _ST_OPEN_ADD_DROP: return "ST_OPEN_ADD_DROP";
			case _ST_EXPLICIT: return "ST_EXPLICIT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SNCType_T(int i)
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
