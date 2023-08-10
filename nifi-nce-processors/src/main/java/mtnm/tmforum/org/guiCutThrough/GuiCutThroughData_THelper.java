package mtnm.tmforum.org.guiCutThrough;


/**
 * Generated from IDL struct "GuiCutThroughData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class GuiCutThroughData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(GuiCutThroughData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_THelper.id(),"GuiCutThroughData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("gctScope", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctContext", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("gctCommand", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/guiCutThrough/GuiCutThroughData_T:1.0";
	}
	public static mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T result = new mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T();
		result.gctScope=in.read_string();
		result.gctContext=in.read_string();
		result.gctCommand=in.read_string();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T s)
	{
		java.lang.String tmpResult286 = s.gctScope;
out.write_string( tmpResult286 );
		java.lang.String tmpResult287 = s.gctContext;
out.write_string( tmpResult287 );
		java.lang.String tmpResult288 = s.gctCommand;
out.write_string( tmpResult288 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
