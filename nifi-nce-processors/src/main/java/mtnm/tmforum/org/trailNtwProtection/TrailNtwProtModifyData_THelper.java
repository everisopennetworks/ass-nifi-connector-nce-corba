package mtnm.tmforum.org.trailNtwProtection;


/**
 * Generated from IDL struct "TrailNtwProtModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TrailNtwProtModifyData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TrailNtwProtModifyData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_THelper.id(),"TrailNtwProtModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionGroupType_THelper.id(),"ProtectionGroupType_T",new String[]{"PGT_MSP_1_PLUS_1","PGT_MSP_1_FOR_N","PGT_2_FIBER_BLSR","PGT_4_FIBER_BLSR"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("pgATPList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("pgZTPList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("tnpParameters", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("apsFunction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtModifyData_T:1.0";
	}
	public static mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T result = new mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.protectionGroupType=mtnm.tmforum.org.protection.ProtectionGroupType_THelper.read(in);
		result.reversionMode=mtnm.tmforum.org.protection.ReversionMode_THelper.read(in);
		result.pgATPList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.pgZTPList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.tnpParameters = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.apsFunction=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.trailNtwProtection.TrailNtwProtModifyData_T s)
	{
		java.lang.String tmpResult725 = s.userLabel;
out.write_string( tmpResult725 );
		out.write_boolean(s.forceUniqueness);
		java.lang.String tmpResult726 = s.nativeEMSName;
out.write_string( tmpResult726 );
		java.lang.String tmpResult727 = s.owner;
out.write_string( tmpResult727 );
		mtnm.tmforum.org.protection.ProtectionGroupType_THelper.write(out,s.protectionGroupType);
		mtnm.tmforum.org.protection.ReversionMode_THelper.write(out,s.reversionMode);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.pgATPList);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.pgZTPList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.tnpParameters);
		java.lang.String tmpResult728 = s.apsFunction;
out.write_string( tmpResult728 );
		java.lang.String tmpResult729 = s.networkAccessDomain;
out.write_string( tmpResult729 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
