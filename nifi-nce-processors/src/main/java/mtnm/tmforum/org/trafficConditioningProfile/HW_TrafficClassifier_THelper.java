package mtnm.tmforum.org.trafficConditioningProfile;


/**
 * Generated from IDL struct "HW_TrafficClassifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_TrafficClassifier_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_TrafficClassifier_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_THelper.id(),"HW_TrafficClassifier_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("classifierID", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("logicalRelationType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("action", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.id(), "LayeredParameterList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/trafficConditioningProfile/HW_TrafficClassifier_T:1.0";
	}
	public static mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T result = new mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T();
		result.classifierID=in.read_string();
		result.logicalRelationType=in.read_string();
		result.action=in.read_string();
		result.transmissionParams = mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.trafficConditioningProfile.HW_TrafficClassifier_T s)
	{
		java.lang.String tmpResult690 = s.classifierID;
out.write_string( tmpResult690 );
		java.lang.String tmpResult691 = s.logicalRelationType;
out.write_string( tmpResult691 );
		java.lang.String tmpResult692 = s.action;
out.write_string( tmpResult692 );
		mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
	}
}
