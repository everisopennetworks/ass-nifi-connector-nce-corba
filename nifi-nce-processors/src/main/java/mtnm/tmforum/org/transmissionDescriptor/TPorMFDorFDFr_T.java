package mtnm.tmforum.org.transmissionDescriptor;

/**
 * Generated from IDL union "TPorMFDorFDFr_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPorMFDorFDFr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator;
	private mtnm.tmforum.org.terminationPoint.TerminationPoint_T tp;
	private mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T mfd;
	private mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T fdfr;

	public TPorMFDorFDFr_T ()
	{
	}

	public mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator ()
	{
		return discriminator;
	}

	public mtnm.tmforum.org.terminationPoint.TerminationPoint_T tp ()
	{
		if (discriminator != mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tp;
	}

	public void tp (mtnm.tmforum.org.terminationPoint.TerminationPoint_T _x)
	{
		discriminator = mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP;
		tp = _x;
	}

	public mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T mfd ()
	{
		if (discriminator != mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD)
			throw new org.omg.CORBA.BAD_OPERATION();
		return mfd;
	}

	public void mfd (mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T _x)
	{
		discriminator = mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD;
		mfd = _x;
	}

	public mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T fdfr ()
	{
		if (discriminator != mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr)
			throw new org.omg.CORBA.BAD_OPERATION();
		return fdfr;
	}

	public void fdfr (mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T _x)
	{
		discriminator = mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr;
		fdfr = _x;
	}

}
