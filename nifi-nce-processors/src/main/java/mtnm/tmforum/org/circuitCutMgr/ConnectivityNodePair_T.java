package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL struct "ConnectivityNodePair_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectivityNodePair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ConnectivityNodePair_T(){}
	public int aEnd;
	public int zEnd;
	public ConnectivityNodePair_T(int aEnd, int zEnd)
	{
		this.aEnd = aEnd;
		this.zEnd = zEnd;
	}
}
