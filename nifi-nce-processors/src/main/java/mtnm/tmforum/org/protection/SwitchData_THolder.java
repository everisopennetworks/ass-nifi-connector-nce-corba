package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "SwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.SwitchData_T value;

	public SwitchData_THolder ()
	{
	}
	public SwitchData_THolder(final mtnm.tmforum.org.protection.SwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.protection.SwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.protection.SwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.protection.SwitchData_THelper.write(_out, value);
	}
}
