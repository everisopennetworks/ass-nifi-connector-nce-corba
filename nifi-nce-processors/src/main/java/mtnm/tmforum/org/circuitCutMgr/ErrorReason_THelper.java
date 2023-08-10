package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "ErrorReason_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ErrorReason_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ErrorReason_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.ErrorReason_THelper.id(),"ErrorReason_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("strObjName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("errorReason", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("strOperDesc", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.ErrorReason_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.ErrorReason_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ErrorReason_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.ErrorReason_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.ErrorReason_T result = new mtnm.tmforum.org.circuitCutMgr.ErrorReason_T();
		result.strObjName=in.read_string();
		result.errorReason=in.read_ulong();
		result.strOperDesc=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.ErrorReason_T s)
	{
		java.lang.String tmpResult5 = s.strObjName;
out.write_string( tmpResult5 );
		out.write_ulong(s.errorReason);
		java.lang.String tmpResult6 = s.strOperDesc;
out.write_string( tmpResult6 );
	}
}
