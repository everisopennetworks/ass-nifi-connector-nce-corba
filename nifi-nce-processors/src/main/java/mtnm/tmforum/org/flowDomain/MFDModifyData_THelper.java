package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL struct "MFDModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MFDModifyData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MFDModifyData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.MFDModifyData_THelper.id(),"MFDModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.MFDModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.MFDModifyData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/MFDModifyData_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomain.MFDModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomain.MFDModifyData_T result = new mtnm.tmforum.org.flowDomain.MFDModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomain.MFDModifyData_T s)
	{
		java.lang.String tmpResult150 = s.userLabel;
out.write_string( tmpResult150 );
		out.write_boolean(s.forceUniqueness);
		java.lang.String tmpResult151 = s.owner;
out.write_string( tmpResult151 );
		java.lang.String tmpResult152 = s.networkAccessDomain;
out.write_string( tmpResult152 );
	}
}
