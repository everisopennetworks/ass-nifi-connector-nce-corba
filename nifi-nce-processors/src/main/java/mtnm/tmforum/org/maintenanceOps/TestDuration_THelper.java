package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL struct "TestDuration_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TestDuration_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TestDuration_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.TestDuration_THelper.id(),"TestDuration_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.maintenanceOps.TestDuration_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.maintenanceOps.TestDuration_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/maintenanceOps/TestDuration_T:1.0";
	}
	public static mtnm.tmforum.org.maintenanceOps.TestDuration_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.maintenanceOps.TestDuration_T result = new mtnm.tmforum.org.maintenanceOps.TestDuration_T();
		result.value=in.read_ulong();
		result.unit=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.maintenanceOps.TestDuration_T s)
	{
		out.write_ulong(s.value);
		java.lang.String tmpResult449 = s.unit;
out.write_string( tmpResult449 );
	}
}
