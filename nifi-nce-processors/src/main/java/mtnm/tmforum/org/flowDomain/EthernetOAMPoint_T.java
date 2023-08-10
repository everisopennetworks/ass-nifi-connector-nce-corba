package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "EthernetOAMPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetOAMPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EthernetOAMPoint_T(){}
	public java.lang.String Name = "";
	public mtnm.tmforum.org.flowDomain.EthernetOAMPointType_T type;
	public mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_T direction;
	public int level;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMPoint_T(java.lang.String Name, mtnm.tmforum.org.flowDomain.EthernetOAMPointType_T type, mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_T direction, int level, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.Name = Name;
		this.type = type;
		this.direction = direction;
		this.level = level;
		this.additionalInfo = additionalInfo;
	}
}
