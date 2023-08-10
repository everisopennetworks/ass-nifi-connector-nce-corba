package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL struct "PRBSTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PRBSTestResult_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PRBSTestResult_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.PRBSTestResult_THelper.id(),"PRBSTestResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("testPara", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.id(),"PRBSTestParameter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("testDuration", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.id(),"TestDuration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)}), null),new org.omg.CORBA.StructMember("sampleGranularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.maintenanceOps.SampleGranularity_THelper.id(), "SampleGranularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("testType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.maintenanceOps.PRBSTestType_THelper.id(), "PRBSTestType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("accumulatingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)}), null),new org.omg.CORBA.StructMember("startTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("sampleResultList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.maintenanceOps.SampleResultList_THelper.id(), "SampleResultList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.SampleResult_THelper.id(),"SampleResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sampleTime", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.Time_THelper.id(), "Time_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}))), null),new org.omg.CORBA.StructMember("totalBitError", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("realDuration", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.id(),"TestDuration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/maintenanceOps/PRBSTestResult_T:1.0";
	}
	public static mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T result = new mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T();
		result.testPara=mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.read(in);
		result.startTime=in.read_string();
		result.sampleResultList = mtnm.tmforum.org.maintenanceOps.SampleResultList_THelper.read(in);
		result.totalBitError=in.read_ulong();
		result.realDuration=mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.maintenanceOps.PRBSTestResult_T s)
	{
		mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.write(out,s.testPara);
		java.lang.String tmpResult455 = s.startTime;
out.write_string( tmpResult455 );
		mtnm.tmforum.org.maintenanceOps.SampleResultList_THelper.write(out,s.sampleResultList);
		out.write_ulong(s.totalBitError);
		mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.write(out,s.realDuration);
	}
}
