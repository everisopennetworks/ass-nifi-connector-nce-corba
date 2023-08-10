package mtnm.tmforum.org.trafficDescriptor;

/**
 * Generated from IDL alias "TrafficDescriptorList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficDescriptorList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T[] value;

	public TrafficDescriptorList_THolder ()
	{
	}
	public TrafficDescriptorList_THolder (final mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TrafficDescriptorList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrafficDescriptorList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TrafficDescriptorList_THelper.write (out,value);
	}
}
