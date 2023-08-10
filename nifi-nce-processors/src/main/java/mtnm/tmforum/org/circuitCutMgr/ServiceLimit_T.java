package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ServiceLimit_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceLimit_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceLimit_T(){}
	public int speciSeriveTrailID;
	public int[] speciTS;
	public int aNe;
	public ServiceLimit_T(int speciSeriveTrailID, int[] speciTS, int aNe)
	{
		this.speciSeriveTrailID = speciSeriveTrailID;
		this.speciTS = speciTS;
		this.aNe = aNe;
	}
}
