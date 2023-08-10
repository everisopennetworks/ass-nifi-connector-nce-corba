package mtnm.tmforum.org.notifications;


/**
 * Generated from IDL struct "CorrelatedNotifications_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class CorrelatedNotifications_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CorrelatedNotifications_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.notifications.CorrelatedNotifications_THelper.id(),"CorrelatedNotifications_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("source", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("notifIDs", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.notifications.NotifIDList_THelper.id(), "NotifIDList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.notifications.CorrelatedNotifications_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.notifications.CorrelatedNotifications_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/notifications/CorrelatedNotifications_T:1.0";
	}
	public static mtnm.tmforum.org.notifications.CorrelatedNotifications_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.notifications.CorrelatedNotifications_T result = new mtnm.tmforum.org.notifications.CorrelatedNotifications_T();
		result.source = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.notifIDs = mtnm.tmforum.org.notifications.NotifIDList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.notifications.CorrelatedNotifications_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.source);
		mtnm.tmforum.org.notifications.NotifIDList_THelper.write(out,s.notifIDs);
	}
}
