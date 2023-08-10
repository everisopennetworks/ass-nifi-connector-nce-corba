package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL struct "EndTPFaultStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EndTPFaultStatus_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EndTPFaultStatus_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.emsMgr.EndTPFaultStatus_THelper.id(),"EndTPFaultStatus_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("endTP", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("status", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("position", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/emsMgr/EndTPFaultStatus_T:1.0";
	}
	public static mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T result = new mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T();
		result.endTP = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.status=in.read_string();
		result.position=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.endTP);
		java.lang.String tmpResult27 = s.status;
out.write_string( tmpResult27 );
		java.lang.String tmpResult28 = s.position;
out.write_string( tmpResult28 );
	}
}
