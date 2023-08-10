package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "ObjectAdditionalInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ObjectAdditionalInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ObjectAdditionalInfo_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ObjectAdditionalInfo_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.additionalInfo = additionalInfo;
	}
}
