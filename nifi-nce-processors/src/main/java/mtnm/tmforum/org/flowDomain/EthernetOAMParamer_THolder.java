package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "EthernetOAMParamer_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMParamer_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T value;

	public EthernetOAMParamer_THolder ()
	{
	}
	public EthernetOAMParamer_THolder(final mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.write(_out, value);
	}
}
