package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "ServiceState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ServiceState_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServiceState_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.ServiceState_THelper.id(),"ServiceState_T",new String[]{"IN_SERVICE","OUT_OF_SERVICE","OUT_OF_SERVICE_BY_MAINTENANCE","SERV_NA"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.ServiceState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.ServiceState_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/ServiceState_T:1.0";
	}
	public static ServiceState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServiceState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServiceState_T s)
	{
		out.write_long(s.value());
	}
}
