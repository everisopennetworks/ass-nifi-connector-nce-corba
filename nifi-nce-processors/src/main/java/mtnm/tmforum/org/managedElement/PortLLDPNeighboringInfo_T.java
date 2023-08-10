package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "PortLLDPNeighboringInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PortLLDPNeighboringInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PortLLDPNeighboringInfo_T(){}
	public int neighboringNumber;
	public java.lang.String destinationAddress = "";
	public mtnm.tmforum.org.managedElement.NeighboringNodeType_T type;
	public mtnm.tmforum.org.managedElement.NeighboringNodeSubType_T subtype;
	public java.lang.String information = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public PortLLDPNeighboringInfo_T(int neighboringNumber, java.lang.String destinationAddress, mtnm.tmforum.org.managedElement.NeighboringNodeType_T type, mtnm.tmforum.org.managedElement.NeighboringNodeSubType_T subtype, java.lang.String information, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.neighboringNumber = neighboringNumber;
		this.destinationAddress = destinationAddress;
		this.type = type;
		this.subtype = subtype;
		this.information = information;
		this.additionalInfo = additionalInfo;
	}
}
