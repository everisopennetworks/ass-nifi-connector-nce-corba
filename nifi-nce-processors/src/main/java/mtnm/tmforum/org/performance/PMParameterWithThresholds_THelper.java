package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PMParameterWithThresholds_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PMParameterWithThresholds_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PMParameterWithThresholds_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMParameterWithThresholds_THelper.id(),"PMParameterWithThresholds_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMParameterName_THelper.id(), "PMParameterName_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("pmThresholdList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMThresholdList_THelper.id(), "PMThresholdList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMThreshold_THelper.id(),"PMThreshold_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("thresholdType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.performance.PMThresholdType_THelper.id(),"PMThresholdType_T",new String[]{"TWM_HIGHEST","TWM_HIGH","TWM_LOW","TWM_LOWEST"}), null),new org.omg.CORBA.StructMember("triggerFlag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PMParameterWithThresholds_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PMParameterWithThresholds_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PMParameterWithThresholds_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PMParameterWithThresholds_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PMParameterWithThresholds_T result = new mtnm.tmforum.org.performance.PMParameterWithThresholds_T();
		result.pmParameterName=in.read_string();
		result.pmThresholdList = mtnm.tmforum.org.performance.PMThresholdList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PMParameterWithThresholds_T s)
	{
		java.lang.String tmpResult563 = s.pmParameterName;
out.write_string( tmpResult563 );
		mtnm.tmforum.org.performance.PMThresholdList_THelper.write(out,s.pmThresholdList);
	}
}
