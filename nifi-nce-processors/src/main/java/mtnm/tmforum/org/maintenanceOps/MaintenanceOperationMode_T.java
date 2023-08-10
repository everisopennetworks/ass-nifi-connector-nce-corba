package mtnm.tmforum.org.maintenanceOps;
/**
 * Generated from IDL enum "MaintenanceOperationMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MaintenanceOperationMode_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _MOM_OPERATE = 0;
	public static final MaintenanceOperationMode_T MOM_OPERATE = new MaintenanceOperationMode_T(_MOM_OPERATE);
	public static final int _MOM_RELEASE = 1;
	public static final MaintenanceOperationMode_T MOM_RELEASE = new MaintenanceOperationMode_T(_MOM_RELEASE);
	public int value()
	{
		return value;
	}
	public static MaintenanceOperationMode_T from_int(int value)
	{
		switch (value) {
			case _MOM_OPERATE: return MOM_OPERATE;
			case _MOM_RELEASE: return MOM_RELEASE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _MOM_OPERATE: return "MOM_OPERATE";
			case _MOM_RELEASE: return "MOM_RELEASE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MaintenanceOperationMode_T(int i)
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
