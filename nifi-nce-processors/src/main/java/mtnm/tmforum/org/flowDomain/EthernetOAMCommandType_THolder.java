package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "EthernetOAMCommandType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMCommandType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EthernetOAMCommandType_T value;

	public EthernetOAMCommandType_THolder ()
	{
	}
	public EthernetOAMCommandType_THolder (final EthernetOAMCommandType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMCommandType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMCommandType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMCommandType_THelper.write (out,value);
	}
}
