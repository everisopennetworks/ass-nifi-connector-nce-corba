package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL struct "AlarmRemarkInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class AlarmRemarkInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AlarmRemarkInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_THelper.id(),"AlarmRemarkInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmSerialNoList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.id(), "AlarmSerialNoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("remark", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/emsMgr/AlarmRemarkInfo_T:1.0";
	}
	public static mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T result = new mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T();
		result.alarmSerialNoList = mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.read(in);
		result.remark=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T s)
	{
		mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.write(out,s.alarmSerialNoList);
		java.lang.String tmpResult31 = s.remark;
out.write_string( tmpResult31 );
	}
}
