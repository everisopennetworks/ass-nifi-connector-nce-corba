package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "PortLLDPNeighboringInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortLLDPNeighboringInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T value;

	public PortLLDPNeighboringInfo_THolder ()
	{
	}
	public PortLLDPNeighboringInfo_THolder(final mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_THelper.write(_out, value);
	}
}
