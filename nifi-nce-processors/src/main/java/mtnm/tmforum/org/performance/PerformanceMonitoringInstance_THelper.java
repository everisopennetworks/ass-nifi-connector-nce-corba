package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PerformanceMonitoringInstance_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PerformanceMonitoringInstance_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PerformanceMonitoringInstance_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceMonitoringInstance_THelper.id(),"PerformanceMonitoringInstance_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorExtensions", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("resourceRef", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("pmmc", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.id(),"PmMonitorConditioning_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("granularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.Granularity_THelper.id(), "Granularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("startTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("endTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmScheduleName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("template", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceTemplate_THelper.id(),"PerformanceTemplate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}), null),new org.omg.CORBA.StructMember("intanceType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null)}), null),new org.omg.CORBA.StructMember("status", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.ActivityStatusEnum_THelper.id(),"ActivityStatusEnum_T",new String[]{"NOT_STARTED","ACTIVE","SUSPENDED"}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PerformanceMonitoringInstance_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T result = new mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorExtensions=in.read_any();
		result.resourceRef = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.pmmc=mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.read(in);
		result.status=mtnm.tmforum.org.performance.ActivityStatusEnum_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PerformanceMonitoringInstance_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult588 = s.userLabel;
out.write_string( tmpResult588 );
		java.lang.String tmpResult589 = s.nativeEMSName;
out.write_string( tmpResult589 );
		out.write_any(s.vendorExtensions);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.resourceRef);
		mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.write(out,s.pmmc);
		mtnm.tmforum.org.performance.ActivityStatusEnum_THelper.write(out,s.status);
	}
}
