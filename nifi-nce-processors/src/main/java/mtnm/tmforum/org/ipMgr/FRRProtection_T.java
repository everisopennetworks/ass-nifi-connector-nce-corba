package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "FRRProtection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FRRProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FRRProtection_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionType = "";
	public short rate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] frrParameters;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] bindingObject;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FRRProtection_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionType, short rate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] frrParameters, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] bindingObject, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionType = protectionType;
		this.rate = rate;
		this.tpList = tpList;
		this.frrParameters = frrParameters;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
}
