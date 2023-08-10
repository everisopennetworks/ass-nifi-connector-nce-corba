package mtnm.huawei.com.HW_mstpProtection;


/**
 * Generated from IDL struct "HW_AtmPGSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_AtmPGSwitchData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_AtmPGSwitchData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_THelper.id(),"HW_AtmPGSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pgName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("protectType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_THelper.id(),"HW_AtmProtectType_T",new String[]{"HW_APT_NA","HW_APT_NONE","HW_APT_1PLUS1","HW_APT_1V1"}), null),new org.omg.CORBA.StructMember("srcEndSwitchPara", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.id(),"HW_AtmPGSingleEndSwitchPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchReason", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.SwitchReason_THelper.id(),"SwitchReason_T",new String[]{"SR_NA","SR_RESTORED","SR_SIGNAL_FAIL","SR_SIGNAL_MISMATCH","SR_SIGNAL_DEGRADE","SR_AUTOMATIC_SWITCH","SR_MANUAL"}), null),new org.omg.CORBA.StructMember("switchState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_THelper.id(),"HW_SwitchState_T",new String[]{"HW_SS_NA","HW_SS_IDLE","HW_SS_SWITCH","HW_SS_PASS_THROUGH"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("snkEndSwitchPara", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.id(),"HW_AtmPGSingleEndSwitchPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchReason", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.SwitchReason_THelper.id(),"SwitchReason_T",new String[]{"SR_NA","SR_RESTORED","SR_SIGNAL_FAIL","SR_SIGNAL_MISMATCH","SR_SIGNAL_DEGRADE","SR_AUTOMATIC_SWITCH","SR_MANUAL"}), null),new org.omg.CORBA.StructMember("switchState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_THelper.id(),"HW_SwitchState_T",new String[]{"HW_SS_NA","HW_SS_IDLE","HW_SS_SWITCH","HW_SS_PASS_THROUGH"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSwitchData_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T result = new mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T();
		result.pgName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.protectType=mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_THelper.read(in);
		result.srcEndSwitchPara=mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.snkEndSwitchPara=mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchData_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.pgName);
		mtnm.huawei.com.HW_mstpProtection.HW_AtmProtectType_THelper.write(out,s.protectType);
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.srcEndSwitchPara);
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingleEndSwitchPara_THelper.write(out,s.snkEndSwitchPara);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
