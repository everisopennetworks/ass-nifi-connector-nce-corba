package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "PortInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PortInfo_T(){}
	public int portID;
	public int slotID;
	public PortInfo_T(int portID, int slotID)
	{
		this.portID = portID;
		this.slotID = slotID;
	}
}
