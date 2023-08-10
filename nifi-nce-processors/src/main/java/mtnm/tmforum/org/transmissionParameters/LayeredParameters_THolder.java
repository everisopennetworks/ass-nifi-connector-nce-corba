package mtnm.tmforum.org.transmissionParameters;

/**
 * Generated from IDL struct "LayeredParameters_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LayeredParameters_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T value;

	public LayeredParameters_THolder ()
	{
	}
	public LayeredParameters_THolder(final mtnm.tmforum.org.transmissionParameters.LayeredParameters_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.write(_out, value);
	}
}
