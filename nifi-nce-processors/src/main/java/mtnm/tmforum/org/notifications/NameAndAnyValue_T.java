package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL struct "NameAndAnyValue_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NameAndAnyValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NameAndAnyValue_T(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public NameAndAnyValue_T(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
