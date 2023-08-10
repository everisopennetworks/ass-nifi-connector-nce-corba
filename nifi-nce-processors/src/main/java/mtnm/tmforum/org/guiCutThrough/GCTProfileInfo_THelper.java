package mtnm.tmforum.org.guiCutThrough;


/**
 * Generated from IDL struct "GCTProfileInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class GCTProfileInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(GCTProfileInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THelper.id(),"GCTProfileInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serverLaunchCapability", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_THelper.id(),"ServerLaunchCapability_T",new String[]{"CLIENT_LAUNCH_ONLY","SERVER_LAUNCH_CAPABLE"}), null),new org.omg.CORBA.StructMember("gctHostname", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("emsGctPlatform", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("guiCutThroughDataList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.guiCutThrough.GuiCutThroughDataList_THelper.id(), "GuiCutThroughDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_THelper.id(),"GuiCutThroughData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("gctScope", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctContext", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctCommand", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/guiCutThrough/GCTProfileInfo_T:1.0";
	}
	public static mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T result = new mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T();
		result.serverLaunchCapability=mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_THelper.read(in);
		result.gctHostname=in.read_string();
		result.emsGctPlatform=in.read_string();
		result.guiCutThroughDataList = mtnm.tmforum.org.guiCutThrough.GuiCutThroughDataList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T s)
	{
		mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_THelper.write(out,s.serverLaunchCapability);
		java.lang.String tmpResult289 = s.gctHostname;
out.write_string( tmpResult289 );
		java.lang.String tmpResult290 = s.emsGctPlatform;
out.write_string( tmpResult290 );
		mtnm.tmforum.org.guiCutThrough.GuiCutThroughDataList_THelper.write(out,s.guiCutThroughDataList);
	}
}
