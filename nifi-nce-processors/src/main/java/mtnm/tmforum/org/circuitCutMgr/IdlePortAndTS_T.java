package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "IdlePortAndTS_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IdlePortAndTS_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IdlePortAndTS_T(){}
	public int slotID;
	public int portID;
	public int slotNo;
	public mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T[] SlotInfoList;
	public IdlePortAndTS_T(int slotID, int portID, int slotNo, mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T[] SlotInfoList)
	{
		this.slotID = slotID;
		this.portID = portID;
		this.slotNo = slotNo;
		this.SlotInfoList = SlotInfoList;
	}
}
