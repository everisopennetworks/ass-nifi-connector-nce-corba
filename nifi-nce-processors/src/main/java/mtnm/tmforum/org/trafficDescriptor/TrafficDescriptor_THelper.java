package mtnm.tmforum.org.trafficDescriptor;


/**
 * Generated from IDL struct "TrafficDescriptor_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TrafficDescriptor_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TrafficDescriptor_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_THelper.id(),"TrafficDescriptor_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("serviceCategory", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.trafficDescriptor.ServiceCategory_THelper.id(),"ServiceCategory_T",new String[]{"SC_CBR","SC_VBRRT","SC_VBRNRT","SC_ABR","SC_UBR","SC_GFR","SC_NA"}), null),new org.omg.CORBA.StructMember("trafficParameters", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.trafficDescriptor.TrafficParameterList_THelper.id(), "TrafficParameterList_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("conformanceDefinition", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("activeState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/trafficDescriptor/TrafficDescriptor_T:1.0";
	}
	public static mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T result = new mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.serviceCategory=mtnm.tmforum.org.trafficDescriptor.ServiceCategory_THelper.read(in);
		result.trafficParameters = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.conformanceDefinition=in.read_string();
		result.activeState=in.read_boolean();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.trafficDescriptor.TrafficDescriptor_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult709 = s.userLabel;
out.write_string( tmpResult709 );
		java.lang.String tmpResult710 = s.nativeEMSName;
out.write_string( tmpResult710 );
		java.lang.String tmpResult711 = s.owner;
out.write_string( tmpResult711 );
		mtnm.tmforum.org.trafficDescriptor.ServiceCategory_THelper.write(out,s.serviceCategory);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.trafficParameters);
		java.lang.String tmpResult712 = s.conformanceDefinition;
out.write_string( tmpResult712 );
		out.write_boolean(s.activeState);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
