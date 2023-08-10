package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL struct "QueryRedefineAlarmData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class QueryRedefineAlarmData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(QueryRedefineAlarmData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_THelper.id(),"QueryRedefineAlarmData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ruleID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("groupID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/emsMgr/QueryRedefineAlarmData_T:1.0";
	}
	public static mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T result = new mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T();
		result.ruleID=in.read_long();
		result.groupID=in.read_long();
		result.alarmID=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T s)
	{
		out.write_long(s.ruleID);
		out.write_long(s.groupID);
		out.write_long(s.alarmID);
	}
}
