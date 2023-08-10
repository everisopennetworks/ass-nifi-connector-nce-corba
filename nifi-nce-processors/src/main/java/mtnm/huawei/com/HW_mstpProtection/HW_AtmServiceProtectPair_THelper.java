package mtnm.huawei.com.HW_mstpProtection;


/**
 * Generated from IDL struct "HW_AtmServiceProtectPair_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_AtmServiceProtectPair_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_AtmServiceProtectPair_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_THelper.id(),"HW_AtmServiceProtectPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("workServiceName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("protectServiceName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("monitorFlag", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_THelper.id(),"HW_AtmMonitorFlag_T",new String[]{"HW_AMF_NA","HW_AMF_CONNECTION","HW_AMF_PROTECT_PAIR"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_AtmServiceProtectPair_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T result = new mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T();
		result.workServiceName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.protectServiceName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.monitorFlag=mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_mstpProtection.HW_AtmServiceProtectPair_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.workServiceName);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.protectServiceName);
		mtnm.huawei.com.HW_mstpProtection.HW_AtmMonitorFlag_THelper.write(out,s.monitorFlag);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
