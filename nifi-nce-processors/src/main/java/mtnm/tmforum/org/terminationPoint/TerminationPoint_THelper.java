package mtnm.tmforum.org.terminationPoint;


/**
 * Generated from IDL struct "TerminationPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TerminationPoint_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TerminationPoint_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.id(),"TerminationPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ingressTrafficDescriptorName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("egressTrafficDescriptorName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.TPType_THelper.id(),"TPType_T",new String[]{"TPT_PTP","TPT_CTP","TPT_TPPool"}), null),new org.omg.CORBA.StructMember("connectionState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.TPConnectionState_THelper.id(),"TPConnectionState_T",new String[]{"TPCS_NA","TPCS_SOURCE_CONNECTED","TPCS_SINK_CONNECTED","TPCS_BI_CONNECTED","TPCS_NOT_CONNECTED"}), null),new org.omg.CORBA.StructMember("tpMappingMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.TerminationMode_THelper.id(),"TerminationMode_T",new String[]{"TM_NA","TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING","TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING"}), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.Directionality_THelper.id(),"Directionality_T",new String[]{"D_NA","D_BIDIRECTIONAL","D_SOURCE","D_SINK"}), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.id(), "LayeredParameterList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("tpProtectionAssociation", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_THelper.id(),"TPProtectionAssociation_T",new String[]{"TPPA_NA","TPPA_PSR_RELATED"}), null),new org.omg.CORBA.StructMember("edgePoint", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.terminationPoint.TerminationPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.terminationPoint.TerminationPoint_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationPoint_T:1.0";
	}
	public static mtnm.tmforum.org.terminationPoint.TerminationPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.terminationPoint.TerminationPoint_T result = new mtnm.tmforum.org.terminationPoint.TerminationPoint_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.ingressTrafficDescriptorName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.egressTrafficDescriptorName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.type=mtnm.tmforum.org.terminationPoint.TPType_THelper.read(in);
		result.connectionState=mtnm.tmforum.org.terminationPoint.TPConnectionState_THelper.read(in);
		result.tpMappingMode=mtnm.tmforum.org.terminationPoint.TerminationMode_THelper.read(in);
		result.direction=mtnm.tmforum.org.terminationPoint.Directionality_THelper.read(in);
		result.transmissionParams = mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.tpProtectionAssociation=mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_THelper.read(in);
		result.edgePoint=in.read_boolean();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.terminationPoint.TerminationPoint_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult680 = s.userLabel;
out.write_string( tmpResult680 );
		java.lang.String tmpResult681 = s.nativeEMSName;
out.write_string( tmpResult681 );
		java.lang.String tmpResult682 = s.owner;
out.write_string( tmpResult682 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.ingressTrafficDescriptorName);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.egressTrafficDescriptorName);
		mtnm.tmforum.org.terminationPoint.TPType_THelper.write(out,s.type);
		mtnm.tmforum.org.terminationPoint.TPConnectionState_THelper.write(out,s.connectionState);
		mtnm.tmforum.org.terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		mtnm.tmforum.org.terminationPoint.Directionality_THelper.write(out,s.direction);
		mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		mtnm.tmforum.org.terminationPoint.TPProtectionAssociation_THelper.write(out,s.tpProtectionAssociation);
		out.write_boolean(s.edgePoint);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
