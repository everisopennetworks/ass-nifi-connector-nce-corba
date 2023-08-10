package mtnm.tmforum.org.trailNtwProtection;


/**
 * Generated from IDL struct "TrailNtwProtCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TrailNtwProtCreateData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TrailNtwProtCreateData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_THelper.id(),"TrailNtwProtCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("trailNtwProtectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("workerTrailList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesMultipleList_THelper.id(), "NamingAttributesMultipleList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.type())), null),new org.omg.CORBA.StructMember("protectionTrail", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("protectionGroupAName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("protectionGroupZName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("modifiableAttributes", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.id(),"TrailNtwProtModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionGroupType_THelper.id(),"ProtectionGroupType_T",new String[]{"PGT_MSP_1_PLUS_1","PGT_MSP_1_FOR_N","PGT_2_FIBER_BLSR","PGT_4_FIBER_BLSR"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("pgATPList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("pgZTPList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("tnpParameters", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("apsFunction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtCreateData_T:1.0";
	}
	public static mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T result = new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T();
		result.rate=in.read_short();
		result.trailNtwProtectionType=in.read_string();
		result.workerTrailList = mtnm.tmforum.org.globaldefs.NamingAttributesMultipleList_THelper.read(in);
		result.protectionTrail = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.protectionGroupAName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.protectionGroupZName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.modifiableAttributes=mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtCreateData_T s)
	{
		out.write_short(s.rate);
		java.lang.String tmpResult730 = s.trailNtwProtectionType;
out.write_string( tmpResult730 );
		mtnm.tmforum.org.globaldefs.NamingAttributesMultipleList_THelper.write(out,s.workerTrailList);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.protectionTrail);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.protectionGroupAName);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.protectionGroupZName);
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.write(out,s.modifiableAttributes);
	}
}
