package mtnm.tmforum.org.transmissionDescriptor;

/**
 * Generated from IDL union "TPorMFDorFDFr_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TPorMFDorFDFr_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TPorMFDorFDFr_THelper.class)
			{
				if (_type == null)
				{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[3];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP);
			members[0] = new org.omg.CORBA.UnionMember ("tp", label_any, mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD);
			members[1] = new org.omg.CORBA.UnionMember ("mfd", label_any, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr);
			members[2] = new org.omg.CORBA.UnionMember ("fdfr", label_any, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"TPorMFDorFDFr_T",org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.id(),"TPorMFDorFDFrQualifier_T",new String[]{"aTP","aMFD","aFDFr"}), members);
				}
			}
		}
			return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFr_T extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TPorMFDorFDFr_T:1.0";
	}
	public static TPorMFDorFDFr_T read (org.omg.CORBA.portable.InputStream in)
	{
		TPorMFDorFDFr_T result = new TPorMFDorFDFr_T();
		mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T disc;
		disc = mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aTP:
			{
				mtnm.tmforum.org.terminationPoint.TerminationPoint_T _var;
				_var=mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.read(in);
				result.tp (_var);
				break;
			}
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aMFD:
			{
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T _var;
				_var=mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.read(in);
				result.mfd (_var);
				break;
			}
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aFDFr:
			{
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T _var;
				_var=mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(in);
				result.fdfr (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, TPorMFDorFDFr_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aTP:
			{
				mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.write(out,s.tp ());
				break;
			}
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aMFD:
			{
				mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.write(out,s.mfd ());
				break;
			}
			case mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aFDFr:
			{
				mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.write(out,s.fdfr ());
				break;
			}
		}
	}
}
