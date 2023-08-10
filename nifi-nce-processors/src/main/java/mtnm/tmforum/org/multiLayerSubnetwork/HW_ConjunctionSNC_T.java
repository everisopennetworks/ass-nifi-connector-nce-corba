package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL struct "HW_ConjunctionSNC_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ConjunctionSNC_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_ConjunctionSNC_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName1;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName2;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ConjunctionSNC_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName1, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName2, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName1 = sncName1;
		this.sncName2 = sncName2;
		this.additionalInfo = additionalInfo;
	}
}
