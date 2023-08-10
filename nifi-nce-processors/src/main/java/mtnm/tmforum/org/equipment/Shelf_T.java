package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "Shelf_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Shelf_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Shelf_T(){}
	public java.lang.String name = "";
	public java.lang.String equipmentRoomName = "";
	public java.lang.String cabinetName = "";
	public java.lang.String numbering = "";
	public java.lang.String locationOfCabinet = "";
	public java.lang.String memo = "";
	public Shelf_T(java.lang.String name, java.lang.String equipmentRoomName, java.lang.String cabinetName, java.lang.String numbering, java.lang.String locationOfCabinet, java.lang.String memo)
	{
		this.name = name;
		this.equipmentRoomName = equipmentRoomName;
		this.cabinetName = cabinetName;
		this.numbering = numbering;
		this.locationOfCabinet = locationOfCabinet;
		this.memo = memo;
	}
}
