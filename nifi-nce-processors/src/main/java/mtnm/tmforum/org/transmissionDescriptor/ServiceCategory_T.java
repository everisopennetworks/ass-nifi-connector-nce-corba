package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL enum "ServiceCategory_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceCategory_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _SC_CBR = 0;
	public static final ServiceCategory_T SC_CBR = new ServiceCategory_T(_SC_CBR);
	public static final int _SC_VBRRT = 1;
	public static final ServiceCategory_T SC_VBRRT = new ServiceCategory_T(_SC_VBRRT);
	public static final int _SC_VBRNRT = 2;
	public static final ServiceCategory_T SC_VBRNRT = new ServiceCategory_T(_SC_VBRNRT);
	public static final int _SC_ABR = 3;
	public static final ServiceCategory_T SC_ABR = new ServiceCategory_T(_SC_ABR);
	public static final int _SC_UBR = 4;
	public static final ServiceCategory_T SC_UBR = new ServiceCategory_T(_SC_UBR);
	public static final int _SC_GFR = 5;
	public static final ServiceCategory_T SC_GFR = new ServiceCategory_T(_SC_GFR);
	public static final int _SC_NA = 6;
	public static final ServiceCategory_T SC_NA = new ServiceCategory_T(_SC_NA);
	public int value()
	{
		return value;
	}
	public static ServiceCategory_T from_int(int value)
	{
		switch (value) {
			case _SC_CBR: return SC_CBR;
			case _SC_VBRRT: return SC_VBRRT;
			case _SC_VBRNRT: return SC_VBRNRT;
			case _SC_ABR: return SC_ABR;
			case _SC_UBR: return SC_UBR;
			case _SC_GFR: return SC_GFR;
			case _SC_NA: return SC_NA;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SC_CBR: return "SC_CBR";
			case _SC_VBRRT: return "SC_VBRRT";
			case _SC_VBRNRT: return "SC_VBRNRT";
			case _SC_ABR: return "SC_ABR";
			case _SC_UBR: return "SC_UBR";
			case _SC_GFR: return "SC_GFR";
			case _SC_NA: return "SC_NA";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ServiceCategory_T(int i)
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
