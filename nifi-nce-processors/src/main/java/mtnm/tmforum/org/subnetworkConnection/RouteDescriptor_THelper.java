package mtnm.tmforum.org.subnetworkConnection;


/**
 * Generated from IDL struct "RouteDescriptor_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class RouteDescriptor_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RouteDescriptor_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_THelper.id(),"RouteDescriptor_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("intended", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("actualState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("inUseBy", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("exclusive", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("routeXCs", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.Route_THelper.id(), "Route_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.CrossConnect_THelper.id(),"CrossConnect_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("active", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("ccType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.subnetworkConnection.SNCType_THelper.id(),"SNCType_T",new String[]{"ST_SIMPLE","ST_ADD_DROP_A","ST_ADD_DROP_Z","ST_INTERCONNECT","ST_DOUBLE_INTERCONNECT","ST_DOUBLE_ADD_DROP","ST_OPEN_ADD_DROP","ST_EXPLICIT"}), null),new org.omg.CORBA.StructMember("aEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("zEndNameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteDescriptor_T:1.0";
	}
	public static mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T result = new mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T();
		result.id=in.read_string();
		result.intended=in.read_string();
		result.actualState=in.read_string();
		result.administrativeState=in.read_string();
		result.inUseBy=in.read_string();
		result.exclusive=in.read_string();
		result.routeXCs = mtnm.tmforum.org.subnetworkConnection.Route_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.subnetworkConnection.RouteDescriptor_T s)
	{
		java.lang.String tmpResult670 = s.id;
out.write_string( tmpResult670 );
		java.lang.String tmpResult671 = s.intended;
out.write_string( tmpResult671 );
		java.lang.String tmpResult672 = s.actualState;
out.write_string( tmpResult672 );
		java.lang.String tmpResult673 = s.administrativeState;
out.write_string( tmpResult673 );
		java.lang.String tmpResult674 = s.inUseBy;
out.write_string( tmpResult674 );
		java.lang.String tmpResult675 = s.exclusive;
out.write_string( tmpResult675 );
		mtnm.tmforum.org.subnetworkConnection.Route_THelper.write(out,s.routeXCs);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
