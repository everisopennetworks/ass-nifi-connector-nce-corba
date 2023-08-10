package mtnm.tmforum.org.protection;


/**
 * Generated from IDL struct "EProtectionGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EProtectionGroup_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EProtectionGroup_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.protection.EProtectionGroup_THelper.id(),"EProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("eProtectionGroupType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.EProtectionGroupType_THelper.id(), "EProtectionGroupType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("protectionSchemeState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionSchemeState_THelper.id(),"ProtectionSchemeState_T",new String[]{"PSS_UNKNOWN","PSS_AUTOMATIC","PSS_FORCED_OR_LOCKED_OUT"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("protectedList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("protectingList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("ePgpParameters", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.protection.EProtectionGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.protection.EProtectionGroup_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/protection/EProtectionGroup_T:1.0";
	}
	public static mtnm.tmforum.org.protection.EProtectionGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.protection.EProtectionGroup_T result = new mtnm.tmforum.org.protection.EProtectionGroup_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.eProtectionGroupType=in.read_string();
		result.protectionSchemeState=mtnm.tmforum.org.protection.ProtectionSchemeState_THelper.read(in);
		result.reversionMode=mtnm.tmforum.org.protection.ReversionMode_THelper.read(in);
		result.protectedList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.protectingList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.ePgpParameters = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.protection.EProtectionGroup_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult644 = s.userLabel;
out.write_string( tmpResult644 );
		java.lang.String tmpResult645 = s.nativeEMSName;
out.write_string( tmpResult645 );
		java.lang.String tmpResult646 = s.owner;
out.write_string( tmpResult646 );
		java.lang.String tmpResult647 = s.eProtectionGroupType;
out.write_string( tmpResult647 );
		mtnm.tmforum.org.protection.ProtectionSchemeState_THelper.write(out,s.protectionSchemeState);
		mtnm.tmforum.org.protection.ReversionMode_THelper.write(out,s.reversionMode);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.protectedList);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.protectingList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.ePgpParameters);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
