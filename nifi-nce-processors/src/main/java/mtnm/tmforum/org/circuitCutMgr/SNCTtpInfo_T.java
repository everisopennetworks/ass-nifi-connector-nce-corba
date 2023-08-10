package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "SNCTtpInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SNCTtpInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SNCTtpInfo_T(){}
	public int NEID;
	public mtnm.tmforum.org.circuitCutMgr.TtpDirection tpDirection;
	public mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate;
	public SNCTtpInfo_T(int NEID, mtnm.tmforum.org.circuitCutMgr.TtpDirection tpDirection, mtnm.tmforum.org.circuitCutMgr.SNCRate_T rate)
	{
		this.NEID = NEID;
		this.tpDirection = tpDirection;
		this.rate = rate;
	}
}
