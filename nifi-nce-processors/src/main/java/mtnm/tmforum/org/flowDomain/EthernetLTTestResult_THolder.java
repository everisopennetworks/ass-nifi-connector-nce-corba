package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "EthernetLTTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetLTTestResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T value;

	public EthernetLTTestResult_THolder ()
	{
	}
	public EthernetLTTestResult_THolder(final mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomain.EthernetLTTestResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomain.EthernetLTTestResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomain.EthernetLTTestResult_THelper.write(_out, value);
	}
}
