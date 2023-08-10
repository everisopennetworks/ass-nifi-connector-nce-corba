package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL struct "TrailNtwProtCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T value;

	public TrailNtwProtCreateData_THolder ()
	{
	}
	public TrailNtwProtCreateData_THolder(final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_THelper.write(_out, value);
	}
}
