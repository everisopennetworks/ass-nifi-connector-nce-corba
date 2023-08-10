package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PMMeasurement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PMMeasurement_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PMMeasurement_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMMeasurement_THelper.id(),"PMMeasurement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMParameterName_THelper.id(), "PMParameterName_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmLocation", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMLocation_THelper.id(), "PMLocation_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("intervalStatus", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PMMeasurement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PMMeasurement_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PMMeasurement_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PMMeasurement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PMMeasurement_T result = new mtnm.tmforum.org.performance.PMMeasurement_T();
		result.pmParameterName=in.read_string();
		result.pmLocation=in.read_string();
		result.value=in.read_float();
		result.unit=in.read_string();
		result.intervalStatus=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PMMeasurement_T s)
	{
		java.lang.String tmpResult552 = s.pmParameterName;
out.write_string( tmpResult552 );
		java.lang.String tmpResult553 = s.pmLocation;
out.write_string( tmpResult553 );
		out.write_float(s.value);
		java.lang.String tmpResult554 = s.unit;
out.write_string( tmpResult554 );
		java.lang.String tmpResult555 = s.intervalStatus;
out.write_string( tmpResult555 );
	}
}
