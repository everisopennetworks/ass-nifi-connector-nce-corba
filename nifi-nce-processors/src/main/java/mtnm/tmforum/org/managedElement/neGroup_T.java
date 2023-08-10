package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "neGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public neGroup_T(){}
	public java.lang.String neGroupName = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList;
	public neGroup_T(java.lang.String neGroupName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] nameList)
	{
		this.neGroupName = neGroupName;
		this.nameList = nameList;
	}
}
