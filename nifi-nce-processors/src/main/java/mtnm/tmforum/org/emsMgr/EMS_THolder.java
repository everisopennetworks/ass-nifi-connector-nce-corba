package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "EMS_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EMS_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.EMS_T value;

	public EMS_THolder ()
	{
	}
	public EMS_THolder(final mtnm.tmforum.org.emsMgr.EMS_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.emsMgr.EMS_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.emsMgr.EMS_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.emsMgr.EMS_THelper.write(_out, value);
	}
}
