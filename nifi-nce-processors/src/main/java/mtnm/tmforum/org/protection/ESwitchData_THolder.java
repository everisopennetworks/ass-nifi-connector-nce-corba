package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "ESwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ESwitchData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.ESwitchData_T value;

	public ESwitchData_THolder ()
	{
	}
	public ESwitchData_THolder(final mtnm.tmforum.org.protection.ESwitchData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.protection.ESwitchData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.protection.ESwitchData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.protection.ESwitchData_THelper.write(_out, value);
	}
}
