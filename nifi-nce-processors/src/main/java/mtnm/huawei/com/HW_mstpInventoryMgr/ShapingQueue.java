package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "ShapingQueue".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ShapingQueue
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ShapingQueue(){}
	public int queueID;
	public boolean bEnable;
	public int CIR;
	public int CBS;
	public int EIR;
	public int EBS;
	public ShapingQueue(int queueID, boolean bEnable, int CIR, int CBS, int EIR, int EBS)
	{
		this.queueID = queueID;
		this.bEnable = bEnable;
		this.CIR = CIR;
		this.CBS = CBS;
		this.EIR = EIR;
		this.EBS = EBS;
	}
}
