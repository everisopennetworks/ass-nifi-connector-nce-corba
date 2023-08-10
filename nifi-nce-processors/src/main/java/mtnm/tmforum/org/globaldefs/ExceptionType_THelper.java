package mtnm.tmforum.org.globaldefs;
/**
 * Generated from IDL enum "ExceptionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ExceptionType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ExceptionType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ExceptionType_THelper.id(),"ExceptionType_T",new String[]{"EXCPT_NOT_IMPLEMENTED","EXCPT_INTERNAL_ERROR","EXCPT_INVALID_INPUT","EXCPT_OBJECT_IN_USE","EXCPT_TP_INVALID_ENDPOINT","EXCPT_ENTITY_NOT_FOUND","EXCPT_TIMESLOT_IN_USE","EXCPT_PROTECTION_EFFORT_NOT_MET","EXCPT_NOT_IN_VALID_STATE","EXCPT_UNABLE_TO_COMPLY","EXCPT_NE_COMM_LOSS","EXCPT_CAPACITY_EXCEEDED","EXCPT_ACCESS_DENIED","EXCPT_TOO_MANY_OPEN_ITERATORS","EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS","EXCPT_USERLABEL_IN_USE"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.globaldefs.ExceptionType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.globaldefs.ExceptionType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/globaldefs/ExceptionType_T:1.0";
	}
	public static ExceptionType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ExceptionType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ExceptionType_T s)
	{
		out.write_long(s.value());
	}
}
