package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "Severity_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Severity_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Severity_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.Severity_THelper.id(),"Severity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("currentSeverity", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.id(),"PerceivedSeverity_T",new String[]{"PS_INDETERMINATE","PS_CRITICAL","PS_MAJOR","PS_MINOR","PS_WARNING","PS_CLEARED"}), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("eqtType", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.Severity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.Severity_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/Severity_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.Severity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.Severity_T result = new mtnm.tmforum.org.equipment.Severity_T();
		result.probableCause=in.read_string();
		result.currentSeverity=mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.read(in);
		result.alarmID=in.read_long();
		result.eqtType=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.Severity_T s)
	{
		java.lang.String tmpResult122 = s.probableCause;
out.write_string( tmpResult122 );
		mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.write(out,s.currentSeverity);
		out.write_long(s.alarmID);
		out.write_long(s.eqtType);
	}
}
