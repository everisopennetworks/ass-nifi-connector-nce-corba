package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PerformanceCreateInstance_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PerformanceCreateInstance_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PerformanceCreateInstance_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceCreateInstance_THelper.id(),"PerformanceCreateInstance_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vendorExtensions", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null),new org.omg.CORBA.StructMember("resType", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("scheduleName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("startTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("endTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("resource", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PerformanceCreateResourceList_THelper.id(), "PerformanceCreateResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceCreateResource_THelper.id(),"PerformanceCreateResource_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("resourceRef", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("resourceSLA", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null)}))), null),new org.omg.CORBA.StructMember("template", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PerformanceTemplateList_THelper.id(), "PerformanceTemplateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceTemplate_THelper.id(),"PerformanceTemplate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PerformanceCreateInstance_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PerformanceCreateInstance_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PerformanceCreateInstance_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PerformanceCreateInstance_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PerformanceCreateInstance_T result = new mtnm.tmforum.org.performance.PerformanceCreateInstance_T();
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.vendorExtensions=in.read_any();
		result.resType=in.read_ulong();
		result.scheduleName=in.read_string();
		result.startTime=in.read_string();
		result.endTime=in.read_string();
		result.resource = mtnm.tmforum.org.performance.PerformanceCreateResourceList_THelper.read(in);
		result.template = mtnm.tmforum.org.performance.PerformanceTemplateList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PerformanceCreateInstance_T s)
	{
		java.lang.String tmpResult577 = s.userLabel;
out.write_string( tmpResult577 );
		java.lang.String tmpResult578 = s.nativeEMSName;
out.write_string( tmpResult578 );
		out.write_any(s.vendorExtensions);
		out.write_ulong(s.resType);
		java.lang.String tmpResult579 = s.scheduleName;
out.write_string( tmpResult579 );
		java.lang.String tmpResult580 = s.startTime;
out.write_string( tmpResult580 );
		java.lang.String tmpResult581 = s.endTime;
out.write_string( tmpResult581 );
		mtnm.tmforum.org.performance.PerformanceCreateResourceList_THelper.write(out,s.resource);
		mtnm.tmforum.org.performance.PerformanceTemplateList_THelper.write(out,s.template);
	}
}
