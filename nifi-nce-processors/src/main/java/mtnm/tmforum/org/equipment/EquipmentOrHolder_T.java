package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL union "EquipmentOrHolder_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EquipmentOrHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T discriminator;
	private mtnm.tmforum.org.equipment.Equipment_T equip;
	private mtnm.tmforum.org.equipment.EquipmentHolder_T holder;

	public EquipmentOrHolder_T ()
	{
	}

	public mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public mtnm.tmforum.org.equipment.Equipment_T equip ()
	{
		if (discriminator != mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equip;
	}

	public void equip (mtnm.tmforum.org.equipment.Equipment_T _x)
	{
		discriminator = mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT;
		equip = _x;
	}

	public mtnm.tmforum.org.equipment.EquipmentHolder_T holder ()
	{
		if (discriminator != mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT_HOLDER)
			throw new org.omg.CORBA.BAD_OPERATION();
		return holder;
	}

	public void holder (mtnm.tmforum.org.equipment.EquipmentHolder_T _x)
	{
		discriminator = mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT_HOLDER;
		holder = _x;
	}

}
