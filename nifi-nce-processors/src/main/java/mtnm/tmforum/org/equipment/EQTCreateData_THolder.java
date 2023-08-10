package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "EQTCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EQTCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.equipment.EQTCreateData_T value;

	public EQTCreateData_THolder ()
	{
	}
	public EQTCreateData_THolder(final mtnm.tmforum.org.equipment.EQTCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.equipment.EQTCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.equipment.EQTCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.equipment.EQTCreateData_THelper.write(_out, value);
	}
}
