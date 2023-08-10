package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PmMonitorConditioning_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PmMonitorConditioning_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PmMonitorConditioning_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PmMonitorConditioning_THelper.id(),"PmMonitorConditioning_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("granularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.Granularity_THelper.id(), "Granularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("startTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("endTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmScheduleName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("templateName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("template", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceTemplate_THelper.id(),"PerformanceTemplate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}), null),new org.omg.CORBA.StructMember("intanceType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PmMonitorConditioning_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PmMonitorConditioning_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PmMonitorConditioning_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PmMonitorConditioning_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PmMonitorConditioning_T result = new mtnm.tmforum.org.performance.PmMonitorConditioning_T();
		result.granularity=in.read_string();
		result.startTime=in.read_string();
		result.endTime=in.read_string();
		result.pmScheduleName=in.read_string();
		result.templateID=in.read_string();
		result.templateName=in.read_string();
		result.template=mtnm.tmforum.org.performance.PerformanceTemplate_THelper.read(in);
		result.intanceType=mtnm.tmforum.org.performance.InstanceEnum_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PmMonitorConditioning_T s)
	{
		java.lang.String tmpResult582 = s.granularity;
out.write_string( tmpResult582 );
		java.lang.String tmpResult583 = s.startTime;
out.write_string( tmpResult583 );
		java.lang.String tmpResult584 = s.endTime;
out.write_string( tmpResult584 );
		java.lang.String tmpResult585 = s.pmScheduleName;
out.write_string( tmpResult585 );
		java.lang.String tmpResult586 = s.templateID;
out.write_string( tmpResult586 );
		java.lang.String tmpResult587 = s.templateName;
out.write_string( tmpResult587 );
		mtnm.tmforum.org.performance.PerformanceTemplate_THelper.write(out,s.template);
		mtnm.tmforum.org.performance.InstanceEnum_THelper.write(out,s.intanceType);
	}
}
