package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "EthLTCheckPerHopResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthLTCheckPerHopResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EthLTCheckPerHopResult_T(){}
	public java.lang.String result = "";
	public java.lang.String reason = "";
	public java.lang.String hops = "";
	public java.lang.String replyAction = "";
	public java.lang.String forwarded = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressPort;
	public java.lang.String ingressMac = "";
	public java.lang.String ingressAction = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressPort;
	public java.lang.String egressMac = "";
	public java.lang.String egressAction = "";
	public EthLTCheckPerHopResult_T(java.lang.String result, java.lang.String reason, java.lang.String hops, java.lang.String replyAction, java.lang.String forwarded, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ingressPort, java.lang.String ingressMac, java.lang.String ingressAction, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] egressPort, java.lang.String egressMac, java.lang.String egressAction)
	{
		this.result = result;
		this.reason = reason;
		this.hops = hops;
		this.replyAction = replyAction;
		this.forwarded = forwarded;
		this.ingressPort = ingressPort;
		this.ingressMac = ingressMac;
		this.ingressAction = ingressAction;
		this.egressPort = egressPort;
		this.egressMac = egressMac;
		this.egressAction = egressAction;
	}
}
