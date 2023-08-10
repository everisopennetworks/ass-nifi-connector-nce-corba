package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "PortLLDPList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortLLDPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.PortLLDP_T[] value;

	public PortLLDPList_THolder ()
	{
	}
	public PortLLDPList_THolder (final mtnm.tmforum.org.managedElement.PortLLDP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PortLLDPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PortLLDPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PortLLDPList_THelper.write (out,value);
	}
}
