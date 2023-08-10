package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "SNCTtpInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class SNCTtpInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SNCTtpInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_THelper.id(),"SNCTtpInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("tpDirection", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.TtpDirectionHelper.id(),"TtpDirection",new String[]{"AEND","ZEND","BI"}), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCTtpInfo_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T result = new mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T();
		result.NEID=in.read_ulong();
		result.tpDirection=mtnm.tmforum.org.circuitCutMgr.TtpDirectionHelper.read(in);
		result.rate=mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.SNCTtpInfo_T s)
	{
		out.write_ulong(s.NEID);
		mtnm.tmforum.org.circuitCutMgr.TtpDirectionHelper.write(out,s.tpDirection);
		mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.write(out,s.rate);
	}
}
