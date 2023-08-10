package mtnm.tmforum.org.encapsulationLayerLink;


/**
 * Generated from IDL struct "ELLinkCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ELLinkCreateData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ELLinkCreateData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_THelper.id(),"ELLinkCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.encapsulationLayerLink.LinkType_THelper.id(),"LinkType_T",new String[]{"LT_POINT_TO_POINT","LT_POINT_TO_MULTIPOINT","LT_MULTIPOINT"}), null),new org.omg.CORBA.StructMember("endTPs", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("segment", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("provisioningMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.encapsulationLayerLink.BandwidthProvisioningMode_THelper.id(),"BandwidthProvisioningMode_T",new String[]{"BP_NONE","BP_AUTOMATIC","BP_MANUAL","BP_BY_CALL"}), null),new org.omg.CORBA.StructMember("sncList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.SNCCreateDataList_THelper.id(), "SNCCreateDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.id(),"SNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_THelper.id(),"StaticProtectionLevel_T",new String[]{"PREEMPTIBLE","UNPROTECTED","PARTIALLY_PROTECTED","FULLY_PROTECTED","HIGHLY_PROTECTED"}), null),new org.omg.CORBA.StructMember("protectionEffort", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_THelper.id(),"ProtectionEffort_T",new String[]{"EFFORT_WHATEVER","EFFORT_SAME_OR_BETTER","EFFORT_SAME_OR_WORSE","EFFORT_SAME"}), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.Reroute_THelper.id(),"Reroute_T",new String[]{"RR_NA","RR_NO","RR_YES"}), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.NetworkRouted_THelper.id(),"NetworkRouted_T",new String[]{"NR_NA","NR_NO","NR_YES"}), null),new org.omg.CORBA.StructMember("sncType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"}), null),new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("ccInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.id(), "CrossConnectList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.id(),"CrossConnect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("ccType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"}), null),new org.omg.CORBA.StructMember("aEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("callName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkCreateData_T:1.0";
	}
	public static mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T result = new mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.transmissionParams=mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(in);
		result.rate=in.read_short();
		result.type=mtnm.tmforum.org.encapsulationLayerLink.LinkType_THelper.read(in);
		result.endTPs = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.segment=in.read_boolean();
		result.provisioningMode=mtnm.tmforum.org.encapsulationLayerLink.BandwidthProvisioningMode_THelper.read(in);
		result.sncList = mtnm.tmforum.org.subnetworkConnection.SNCCreateDataList_THelper.read(in);
		result.callName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.additionalCreationInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.encapsulationLayerLink.ELLinkCreateData_T s)
	{
		java.lang.String tmpResult68 = s.userLabel;
out.write_string( tmpResult68 );
		out.write_boolean(s.forceUniqueness);
		java.lang.String tmpResult69 = s.owner;
out.write_string( tmpResult69 );
		java.lang.String tmpResult70 = s.networkAccessDomain;
out.write_string( tmpResult70 );
		mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		out.write_short(s.rate);
		mtnm.tmforum.org.encapsulationLayerLink.LinkType_THelper.write(out,s.type);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.endTPs);
		out.write_boolean(s.segment);
		mtnm.tmforum.org.encapsulationLayerLink.BandwidthProvisioningMode_THelper.write(out,s.provisioningMode);
		mtnm.tmforum.org.subnetworkConnection.SNCCreateDataList_THelper.write(out,s.sncList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.callName);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
