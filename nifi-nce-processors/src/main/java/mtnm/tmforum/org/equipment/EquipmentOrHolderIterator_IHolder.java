package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL interface "EquipmentOrHolderIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EquipmentOrHolderIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EquipmentOrHolderIterator_I value;
	public EquipmentOrHolderIterator_IHolder()
	{
	}
	public EquipmentOrHolderIterator_IHolder (final EquipmentOrHolderIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EquipmentOrHolderIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EquipmentOrHolderIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EquipmentOrHolderIterator_IHelper.write (_out,value);
	}
}
