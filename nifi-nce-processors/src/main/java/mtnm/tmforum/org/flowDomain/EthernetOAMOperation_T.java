package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "EthernetOAMOperation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EthernetOAMOperation_T(){}
	public mtnm.tmforum.org.flowDomain.EthernetOAMCommandType_T command;
	public mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T srcPoint;
	public mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T snkPoint;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMOperation_T(mtnm.tmforum.org.flowDomain.EthernetOAMCommandType_T command, mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T srcPoint, mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T snkPoint, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.command = command;
		this.srcPoint = srcPoint;
		this.snkPoint = snkPoint;
		this.additionalInfo = additionalInfo;
	}
}
