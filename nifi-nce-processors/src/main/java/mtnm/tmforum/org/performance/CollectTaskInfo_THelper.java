package mtnm.tmforum.org.performance;


/**
 * Generated from IDL struct "CollectTaskInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class CollectTaskInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CollectTaskInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.performance.CollectTaskInfo_THelper.id(),"CollectTaskInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("m_TaskName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_listPMTPSelect", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("m_Period", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_StartTime", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_EndTime", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_UserEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPPassWord", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("m_FTPAddress", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUpload", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.CollectTaskInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.performance.CollectTaskInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/performance/CollectTaskInfo_T:1.0";
	}
	public static mtnm.tmforum.org.performance.CollectTaskInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.performance.CollectTaskInfo_T result = new mtnm.tmforum.org.performance.CollectTaskInfo_T();
		result.m_TaskName=in.read_string();
		result.m_listPMTPSelect = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.m_Period=in.read_string();
		result.m_StartTime=in.read_string();
		result.m_EndTime=in.read_string();
		result.m_UserEMSName=in.read_string();
		result.m_FTPName=in.read_string();
		result.m_FTPPassWord=in.read_string();
		result.m_FTPAddress=in.read_string();
		result.forceUpload=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.performance.CollectTaskInfo_T s)
	{
		java.lang.String tmpResult568 = s.m_TaskName;
out.write_string( tmpResult568 );
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.m_listPMTPSelect);
		java.lang.String tmpResult569 = s.m_Period;
out.write_string( tmpResult569 );
		java.lang.String tmpResult570 = s.m_StartTime;
out.write_string( tmpResult570 );
		java.lang.String tmpResult571 = s.m_EndTime;
out.write_string( tmpResult571 );
		java.lang.String tmpResult572 = s.m_UserEMSName;
out.write_string( tmpResult572 );
		java.lang.String tmpResult573 = s.m_FTPName;
out.write_string( tmpResult573 );
		java.lang.String tmpResult574 = s.m_FTPPassWord;
out.write_string( tmpResult574 );
		java.lang.String tmpResult575 = s.m_FTPAddress;
out.write_string( tmpResult575 );
		out.write_boolean(s.forceUpload);
	}
}
