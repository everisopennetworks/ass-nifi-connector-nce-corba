package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "ObjectIDList".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ObjectIDListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ObjectIDListHolder ()
	{
	}
	public ObjectIDListHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectIDListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectIDListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectIDListHelper.write (out,value);
	}
}
