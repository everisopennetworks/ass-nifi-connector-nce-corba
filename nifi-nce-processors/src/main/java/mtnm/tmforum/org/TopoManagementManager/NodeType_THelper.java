package mtnm.tmforum.org.TopoManagementManager;
/**
 * Generated from IDL enum "NodeType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NodeType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NodeType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.TopoManagementManager.NodeType_THelper.id(),"NodeType_T",new String[]{"NODETYPE_ME","NODETYPE_TOPO_SN"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.TopoManagementManager.NodeType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.TopoManagementManager.NodeType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/TopoManagementManager/NodeType_T:1.0";
	}
	public static NodeType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return NodeType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final NodeType_T s)
	{
		out.write_long(s.value());
	}
}
