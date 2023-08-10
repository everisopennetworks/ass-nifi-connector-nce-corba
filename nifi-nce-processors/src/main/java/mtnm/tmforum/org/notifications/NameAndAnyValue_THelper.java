package mtnm.tmforum.org.notifications;


/**
 * Generated from IDL struct "NameAndAnyValue_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NameAndAnyValue_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(NameAndAnyValue_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.id(),"NameAndAnyValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.notifications.NameAndAnyValue_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.notifications.NameAndAnyValue_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/notifications/NameAndAnyValue_T:1.0";
	}
	public static mtnm.tmforum.org.notifications.NameAndAnyValue_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.notifications.NameAndAnyValue_T result = new mtnm.tmforum.org.notifications.NameAndAnyValue_T();
		result.name=in.read_string();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.notifications.NameAndAnyValue_T s)
	{
		java.lang.String tmpResult534 = s.name;
out.write_string( tmpResult534 );
		out.write_any(s.value);
	}
}
