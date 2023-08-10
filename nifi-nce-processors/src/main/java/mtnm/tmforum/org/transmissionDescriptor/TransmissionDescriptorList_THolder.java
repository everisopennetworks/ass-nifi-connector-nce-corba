package mtnm.tmforum.org.transmissionDescriptor;

/**
 * Generated from IDL alias "TransmissionDescriptorList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TransmissionDescriptorList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_T[] value;

	public TransmissionDescriptorList_THolder ()
	{
	}
	public TransmissionDescriptorList_THolder (final mtnm.tmforum.org.transmissionDescriptor.TransmissionDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionDescriptorList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionDescriptorList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransmissionDescriptorList_THelper.write (out,value);
	}
}
