package mtnm.tmforum.org.flowDomainFragment;

/**
 * Generated from IDL struct "MatrixFlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MatrixFlowDomainFragment_T(){}
	public mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd;
	public boolean flexible;
	public mtnm.tmforum.org.flowDomainFragment.FDFrType_T mfdfrType;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(mtnm.tmforum.org.globaldefs.ConnectionDirection_T direction, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] aEnd, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] zEnd, boolean flexible, mtnm.tmforum.org.flowDomainFragment.FDFrType_T mfdfrType, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.flexible = flexible;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
