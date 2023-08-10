package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL union "PhysicalLocationInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PhysicalLocationInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private mtnm.tmforum.org.equipment.ResourceTypeQualifier_T discriminator;
	private mtnm.tmforum.org.equipment.EquipmentRoom_T equipRoom;
	private mtnm.tmforum.org.equipment.Cabinet_T cabinet_;
	private mtnm.tmforum.org.equipment.Shelf_T shelf_;

	public PhysicalLocationInfo_T ()
	{
	}

	public mtnm.tmforum.org.equipment.ResourceTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public mtnm.tmforum.org.equipment.EquipmentRoom_T equipRoom ()
	{
		if (discriminator != mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.EQTROOM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equipRoom;
	}

	public void equipRoom (mtnm.tmforum.org.equipment.EquipmentRoom_T _x)
	{
		discriminator = mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.EQTROOM;
		equipRoom = _x;
	}

	public mtnm.tmforum.org.equipment.Cabinet_T cabinet_ ()
	{
		if (discriminator != mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.CABINET)
			throw new org.omg.CORBA.BAD_OPERATION();
		return cabinet_;
	}

	public void cabinet_ (mtnm.tmforum.org.equipment.Cabinet_T _x)
	{
		discriminator = mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.CABINET;
		cabinet_ = _x;
	}

	public mtnm.tmforum.org.equipment.Shelf_T shelf_ ()
	{
		if (discriminator != mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.SHELF)
			throw new org.omg.CORBA.BAD_OPERATION();
		return shelf_;
	}

	public void shelf_ (mtnm.tmforum.org.equipment.Shelf_T _x)
	{
		discriminator = mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.SHELF;
		shelf_ = _x;
	}

}
