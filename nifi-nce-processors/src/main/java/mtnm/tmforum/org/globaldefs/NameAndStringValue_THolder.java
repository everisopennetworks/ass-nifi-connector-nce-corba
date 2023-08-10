package mtnm.tmforum.org.globaldefs;

/**
 * Generated from IDL struct "NameAndStringValue_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NameAndStringValue_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T value;

	public NameAndStringValue_THolder ()
	{
	}
	public NameAndStringValue_THolder(final mtnm.tmforum.org.globaldefs.NameAndStringValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.write(_out, value);
	}
}
