package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL union "EquipmentOrHolder_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EquipmentOrHolder_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EquipmentOrHolder_T value;

	public EquipmentOrHolder_THolder ()
	{
	}
	public EquipmentOrHolder_THolder (final EquipmentOrHolder_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EquipmentOrHolder_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentOrHolder_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EquipmentOrHolder_THelper.write (out, value);
	}
}
