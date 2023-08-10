package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL alias "PortLLDPNeighboringInfoList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortLLDPNeighboringInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T[] value;

	public PortLLDPNeighboringInfoList_THolder ()
	{
	}
	public PortLLDPNeighboringInfoList_THolder (final mtnm.tmforum.org.managedElement.PortLLDPNeighboringInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PortLLDPNeighboringInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PortLLDPNeighboringInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PortLLDPNeighboringInfoList_THelper.write (out,value);
	}
}
