package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL struct "RedefineAlarmData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class RedefineAlarmData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(RedefineAlarmData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.emsMgr.RedefineAlarmData_THelper.id(),"RedefineAlarmData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ruleID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("groupID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("alarmID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("redefinedSeverity", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.id(),"PerceivedSeverity_T",new String[]{"PS_INDETERMINATE","PS_CRITICAL","PS_MAJOR","PS_MINOR","PS_WARNING","PS_CLEARED"}), null),new org.omg.CORBA.StructMember("objectList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("redefineInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.emsMgr.RedefineAlarmData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.emsMgr.RedefineAlarmData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/emsMgr/RedefineAlarmData_T:1.0";
	}
	public static mtnm.tmforum.org.emsMgr.RedefineAlarmData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.emsMgr.RedefineAlarmData_T result = new mtnm.tmforum.org.emsMgr.RedefineAlarmData_T();
		result.ruleID=in.read_long();
		result.groupID=in.read_long();
		result.alarmID=in.read_long();
		result.redefinedSeverity=mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.read(in);
		result.objectList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.redefineInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.emsMgr.RedefineAlarmData_T s)
	{
		out.write_long(s.ruleID);
		out.write_long(s.groupID);
		out.write_long(s.alarmID);
		mtnm.tmforum.org.notifications.PerceivedSeverity_THelper.write(out,s.redefinedSeverity);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.objectList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.redefineInfo);
	}
}
