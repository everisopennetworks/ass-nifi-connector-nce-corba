package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "PresetRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PresetRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.subnetworkConnection.PresetRoute_T value;

	public PresetRoute_THolder ()
	{
	}
	public PresetRoute_THolder(final mtnm.tmforum.org.subnetworkConnection.PresetRoute_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.subnetworkConnection.PresetRoute_THelper.write(_out, value);
	}
}
