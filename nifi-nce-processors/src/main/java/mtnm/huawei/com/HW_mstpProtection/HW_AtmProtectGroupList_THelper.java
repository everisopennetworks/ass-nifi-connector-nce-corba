package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL alias "HW_AtmProtectGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_AtmProtectGroupList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_AtmProtectGroupList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroupList_THelper.id(), "HW_AtmProtectGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THelper.id(),"HW_AtmProtectGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_THelper.id(),"HW_AtmProtectType_T",new String[]{"HW_APT_NA","HW_APT_NONE","HW_APT_1PLUS1","HW_APT_1V1"}), null),new org.omg.CORBA.StructMember("switchDirect", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.id(),"HW_AtmPGSwitchDirect_T",new String[]{"HW_ASD_NA","HW_ASD_SRC","HW_ASD_SNK","HW_ASD_BI"}), null),new org.omg.CORBA.StructMember("useState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGUseState_THelper.id(),"HW_AtmPGUseState_T",new String[]{"HW_AUS_NA","HW_AUS_USED","HW_AUS_UNUSED"}), null),new org.omg.CORBA.StructMember("srcEndPara", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.id(),"HW_AtmPGSingEndPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_THelper.id(),"HW_AtmPGSwitchType_T",new String[]{"HW_AST_NA","HW_AST_SINGLE_END","HW_AST_BI_END"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("holdOffTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("wtrTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("snkEndPara", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.id(),"HW_AtmPGSingEndPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_THelper.id(),"HW_AtmPGSwitchType_T",new String[]{"HW_AST_NA","HW_AST_SINGLE_END","HW_AST_BI_END"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("holdOffTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("wtrTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("ppList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPairList_THelper.id(), "HW_AtmServiceProtectPairList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.id(),"HW_AtmServiceProtectPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("workServiceName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("protectServiceName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("monitorFlag", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_THelper.id(),"HW_AtmMonitorFlag_T",new String[]{"HW_AMF_NA","HW_AMF_CONNECTION","HW_AMF_PROTECT_PAIR"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmProtectGroupList_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[] _result;
		int _l_result76 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result76 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result76);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[_l_result76];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectGroup_THelper.write(_out,_s[i]);
		}

	}
}
