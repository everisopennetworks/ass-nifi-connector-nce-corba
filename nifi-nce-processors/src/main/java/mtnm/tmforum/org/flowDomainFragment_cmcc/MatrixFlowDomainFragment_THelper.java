package mtnm.tmforum.org.flowDomainFragment_cmcc;


/**
 * Generated from IDL struct "MatrixFlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MatrixFlowDomainFragment_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MatrixFlowDomainFragment_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_THelper.id(),"MatrixFlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mfdfrType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.flowDomainFragment_cmcc.FDFrType_THelper.id(), "FDFrType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomainFragment_cmcc/MatrixFlowDomainFragment_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T result = new mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T();
		result.direction=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(in);
		result.aEnd = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.flexible=in.read_boolean();
		result.active=in.read_boolean();
		result.mfdfrType=in.read_string();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T s)
	{
		mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		out.write_boolean(s.flexible);
		out.write_boolean(s.active);
		java.lang.String tmpResult179 = s.mfdfrType;
out.write_string( tmpResult179 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
