package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL struct "EthernetLTTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthernetLTTestResult_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthernetLTTestResult_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetLTTestResult_THelper.id(),"EthernetLTTestResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("oamPointName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hopNumber", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("result", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetLTTestResult_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T result = new mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T();
		result.oamPointName=in.read_string();
		result.hopNumber=in.read_ulong();
		result.result=in.read_boolean();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomain.EthernetLTTestResult_T s)
	{
		java.lang.String tmpResult155 = s.oamPointName;
out.write_string( tmpResult155 );
		out.write_ulong(s.hopNumber);
		out.write_boolean(s.result);
	}
}
