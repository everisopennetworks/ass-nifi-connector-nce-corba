package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL exception "ProcessingFailureException".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProcessingFailureExceptionHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProcessingFailureExceptionHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(mtnm.tmforum.org.circuitCutMgr.ProcessingFailureExceptionHelper.id(),"ProcessingFailureException",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("exceptionType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.ExceptionType_THelper.id(),"ExceptionType_T",new String[]{"EXCPT_NOT_IMPLEMENTED","EXCPT_INTERNAL_ERROR","EXCPT_INVALID_INPUT","EXCPT_OBJECT_IN_USE","EXCPT_TP_INVALID_ENDPOINT","EXCPT_ENTITY_NOT_FOUND","EXCPT_TIMESLOT_IN_USE","EXCPT_PROTECTION_EFFORT_NOT_MET","EXCPT_NOT_IN_VALID_STATE","EXCPT_UNABLE_TO_COMPLY","EXCPT_NE_COMM_LOSS","EXCPT_CAPACITY_EXCEEDED","EXCPT_ACCESS_DENIED","EXCPT_TOO_MANY_OPEN_ITERATORS","EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS","EXCPT_USERLABEL_IN_USE"}), null),new org.omg.CORBA.StructMember("errorReason", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		mtnm.tmforum.org.circuitCutMgr.ExceptionType_T x0;
		x0=mtnm.tmforum.org.circuitCutMgr.ExceptionType_THelper.read(in);
		java.lang.String x1;
		x1=in.read_string();
		final mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException result = new mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException(id, x0, x1);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.ProcessingFailureException s)
	{
		out.write_string(id());
		mtnm.tmforum.org.circuitCutMgr.ExceptionType_THelper.write(out,s.exceptionType);
		java.lang.String tmpResult2 = s.errorReason;
out.write_string( tmpResult2 );
	}
}
