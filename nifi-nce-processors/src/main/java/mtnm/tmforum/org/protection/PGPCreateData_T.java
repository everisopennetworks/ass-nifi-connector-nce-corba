package mtnm.tmforum.org.protection;

/**
 * Generated from IDL struct "PGPCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PGPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PGPCreateData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType;
	public short rate;
	public mtnm.tmforum.org.protection.PGPModifyData_T modifiableAttributes;
	public PGPCreateData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, mtnm.tmforum.org.protection.ProtectionGroupType_T protectionGroupType, short rate, mtnm.tmforum.org.protection.PGPModifyData_T modifiableAttributes)
	{
		this.name = name;
		this.protectionGroupType = protectionGroupType;
		this.rate = rate;
		this.modifiableAttributes = modifiableAttributes;
	}
}
