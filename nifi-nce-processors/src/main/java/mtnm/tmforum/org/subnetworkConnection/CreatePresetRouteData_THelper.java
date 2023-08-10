package mtnm.tmforum.org.subnetworkConnection;


/**
 * Generated from IDL struct "CreatePresetRouteData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class CreatePresetRouteData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CreatePresetRouteData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_THelper.id(),"CreatePresetRouteData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sncName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("presetRouteID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("priority", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("neTpInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("neTpSncExclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.id(), "ResourceList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.subnetworkConnection.Resource_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/subnetworkConnection/CreatePresetRouteData_T:1.0";
	}
	public static mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T result = new mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T();
		result.sncName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.presetRouteID=in.read_ulong();
		result.priority=in.read_ulong();
		result.neTpInclusions = mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.read(in);
		result.neTpSncExclusions = mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.subnetworkConnection.CreatePresetRouteData_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.sncName);
		out.write_ulong(s.presetRouteID);
		out.write_ulong(s.priority);
		mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		mtnm.tmforum.org.subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
