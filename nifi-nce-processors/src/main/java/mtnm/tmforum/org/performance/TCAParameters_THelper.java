package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "TCAParameters_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TCAParameters_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TCAParameters_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.TCAParameters_THelper.id(),"TCAParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("granularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.Granularity_THelper.id(), "Granularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("tcaTypeValues", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMThresholdValueList_THelper.id(), "PMThresholdValueList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMThresholdValue_THelper.id(),"PMThresholdValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMParameterName_THelper.id(), "PMParameterName_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmLocation", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMLocation_THelper.id(), "PMLocation_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("thresholdType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.PMThresholdType_THelper.id(),"PMThresholdType_T",new String[]{"TWM_HIGHEST","TWM_HIGH","TWM_LOW","TWM_LOWEST"}), null),new org.omg.CORBA.StructMember("triggerFlag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.TCAParameters_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.TCAParameters_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/TCAParameters_T:1.0";
	}
	public static mtnm.tmforum.org.performance.TCAParameters_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.TCAParameters_T result = new mtnm.tmforum.org.performance.TCAParameters_T();
		result.layerRate=in.read_short();
		result.granularity=in.read_string();
		result.tcaTypeValues = mtnm.tmforum.org.performance.PMThresholdValueList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.TCAParameters_T s)
	{
		out.write_short(s.layerRate);
		java.lang.String tmpResult561 = s.granularity;
out.write_string( tmpResult561 );
		mtnm.tmforum.org.performance.PMThresholdValueList_THelper.write(out,s.tcaTypeValues);
	}
}
