package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "ConnectivityNodePair_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ConnectivityNodePair_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ConnectivityNodePair_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_THelper.id(),"ConnectivityNodePair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ConnectivityNodePair_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T result = new mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T();
		result.aEnd=in.read_ulong();
		result.zEnd=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T s)
	{
		out.write_ulong(s.aEnd);
		out.write_ulong(s.zEnd);
	}
}
