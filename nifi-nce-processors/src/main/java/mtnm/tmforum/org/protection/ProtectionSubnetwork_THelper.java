package mtnm.tmforum.org.protection;


/**
 * Generated from IDL struct "ProtectionSubnetwork_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProtectionSubnetwork_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProtectionSubnetwork_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.protection.ProtectionSubnetwork_THelper.id(),"ProtectionSubnetwork_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("psnType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionSubnetworkType_THelper.id(),"ProtectionSubnetworkType_T",new String[]{"PSNT_MSP_1_PLUS_1","PSNT_MSP_M_FOR_N","PSNT_2_FIBER_ULSR","PSNT_2_FIBER_BLSR","PSNT_4_FIBER_BLSR","PSNT_USNCP","PSNT_BSNCP","PSNT_UPP","PSNT_BPP","PSNT_NP","PSNT_SNC_NODE","PSNT_NPL","PSNT_NPR"}), null),new org.omg.CORBA.StructMember("neIDList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.NEIDSeq_THelper.id(), "NEIDSeq_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)))), null),new org.omg.CORBA.StructMember("psnLinks", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.ProtectionSubnetworkCircle_THelper.id(), "ProtectionSubnetworkCircle_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.protection.ProtectionSubnetworkSection_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.protection.ProtectionSubnetwork_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.protection.ProtectionSubnetwork_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetwork_T:1.0";
	}
	public static mtnm.tmforum.org.protection.ProtectionSubnetwork_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.protection.ProtectionSubnetwork_T result = new mtnm.tmforum.org.protection.ProtectionSubnetwork_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.layerRate=in.read_short();
		result.psnType=mtnm.tmforum.org.protection.ProtectionSubnetworkType_THelper.read(in);
		result.neIDList = mtnm.tmforum.org.protection.NEIDSeq_THelper.read(in);
		result.psnLinks = mtnm.tmforum.org.protection.ProtectionSubnetworkCircle_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.protection.ProtectionSubnetwork_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult629 = s.userLabel;
out.write_string( tmpResult629 );
		java.lang.String tmpResult630 = s.nativeEMSName;
out.write_string( tmpResult630 );
		java.lang.String tmpResult631 = s.owner;
out.write_string( tmpResult631 );
		out.write_short(s.layerRate);
		mtnm.tmforum.org.protection.ProtectionSubnetworkType_THelper.write(out,s.psnType);
		mtnm.tmforum.org.protection.NEIDSeq_THelper.write(out,s.neIDList);
		mtnm.tmforum.org.protection.ProtectionSubnetworkCircle_THelper.write(out,s.psnLinks);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
