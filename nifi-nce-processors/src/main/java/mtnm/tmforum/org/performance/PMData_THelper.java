package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PMData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PMData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PMData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMData_THelper.id(),"PMData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("granularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.Granularity_THelper.id(), "Granularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("retrievalTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmMeasurementList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMMeasurementList_THelper.id(), "PMMeasurementList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMMeasurement_THelper.id(),"PMMeasurement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMParameterName_THelper.id(), "PMParameterName_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmLocation", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMLocation_THelper.id(), "PMLocation_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("intervalStatus", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PMData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PMData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PMData_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PMData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PMData_T result = new mtnm.tmforum.org.performance.PMData_T();
		result.tpName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.layerRate=in.read_short();
		result.granularity=in.read_string();
		result.retrievalTime=in.read_string();
		result.pmMeasurementList = mtnm.tmforum.org.performance.PMMeasurementList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PMData_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.tpName);
		out.write_short(s.layerRate);
		java.lang.String tmpResult558 = s.granularity;
out.write_string( tmpResult558 );
		java.lang.String tmpResult559 = s.retrievalTime;
out.write_string( tmpResult559 );
		mtnm.tmforum.org.performance.PMMeasurementList_THelper.write(out,s.pmMeasurementList);
	}
}
