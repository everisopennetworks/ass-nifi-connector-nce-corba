package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "EndTPFaultStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EndTPFaultStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EndTPFaultStatus_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endTP;
	public java.lang.String status = "";
	public java.lang.String position = "";
	public EndTPFaultStatus_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] endTP, java.lang.String status, java.lang.String position)
	{
		this.endTP = endTP;
		this.status = status;
		this.position = position;
	}
}
