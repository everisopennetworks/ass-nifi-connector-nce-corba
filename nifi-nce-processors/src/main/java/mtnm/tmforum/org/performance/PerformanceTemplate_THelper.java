package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PerformanceTemplate_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PerformanceTemplate_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PerformanceTemplate_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PerformanceTemplate_THelper.id(),"PerformanceTemplate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.InstanceEnum_THelper.id(),"InstanceEnum_T",new String[]{"DATA","TCA"}), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PerformanceTemplate_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PerformanceTemplate_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PerformanceTemplate_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PerformanceTemplate_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PerformanceTemplate_T result = new mtnm.tmforum.org.performance.PerformanceTemplate_T();
		result.id=in.read_ulong();
		result.name=in.read_string();
		result.type=mtnm.tmforum.org.performance.InstanceEnum_THelper.read(in);
		result.period=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PerformanceTemplate_T s)
	{
		out.write_ulong(s.id);
		java.lang.String tmpResult576 = s.name;
out.write_string( tmpResult576 );
		mtnm.tmforum.org.performance.InstanceEnum_THelper.write(out,s.type);
		out.write_ulong(s.period);
	}
}
