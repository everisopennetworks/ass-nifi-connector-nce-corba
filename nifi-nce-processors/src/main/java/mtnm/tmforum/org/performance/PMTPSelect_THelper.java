package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "PMTPSelect_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PMTPSelect_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PMTPSelect_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.PMTPSelect_THelper.id(),"PMTPSelect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("layerRateList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.id(), "LayerRateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.type())), null),new org.omg.CORBA.StructMember("pMLocationList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.PMLocationList_THelper.id(), "PMLocationList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.performance.PMLocation_THelper.type())), null),new org.omg.CORBA.StructMember("granularityList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.performance.GranularityList_THelper.id(), "GranularityList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.performance.Granularity_THelper.type())), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PMTPSelect_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.PMTPSelect_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/PMTPSelect_T:1.0";
	}
	public static mtnm.tmforum.org.performance.PMTPSelect_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.PMTPSelect_T result = new mtnm.tmforum.org.performance.PMTPSelect_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.layerRateList = mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(in);
		result.pMLocationList = mtnm.tmforum.org.performance.PMLocationList_THelper.read(in);
		result.granularityList = mtnm.tmforum.org.performance.GranularityList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.PMTPSelect_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(out,s.layerRateList);
		mtnm.tmforum.org.performance.PMLocationList_THelper.write(out,s.pMLocationList);
		mtnm.tmforum.org.performance.GranularityList_THelper.write(out,s.granularityList);
	}
}
