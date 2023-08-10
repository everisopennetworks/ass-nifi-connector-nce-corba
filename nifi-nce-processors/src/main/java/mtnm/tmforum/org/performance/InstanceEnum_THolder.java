package mtnm.tmforum.org.performance;
/**
 * Generated from IDL enum "InstanceEnum_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class InstanceEnum_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public InstanceEnum_T value;

	public InstanceEnum_THolder ()
	{
	}
	public InstanceEnum_THolder (final InstanceEnum_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InstanceEnum_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InstanceEnum_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InstanceEnum_THelper.write (out,value);
	}
}
