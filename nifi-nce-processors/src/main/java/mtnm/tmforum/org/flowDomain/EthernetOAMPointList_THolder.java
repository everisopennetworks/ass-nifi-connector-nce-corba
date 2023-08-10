package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL alias "EthernetOAMPointList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T[] value;

	public EthernetOAMPointList_THolder ()
	{
	}
	public EthernetOAMPointList_THolder (final mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetOAMPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetOAMPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetOAMPointList_THelper.write (out,value);
	}
}
