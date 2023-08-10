package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "ServiceState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _IN_SERVICE = 0;
	public static final ServiceState_T IN_SERVICE = new ServiceState_T(_IN_SERVICE);
	public static final int _OUT_OF_SERVICE = 1;
	public static final ServiceState_T OUT_OF_SERVICE = new ServiceState_T(_OUT_OF_SERVICE);
	public static final int _OUT_OF_SERVICE_BY_MAINTENANCE = 2;
	public static final ServiceState_T OUT_OF_SERVICE_BY_MAINTENANCE = new ServiceState_T(_OUT_OF_SERVICE_BY_MAINTENANCE);
	public static final int _SERV_NA = 3;
	public static final ServiceState_T SERV_NA = new ServiceState_T(_SERV_NA);
	public int value()
	{
		return value;
	}
	public static ServiceState_T from_int(int value)
	{
		switch (value) {
			case _IN_SERVICE: return IN_SERVICE;
			case _OUT_OF_SERVICE: return OUT_OF_SERVICE;
			case _OUT_OF_SERVICE_BY_MAINTENANCE: return OUT_OF_SERVICE_BY_MAINTENANCE;
			case _SERV_NA: return SERV_NA;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _IN_SERVICE: return "IN_SERVICE";
			case _OUT_OF_SERVICE: return "OUT_OF_SERVICE";
			case _OUT_OF_SERVICE_BY_MAINTENANCE: return "OUT_OF_SERVICE_BY_MAINTENANCE";
			case _SERV_NA: return "SERV_NA";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ServiceState_T(int i)
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
