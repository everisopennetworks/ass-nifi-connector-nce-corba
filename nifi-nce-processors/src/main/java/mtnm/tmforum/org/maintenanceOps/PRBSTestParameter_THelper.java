package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL struct "PRBSTestParameter_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PRBSTestParameter_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PRBSTestParameter_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_THelper.id(),"PRBSTestParameter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("testDuration", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.id(),"TestDuration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)}), null),new org.omg.CORBA.StructMember("sampleGranularity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.maintenanceOps.SampleGranularity_THelper.id(), "SampleGranularity_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("testType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.maintenanceOps.PRBSTestType_THelper.id(), "PRBSTestType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("accumulatingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/maintenanceOps/PRBSTestParameter_T:1.0";
	}
	public static mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T result = new mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T();
		result.tpName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.testDuration=mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.read(in);
		result.sampleGranularity=in.read_string();
		result.testType=in.read_string();
		result.accumulatingIndicator=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.tpName);
		mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.write(out,s.testDuration);
		java.lang.String tmpResult453 = s.sampleGranularity;
out.write_string( tmpResult453 );
		java.lang.String tmpResult454 = s.testType;
out.write_string( tmpResult454 );
		out.write_boolean(s.accumulatingIndicator);
	}
}
