package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "EthernetOAMPointType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMPointType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EthernetOAMPointType_T value;

	public EthernetOAMPointType_THolder ()
	{
	}
	public EthernetOAMPointType_THolder (final EthernetOAMPointType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMPointType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMPointType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMPointType_THelper.write (out,value);
	}
}
