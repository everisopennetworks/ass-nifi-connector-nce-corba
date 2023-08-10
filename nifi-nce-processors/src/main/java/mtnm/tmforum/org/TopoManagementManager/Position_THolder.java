package mtnm.tmforum.org.TopoManagementManager;

/**
 * Generated from IDL struct "Position_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Position_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.TopoManagementManager.Position_T value;

	public Position_THolder ()
	{
	}
	public Position_THolder(final mtnm.tmforum.org.TopoManagementManager.Position_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.TopoManagementManager.Position_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.TopoManagementManager.Position_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.TopoManagementManager.Position_THelper.write(_out, value);
	}
}
