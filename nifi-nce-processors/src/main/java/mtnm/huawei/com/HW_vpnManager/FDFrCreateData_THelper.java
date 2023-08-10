package mtnm.huawei.com.HW_vpnManager;


/**
 * Generated from IDL struct "FDFrCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FDFrCreateData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FDFrCreateData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.FDFrCreateData_THelper.id(),"FDFrCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("multipointServiceAttr", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_THelper.id(),"MultipointServiceAttr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("paraList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("staticMacList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_vpnManager.StaticMacAddressList_THelper.id(), "StaticMacAddressList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.StaticMacAddress_THelper.id(),"StaticMacAddress_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("staticMacType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("macAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("peVID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("ceVID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("tpName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("shgList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_vpnManager.SplitHorizonGroupAttrList_THelper.id(), "SplitHorizonGroupAttrList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.SplitHorizonGroup_THelper.id(),"SplitHorizonGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("shgID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("shgMemberNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("vendorExtensions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_vpnManager.ServerTrailListType_THelper.id(), "ServerTrailListType_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.ServerTrailType_THelper.id(),"ServerTrailType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serverConnectionList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_vpnManager.ServerConnectionListType_THelper.id(), "ServerConnectionListType_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.ServerConnectionType_THelper.id(),"ServerConnectionType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("channel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("usedAs", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_vpnManager.UsedAsType_THelper.id(),"UsedAsType_T",new String[]{"UA_WORKING","UA_PROTECTION","UA_DNI"}), null)}))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null)}))), null),new org.omg.CORBA.StructMember("fdfrType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_vpnManager.FDFrType_THelper.id(), "FDFrType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("additionalCreationInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_vpnManager/FDFrCreateData_T:1.0";
	}
	public static mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T result = new mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(in);
		result.transmissionParams=mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.read(in);
		result.multipointServiceAttr=mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_THelper.read(in);
		result.vendorExtensions = mtnm.huawei.com.HW_vpnManager.ServerTrailListType_THelper.read(in);
		result.fdfrType=in.read_string();
		result.additionalCreationInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_vpnManager.FDFrCreateData_T s)
	{
		java.lang.String tmpResult378 = s.userLabel;
out.write_string( tmpResult378 );
		out.write_boolean(s.forceUniqueness);
		java.lang.String tmpResult379 = s.nativeEMSName;
out.write_string( tmpResult379 );
		java.lang.String tmpResult380 = s.owner;
out.write_string( tmpResult380 );
		mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.write(out,s.transmissionParams);
		mtnm.huawei.com.HW_vpnManager.MultipointServiceAttr_THelper.write(out,s.multipointServiceAttr);
		mtnm.huawei.com.HW_vpnManager.ServerTrailListType_THelper.write(out,s.vendorExtensions);
		java.lang.String tmpResult381 = s.fdfrType;
out.write_string( tmpResult381 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
