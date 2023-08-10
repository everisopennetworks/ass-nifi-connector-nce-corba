package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL struct "ServiceName_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceName_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceName_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public ServiceName_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
	}
}
