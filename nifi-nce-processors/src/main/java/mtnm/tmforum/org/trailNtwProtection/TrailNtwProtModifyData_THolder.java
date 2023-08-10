package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL struct "TrailNtwProtModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T value;

	public TrailNtwProtModifyData_THolder ()
	{
	}
	public TrailNtwProtModifyData_THolder(final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.write(_out, value);
	}
}
