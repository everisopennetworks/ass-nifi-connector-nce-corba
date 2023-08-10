package mtnm.tmforum.org.subnetworkConnection;


/**
 * Generated from IDL struct "SNCCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class SNCCreateData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SNCCreateData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.SNCCreateData_THelper.id(),"SNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("staticProtectionLevel", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_THelper.id(),"StaticProtectionLevel_T",new String[]{"PREEMPTIBLE","UNPROTECTED","PARTIALLY_PROTECTED","FULLY_PROTECTED","HIGHLY_PROTECTED"}), null),new org.omg.CORBA.StructMember("protectionEffort", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_THelper.id(),"ProtectionEffort_T",new String[]{"EFFORT_WHATEVER","EFFORT_SAME_OR_BETTER","EFFORT_SAME_OR_WORSE","EFFORT_SAME"}), null),new org.omg.CORBA.StructMember("rerouteAllowed", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.Reroute_THelper.id(),"Reroute_T",new String[]{"RR_NA","RR_NO","RR_YES"}), null),new org.omg.CORBA.StructMember("networkRouted", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.NetworkRouted_THelper.id(),"NetworkRouted_T",new String[]{"NR_NA","NR_NO","NR_YES"}), null),new org.omg.CORBA.StructMember("sncType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"}), null),new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("ccInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.id(), "CrossConnectList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.id(),"CrossConnect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("ccType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"}), null),new org.omg.CORBA.StructMember("aEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/subnetworkConnection/SNCCreateData_T:1.0";
	}
	public static mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T result = new mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.direction=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(in);
		result.staticProtectionLevel=mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_THelper.read(in);
		result.protectionEffort=mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_THelper.read(in);
		result.rerouteAllowed=mtnm.tmforum.org.subnetworkConnection.Reroute_THelper.read(in);
		result.networkRouted=mtnm.tmforum.org.subnetworkConnection.NetworkRouted_THelper.read(in);
		result.sncType=mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.read(in);
		result.layerRate=in.read_short();
		result.ccInclusions = mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.read(in);
		result.neTpInclusions = mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.read(in);
		result.aEnd = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.zEnd = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalCreationInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.subnetworkConnection.SNCCreateData_T s)
	{
		java.lang.String tmpResult668 = s.userLabel;
out.write_string( tmpResult668 );
		out.write_boolean(s.forceUniqueness);
		java.lang.String tmpResult669 = s.owner;
out.write_string( tmpResult669 );
		mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.subnetworkConnection.StaticProtectionLevel_THelper.write(out,s.staticProtectionLevel);
		mtnm.tmforum.org.subnetworkConnection.ProtectionEffort_THelper.write(out,s.protectionEffort);
		mtnm.tmforum.org.subnetworkConnection.Reroute_THelper.write(out,s.rerouteAllowed);
		mtnm.tmforum.org.subnetworkConnection.NetworkRouted_THelper.write(out,s.networkRouted);
		mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.write(out,s.sncType);
		out.write_short(s.layerRate);
		mtnm.tmforum.org.subnetworkConnection.CrossConnectList_THelper.write(out,s.ccInclusions);
		mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.aEnd);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.zEnd);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
