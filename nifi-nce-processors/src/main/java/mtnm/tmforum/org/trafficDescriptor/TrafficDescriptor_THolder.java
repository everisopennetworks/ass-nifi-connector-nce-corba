package mtnm.tmforum.org.trafficDescriptor;

/**
 * Generated from IDL struct "TrafficDescriptor_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrafficDescriptor_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T value;

	public TrafficDescriptor_THolder ()
	{
	}
	public TrafficDescriptor_THolder(final mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.write(_out, value);
	}
}
