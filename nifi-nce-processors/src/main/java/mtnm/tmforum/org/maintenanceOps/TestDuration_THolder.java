package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "TestDuration_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TestDuration_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.TestDuration_T value;

	public TestDuration_THolder ()
	{
	}
	public TestDuration_THolder(final mtnm.tmforum.org.maintenanceOps.TestDuration_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.write(_out, value);
	}
}
