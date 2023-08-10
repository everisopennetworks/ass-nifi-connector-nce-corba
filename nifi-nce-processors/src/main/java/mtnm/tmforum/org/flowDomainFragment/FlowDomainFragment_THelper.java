package mtnm.tmforum.org.flowDomainFragment;


/**
 * Generated from IDL struct "FlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FlowDomainFragment_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FlowDomainFragment_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.id(),"FlowDomainFragment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("endTPs", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("flexible", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.AdministrativeState_THelper.id(),"AdministrativeState_T",new String[]{"AS_Locked","AS_Unlocked"}), null),new org.omg.CORBA.StructMember("fdfrState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCState_THelper.id(),"SNCState_T",new String[]{"SNCS_NONEXISTENT","SNCS_PENDING","SNCS_ACTIVE","SNCS_PARTIAL"}), null),new org.omg.CORBA.StructMember("fdfrType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.flowDomainFragment.FDFrType_THelper.id(),"FDFrType_T",new String[]{"FDFRT_POINT_TO_POINT","FDFRT_POINT_TO_MULTIPOINT","FDFRT_MULTIPOINT"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomainFragment/FlowDomainFragment_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T result = new mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(in);
		result.endTPs = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.networkAccessDomain=in.read_string();
		result.flexible=in.read_boolean();
		result.administrativeState=mtnm.tmforum.org.performance.AdministrativeState_THelper.read(in);
		result.fdfrState=mtnm.tmforum.org.subnetworkConnection.SNCState_THelper.read(in);
		result.fdfrType=mtnm.tmforum.org.flowDomainFragment.FDFrType_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult168 = s.userLabel;
out.write_string( tmpResult168 );
		java.lang.String tmpResult169 = s.nativeEMSName;
out.write_string( tmpResult169 );
		java.lang.String tmpResult170 = s.owner;
out.write_string( tmpResult170 );
		mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.endTPs);
		java.lang.String tmpResult171 = s.networkAccessDomain;
out.write_string( tmpResult171 );
		out.write_boolean(s.flexible);
		mtnm.tmforum.org.performance.AdministrativeState_THelper.write(out,s.administrativeState);
		mtnm.tmforum.org.subnetworkConnection.SNCState_THelper.write(out,s.fdfrState);
		mtnm.tmforum.org.flowDomainFragment.FDFrType_THelper.write(out,s.fdfrType);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
