package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "CommunicationState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CommunicationState_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public CommunicationState_T value;

	public CommunicationState_THolder ()
	{
	}
	public CommunicationState_THolder (final CommunicationState_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CommunicationState_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CommunicationState_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CommunicationState_THelper.write (out,value);
	}
}
