package mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage;

/**
 * Generated from IDL struct "CommonObjSturct_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CommonObjSturct_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CommonObjSturct_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] attributes;
	public CommonObjSturct_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] attributes)
	{
		this.name = name;
		this.attributes = attributes;
	}
}
