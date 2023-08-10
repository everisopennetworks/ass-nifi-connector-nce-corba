package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL alias "EthernetLTTestResultList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetLTTestResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T[] value;

	public EthernetLTTestResultList_THolder ()
	{
	}
	public EthernetLTTestResultList_THolder (final mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetLTTestResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetLTTestResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetLTTestResultList_THelper.write (out,value);
	}
}
