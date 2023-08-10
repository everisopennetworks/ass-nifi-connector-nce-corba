package mtnm.huawei.com.HW_mstpProtection;


/**
 * Generated from IDL struct "HW_AtmPGSingEndPara_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_AtmPGSingEndPara_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_AtmPGSingEndPara_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.id(),"HW_AtmPGSingEndPara_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("switchType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_THelper.id(),"HW_AtmPGSwitchType_T",new String[]{"HW_AST_NA","HW_AST_SINGLE_END","HW_AST_BI_END"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("holdOffTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("wtrTime", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmPGSingEndPara_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T result = new mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T();
		result.switchType=mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_THelper.read(in);
		result.reversionMode=mtnm.tmforum.org.protection.ReversionMode_THelper.read(in);
		result.holdOffTime=in.read_ulong();
		result.wtrTime=in.read_ulong();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T s)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSwitchType_THelper.write(out,s.switchType);
		mtnm.tmforum.org.protection.ReversionMode_THelper.write(out,s.reversionMode);
		out.write_ulong(s.holdOffTime);
		out.write_ulong(s.wtrTime);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
