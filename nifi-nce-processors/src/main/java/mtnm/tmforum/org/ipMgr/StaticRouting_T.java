package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "StaticRouting_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class StaticRouting_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StaticRouting_T(){}
	public java.lang.String destIP = "";
	public java.lang.String destMask = "";
	public java.lang.String nextHopIP = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] outPort;
	public java.lang.String priority = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] bindingObject;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public StaticRouting_T(java.lang.String destIP, java.lang.String destMask, java.lang.String nextHopIP, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] outPort, java.lang.String priority, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] bindingObject, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.destIP = destIP;
		this.destMask = destMask;
		this.nextHopIP = nextHopIP;
		this.outPort = outPort;
		this.priority = priority;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
}
