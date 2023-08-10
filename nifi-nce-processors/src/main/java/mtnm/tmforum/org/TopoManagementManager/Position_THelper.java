package mtnm.tmforum.org.TopoManagementManager;


/**
 * Generated from IDL struct "Position_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Position_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Position_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.TopoManagementManager.Position_THelper.id(),"Position_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("xPos", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("yPos", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.TopoManagementManager.Position_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.TopoManagementManager.Position_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/TopoManagementManager/Position_T:1.0";
	}
	public static mtnm.tmforum.org.TopoManagementManager.Position_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.TopoManagementManager.Position_T result = new mtnm.tmforum.org.TopoManagementManager.Position_T();
		result.xPos=in.read_long();
		result.yPos=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.TopoManagementManager.Position_T s)
	{
		out.write_long(s.xPos);
		out.write_long(s.yPos);
	}
}
